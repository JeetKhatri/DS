package SearchSort;

import java.util.Scanner;

public class MergeSort {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		mergeSort(arr);
		System.out.println("Ans:-");
		for (int i = 0; i < n; i++) {
			System.out.println(arr[i]);
		}
	}												

	private static void mergeSort(int[] arr) 
	{
		int n = arr.length;
		if(n < 2)
			return;
		int mid = n/2;
		int[] arrLeft = new int[mid];
		int[] arrRight = new int[n-mid];
		int k=0;
		for (int i = 0; i < arrLeft.length; i++) {
			arrLeft[i] = arr[k++];
		}
		for (int i = 0; i < arrRight.length; i++) {
			arrRight[i] = arr[k++];
		}
		mergeSort(arrLeft);
		mergeSort(arrRight);
		merge(arr,arrLeft,arrRight);
	}

	private static void merge(int[] arr, int[] arrLeft, int[] arrRight) {

		int nl = arrLeft.length;
		int nr = arrRight.length;
		int j=0,i=0,k=0;
		while(i<nl && j<nr){
			if(arrLeft[i] > arrRight[j]){
				arr[k] = arrRight[j];
				j++;
			}else{
				arr[k] = arrLeft[i];
				i++;
			}
			k++;
		}
		while(i<nl){
			arr[k] = arrLeft[i];
			i++;
			k++;
		}
		while(j<nr){
			arr[k] = arrRight[j];
			j++;
			k++;
		}
	}
}
