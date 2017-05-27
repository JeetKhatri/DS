package week7Tuesday;

import java.util.Scanner;

public class FinalQ7 {
	
	static int area=0;
	static int ii=0,cnt=0,maxArea=-1;
	static int i=0;
	static StackProgram stack = new StackProgram();
	
	public static void main(String[] args) {

		FinalQ7 ms = new FinalQ7();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int limit = sc.nextInt();
		int arr[] = new int[limit];
		for (int i = 0; i < limit; i++) {				 //    i = stack.totalEliment();
			arr[i] = sc.nextInt();                       //    top = stack.top
		}		
		
		ms.insertIntoStack(arr);  
		ms.findArea(arr);
		System.out.println("maxArea : "+maxArea);
	}
	private void findArea(int[] arr) 
	{
		while(!stack.isEmpty())
		{
			int tt = Integer.parseInt(stack.pop());
			if(stack.isEmpty()){
				area = arr[tt] *i;
			}else{
				area = arr[tt] * (i - stack.top() - 1);
			}
			if(maxArea < area) 
				maxArea = area;
		}
	}
	private void insertIntoStack(int[] arr) {
		
		for ( i = 0; i < arr.length;) {
			if(stack.isEmpty() || arr[stack.top()] <= arr[i])
			{
				stack.push(i+"");
				i++;
			}else{
				int tt = Integer.parseInt(stack.pop());
				if(stack.isEmpty()){
					area = arr[tt] *i;
				}else{
					area = arr[tt] * (i - stack.top() - 1);
				}
				if(maxArea < area) 
					maxArea = area;
			}
		}
	}
}