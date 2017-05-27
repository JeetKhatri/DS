package week8Tuesday;

import java.util.Scanner;

import week7Friday.Q1Method;

public class Q3<T> {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Q3Methods<String> ll = new Q3Methods<String>();
	//	Q2MethodsCircular<String> llcer = new Q2MethodsCircular<String>();
		Q1Method<String> llsig = new Q1Method<String>();
		for (int i = 0; i < 5; i++) {
		//	llcer.insertAtLast(sc.nextLine());
			llsig.insertAtLast(sc.nextLine());
		}
	//	if(ll.checkIsCercular(llcer.getHead())){
		if(ll.checkIsCercular(llsig.getHead())){
			System.out.println("Circular Linked List");
		}else{
			System.out.println("Simple Linked List");
		}
	}

}
