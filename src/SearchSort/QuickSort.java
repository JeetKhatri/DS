package SearchSort;

import java.util.Scanner;

public class QuickSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		quickSort(arr,0,arr.length-1);
		System.out.println("Ans:-");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}

	private static void quickSort(int[] arr, int start,int end) {

		if(start < end){
			int pIndex = partition(arr,start,end);
			quickSort(arr, start, pIndex-1);
			quickSort(arr, pIndex+1, end);
		}
		
	}

	private static int partition(int[] arr, int start, int end) 
	{
		int pivot = arr[end];
		int pIndex = start;
		for (int i = start; i < end; i++) {
			if(arr[i] < pivot){
				int temp = arr[i];
				arr[i] = arr[pIndex];
				arr[pIndex] = temp;
				pIndex++;
			}
		}
		int temp = arr[pIndex];
		arr[pIndex] = arr[end];
		arr[end] = temp;
		return pIndex;
	}												
}
