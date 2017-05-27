package week7Friday;

import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Q4Methods<String> obj = new Q4Methods<String>();
		boolean b = true;
		while(b==true)
		{
			System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Rotate\n5. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch){
			case 1:
				System.out.println("Enter no : ");
				String no = sc.nextLine();
				System.out.println(obj.insertAtLast(no));
				break;
			case 2:
				System.out.println(obj.deleteAtLast()+" Deleted");
				break;
			case 3:
				System.out.println(obj.displayLinkedList());
				break;
			case 4:
				System.out.println("Enter index : ");
				int k = sc.nextInt();
				obj.rotateLinkedList(k);
				System.out.println(obj.displayLinkedList());
				break;
			case 5:
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
