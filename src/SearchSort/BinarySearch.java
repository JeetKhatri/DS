package SearchSort;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter "+n+" Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter eliment to search : ");
		int no = sc.nextInt();
		Arrays.sort(arr);
		if(binarySearch(arr,0,n-1,no))
			System.out.println("Found");
		else
			System.out.println("Not found.");
	}

	private static boolean binarySearch(int[] arr, int low, int high, int no) {

		if(high >= low)
		{
			int mid = low + (high - low)/2;
			if(arr[mid] == no)
				return true;
			else if(arr[mid] > no)
				return binarySearch(arr,low,mid-1,no);
			else if(arr[mid] < no)
				return binarySearch(arr,mid+1,high,no);
		}
		return false;
	}
	

}
