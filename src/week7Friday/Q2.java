package week7Friday;

import java.util.Scanner;

public class Q2 {
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Q2Methods<String> obj = new Q2Methods<String>();
		boolean b = true;
		while(b==true)
		{
			System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch){
			case 1:
				System.out.println("Enter no : ");
				String no = sc.nextLine();
				System.out.println(obj.insertAtLast(no));
				break;
			case 2:
				System.out.println(obj.deleteAtBegining());
				break;
			case 3:
				System.out.println(obj.displayLinkedList());
				break;
			case 4:
				b=false;
				System.out.println("END");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
	
}
