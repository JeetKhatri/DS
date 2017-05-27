package week8Tuesday;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {

		Q5Methods pol1 = new Q5Methods();
		Q5Methods pol2 = new Q5Methods();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("\n1. Add to polynomial 1");
			System.out.println("2. Display polynomial 1");
			System.out.println("3. Add to polynomial 2");
			System.out.println("4. Display polynomial 2");
			System.out.println("5. Addition");
			System.out.println("6. Subtract");
			System.out.println("0. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter multiple : ");
				int mul = sc.nextInt();
				System.out.println("Enter Power : ");
				int power = sc.nextInt();
				while(power >=3){
					System.out.println("Enter Power (0,1,2 ) : ");
					power  = sc.nextInt();
				}
				pol1.insertAtLast(mul, power);
				break;
			case 2:
				System.out.println(pol1.displayLinkedList());
				break;
			case 3:
				System.out.println("Enter multiple : ");
				mul = sc.nextInt();
				System.out.println("Enter Power : ");
				power = sc.nextInt();
				while(power >=3){
					System.out.println("Enter Power (0,1,2 ) : ");
					power  = sc.nextInt();
				}
				pol2.insertAtLast(mul, power);
				break;
			case 4:
				System.out.println(pol2.displayLinkedList());
				break;
			case 5:
				Q5Methods sum = Q5Methods.add(pol1,pol2);
				System.out.println(sum.displayLinkedList());
				System.out.print("Enter value: ");
				int ans=sum.evaluate(sc.nextInt());
				System.out.println("Answer: "+ans);
				break;
			case 6:
				Q5Methods sub = Q5Methods.subtract(pol2,pol1);
				System.out.println(sub.displayLinkedList2());
				System.out.print("Enter value: ");
				ans=sub.evaluate(sc.nextInt());
				System.out.println("Answer: "+ans);
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
