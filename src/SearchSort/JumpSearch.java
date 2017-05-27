package SearchSort;

import java.util.Arrays;
import java.util.Scanner;

public class JumpSearch {

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
		if(jumpSearch(arr,n,no))
			System.out.println("Found");
		else
			System.out.println("Not found.");
	}

	private static boolean jumpSearch(int[] arr,int length,int key) {

		int left = 0;
		int jumpCnt = (int)Math.floor(Math.sqrt(length));
		int right = jumpCnt;
		
		while(right < length && arr[right] <= key){
			
			left=right;
			right+=jumpCnt;
			
			if(right > length-1)
				right = length;
			
		}
		
		for (int i = left; i < right; i++) {
			if(arr[i] == key){
				return true;
			}
		}
		return false;
	}
	

}
