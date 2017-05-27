package week7Friday;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q6Methods<String> obj1 = new Q6Methods<String>();
		Q6Methods<String> obj2 = new Q6Methods<String>();
		System.out.println("Enter limit : ");
		int limit = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter "+limit+" eliment for linklist 1 : ");
		for (int i = 0; i < limit; i++) {
			System.out.println(obj1.insertAtLast(sc.nextLine()));
		}
		System.out.println("Enter "+limit+" eliment for linklist 2 : ");
		for (int i = 0; i < limit; i++) {
			System.out.println(obj2.insertAtLast(sc.nextLine()));
		}
		System.out.println(obj1.displayLinkedList());
		System.out.println(obj2.displayLinkedList());
		if(obj1.compareTwoLinkedList(obj1,obj2))
			System.out.println("Both linked list eliment are same");
		else
			System.out.println("Both linked list eliment are not same");
	}
}
