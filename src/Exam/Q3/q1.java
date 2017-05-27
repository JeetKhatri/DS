package Exam.Q3;

import java.util.Scanner;

public class q1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter k element : ");
		int no = sc.nextInt();
		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-1;j++){
			//	if(arr[j] > arr[j-1]){
					int temp = arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
			//	}
			}
		}
		System.out.println("END");
		for(int i=0;i<n;i++){
			System.out.println(arr[i]+ " ");
		}
	}
}
