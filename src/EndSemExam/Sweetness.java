package EndSemExam;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Sweetness {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		Sweetness sw = new Sweetness();
		int N = sc.nextInt();
		int K = sc.nextInt(); //sweetness
		int arr[] = new int[N];
		int temp[];
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
		int cnt=0,i,j;
		while(arr[0] < K){
			int sweetness = (1*arr[0])+(2*arr[1]);
			temp = new int[arr.length-1];
			for (i = 2,j=0; i < arr.length; i++,j++) {
				temp[j] = arr[i];
			}
			temp[j]=sweetness;
			Arrays.sort(temp);
			arr=temp;
			for (int k = 0; k < temp.length; k++) {
				System.out.print(temp[k]+ " ");
			}
			System.out.println();
			if(arr.length==1){
				cnt=-1;break;
			}else{
				cnt++;
			}
			System.out.println(cnt+" <- cnt");
		}
		System.out.println(cnt);
	}
	
}
