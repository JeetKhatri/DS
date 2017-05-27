package week7Friday;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q5Methods<String> obj = new Q5Methods<String>();
		boolean b = true;
		while(b==true)
		{
			System.out.println("\n1. Push\n2. Display\n3. Generate Loop\n4. Remove Loop\n5. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch(ch){
			case 1:
				System.out.println("Enter no : ");
				String no = sc.nextLine();
				System.out.println(obj.insertAtLast(no));
				break;
			case 2:
				System.out.println(obj.displayLinkedList());
				break;
			case 3:
				System.out.println("Enter no : ");
				no = sc.nextLine();
				obj.generateLoop(no);
				System.out.println("Loop generated");
				break;
			case 4:
				if(obj.detectLoop())
					System.out.println("Loop Deleted");
				else
					System.out.println("Loop fail to Delete");
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
