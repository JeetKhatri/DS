package week7Tuesday;

import java.util.*;

public class Q2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int no = scanner.nextInt();
		towerOfHenoi(no, 'A', 'B', 'C');
	}

	private static int towerOfHenoi(int n, char A, char B, char C) {
		if (n == 1) {
			System.out
					.println("Disk " + n + " is moved from " + A + " to " + C);
			return 0;
		}
		towerOfHenoi(n - 1, A, C, B);
		System.out.println("Disk " + n + " is moved from " + A + " to " + C);
		towerOfHenoi(n - 1, B, A, C);
		return 0;
	}
}
