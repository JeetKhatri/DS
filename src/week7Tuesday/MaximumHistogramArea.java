package week7Tuesday;

import java.util.Scanner;

public class MaximumHistogramArea {

	int area=0;
	static int ii=0,cnt=0,maxArea=-1;
	static StackProgram stack = new StackProgram();
	public static void main(String[] args) {

		MaximumHistogramArea ms = new MaximumHistogramArea();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int limit = sc.nextInt();
		int arr[] = new int[limit];
		for (int i = 0; i < limit; i++) {				 //    i = stack.totalEliment();
			arr[i] = sc.nextInt();                       //    top = stack.top
		}		
		int[] temparr = arr;
		int notemp=0;
		while(cnt!=limit){
			ms.insertIntoStack(arr);  
			ii = stack.totalEliment();
			ms.findArea(arr);
			int a[] = new int[limit-cnt];
			int c = cnt,temp=0;
			for (int i=c; i < arr.length; i++,temp++) {
				a[temp] = arr[c];
			}
			arr = a;
			notemp+=ii;
		}
		
		/*if(cnt==limit){
			stack.push(temparr[cnt-1]+"");
			int temp[] = {temparr[cnt-1]};
			ii = limit;
			ms.findArea(temp);
		}*/
		System.out.println("maxArea : "+maxArea);
	}

	private void findArea(int arr[]) {
		while(!stack.isEmpty())
		{
			int no = arr[stack.top];
			stack.pop();
			if(stack.isEmpty()){
				area = no *ii;
			}else{
				area = no * (ii - stack.top() - 1);
			}
			if(maxArea < area) 
				maxArea = area;
		}
		
	}

	private void insertIntoStack(int[] arr) {
		int x = arr[0];
		for(int i=0;i<arr.length;i++)
			if(x <= arr[i]){
				cnt++;
				stack.push(i+"");
			}else
				break;
	}
}
