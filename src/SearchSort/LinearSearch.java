package SearchSort;

import java.util.Scanner;

public class LinearSearch {

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
		if(linearSearch(arr,n,no))
			System.out.println("Found");
		else
			System.out.println("Not found.");
	}

	private static boolean linearSearch(int[] arr, int n, int no) {

		for (int i = 0; i < n; i++)
        {
            if (arr[i] == no)
                return true;
        }
		return false;
	}
	

}
