package SearchSort;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		insertionSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}												

	private static void insertionSort(int[] arr) 
	{
		int temp,ptr;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			ptr=i-1;
			while(arr[ptr] > temp)
			{
				arr[ptr+1] = arr[ptr];
				ptr--;
				if(ptr == -1) 
					break;
			}
			arr[ptr+1]=temp;
		}
	}
}
