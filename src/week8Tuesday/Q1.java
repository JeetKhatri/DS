package week8Tuesday;

import java.util.Scanner;

public class Q1<T> {

	public static void main(String[] args) {

		Q1MethodsDoubly<String> ll = new Q1MethodsDoubly<String>();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("\n1. insert at Last\n2. insert at Begining\n3. Insert After Specific Number");
			System.out.println("4. Delete First\n5. Delete last\n6. Delete Any");
			System.out.println("7. Display\n0. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter no : ");
				String no = sc.nextLine();
				if(ll.insertAtLast(no))
					System.out.println(no +" Inserted");
				else
					System.out.println(no +" not Inserted");
				break;
			case 2:
				System.out.println("Enter no : ");
				no = sc.nextLine();
				if(ll.insertAtBegining(no))
					System.out.println(no +" Inserted");
				else
					System.out.println(no +" not Inserted");
				break;
			case 3:
				System.out.println("Enter no for insert : ");
				no = sc.nextLine();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select no : ");
				String oldNo = sc.nextLine();
				if(ll.insertAfterSpecificNo(no, oldNo))
					System.out.println(no +" Inserted");
				else
					System.out.println(no +" not Inserted");
				break;
			case 4:
				if(ll.deleteAtBegining())
					System.out.println("Deleted");
				else
					System.out.println("not Deleted");
				break;
			case 5:
				if(ll.deleteAtLast())
					System.out.println("Deleted");
				else
					System.out.println("not Deleted");
				break;
			case 6:
				System.out.println(ll.displayLinkedList());
				System.out.println("Enter no for Delete : ");
				no = sc.nextLine();
				if(ll.deleteAtAny(no))
					System.out.println("Deleted");
				else
					System.out.println("not Deleted");
				break;
			case 7:
				System.out.println(ll.displayLinkedList());
				break;
			case 0:
				b = false;
				System.out.println("END");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}
