package SearchSort;

import java.util.Arrays;
import java.util.Scanner;

public class InterpolationSearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter limit : ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.println("Enter " + n + " Element : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter eliment to search : ");
		int no = sc.nextInt();
		Arrays.sort(arr);
		int ans = interpolationSearch(arr, n, no);
		if (ans != -1)
			System.out.println("Found At index " + ans);
		else
			System.out.println("Not found.");
	}

	private static int interpolationSearch(int[] arr, int length, int key) {

		int left = 0;
		int right = length - 1;

		while (left <= right && arr[left] <= key && arr[right] >= key) {
			int indexRange = right - left;
			int valueRange = arr[right] - arr[left];
			int fraction = indexRange / valueRange;
			int pos = left + fraction * (key - arr[left]);
			if (arr[pos] == key)
	            return pos;
			else if (arr[pos] < key)
	            left = pos + 1;
	        else
	            right = pos - 1;
		}

		return -1;
	}

}
