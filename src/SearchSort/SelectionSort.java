package SearchSort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		selectionSort(arr);
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}												// find smallest value from the rest of the element and interchange their value

	private static void selectionSort(int[] arr) 
	{
		for (int i = 0; i < arr.length; i++) {
			int min = i;
			for (int j = i+1; j < arr.length; j++) {
				if(arr[min] > arr[j]){
					min =j;
				}
			}
			int temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
	}
}
