package week8Friday;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Methods methods = new Methods();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter limit : ");
		int lim = sc.nextInt();
		for (int i = 0; i < lim; i++) {
			
			methods.insertNode(sc.nextInt());
			
		}
		
		
	}
}
