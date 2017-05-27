package Exam.Q3;

import java.util.Scanner;

public class q2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		q2Method q2Methods = new q2Method();
		boolean flag=true;
		while(flag==true){
			System.out.println("\n1. Insert\n2. Find min\n3. pop\n-1. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter no : ");
					int no = sc.nextInt();
					q2Methods.add(no);
					break;
				case 2:
					if(q2Methods.findMin().equals("Empty stack"))
						System.out.println(q2Methods.findMin());
					else
						System.out.println("Min : "+q2Methods.findMin());
					break;
				case 3:
					q2Methods.pop();
					break;
				case -1:
					System.out.println("bye");
					flag=false;
					break;
				default:
					System.out.println("Invalid choice ...");
					break;
			}
		}
	}
}
