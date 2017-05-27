package Exam.Q3;

import java.util.Scanner;

public class q3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		q3Method q3Methods = new q3Method();
		boolean flag=true;
		while(flag==true){
			System.out.println("\n1. Insert\n2. print\n-1. Exit");
			System.out.println("Enter your choice : ");
			int ch = sc.nextInt();
			switch(ch){
				case 1:
					System.out.println("Enter no : ");
					int no = sc.nextInt();
					q3Methods.add(no);
					break;
				case 2:
					System.out.println("Inorder : ");
					q3Methods.inOrder();
					System.out.println("\nLevel order : ");
					q3Methods.levelOrder();
					break;
				case -1:
					System.out.println("bye");
					flag=false;
					break;
				default:
					System.out.println("Invalid choice");
					break;
			}
		}
		
	}
}
