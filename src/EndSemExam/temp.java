package EndSemExam;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class temp {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int Q = scanner.nextInt();
		int[] primes = prime(Q);
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> arr = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int t = scanner.nextInt();
			if (t % 2 == 0)
				arr.add(t);
			else
				stack.push(t);
		}
		for (int j = 1; j < Q; j++) {
			ArrayList<Integer> arr1 = new ArrayList<>();
			while (!stack.isEmpty())
				arr1.add(stack.pop());
			for (int i = 0; i < arr1.size(); i++) {
				if (arr1.get(i) % primes[j] == 0)
					arr.add(arr1.get(i));
				else
					stack.push(arr1.get(i));
			}
		}
		for (int temp : arr)
			System.out.println(temp + " ");
		ArrayList<Integer> t = new ArrayList<>();
		while (!stack.isEmpty())
			t.add(0, stack.pop());
		for (int temp : t)
			System.out.println(temp + " ");
	}

	private static int[] prime(int Q) {
		int[] ans = new int[Q];
		ArrayList<Integer> a = new ArrayList<>();
		int cnt = 1;
		int no = 3;
		for (int i = 2; i <= Q;) {
			for (int j = 2; j <= Math.sqrt(no); j++) {
				if (no % j == 0) {
					cnt = 0;
					break;
				}
			}
			if (cnt != 0) {
				a.add(no);
				i++;
			}
			cnt = 1;
			no++;
		}
		a.add(0, 2);
		for (int i = 0; i < Q; i++)
			ans[i] = a.get(i);
		return ans;
	}

}
