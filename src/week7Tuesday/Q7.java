package week7Tuesday;

import java.util.Scanner;

import java.util.Arrays;

public class Q7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr);
		int ans = 0;
		for (int i = 0, sum = 0; i < n; i++) {
			sum = 0;
			for (int j = 0; j < n; j++) {
				if (arr[i] <= arr[j])
					sum += arr[i];
			}
			if (ans < sum)
				ans = sum;
		}
		System.out.println("answer : " + ans);
		sc.close();
	}
}