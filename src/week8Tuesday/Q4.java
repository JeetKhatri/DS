package week8Tuesday;

import java.util.Scanner;

public class Q4 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q4Methods<Integer> obj = new Q4Methods<Integer>();
		System.out.println("Enter : ");
		for (int i = 0; i < 5; i++) {
			obj.addAtLast(sc.nextInt());
		}
		obj.sortInteger();
		obj.display();
	}
}
