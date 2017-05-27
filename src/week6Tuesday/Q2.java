package week6Tuesday;

import java.util.Scanner;

interface Stack {
	boolean isPalindrome();
}

public class Q2 implements Stack {
	static StackProgram stack = new StackProgram();
	static int top=-1;
	static String[] stack1 = new String[100];
	static String[] stack2 = new String[100];
	
	public static void main(String[] args) {

		Q2 obj = new Q2();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String expr = sc.nextLine();
		int t=-1;
		for (int i = 1; i <= expr.length(); i++) {
			stack.push(expr.charAt(i-1)+"");
			stack2[++t] = expr.substring(i-1,i);
		}
		/*for (int i = 1; i <= expr.length(); i++) {
			stack.push(expr.substring(i-1,i));
			stack2[++t] = expr.substring(i-1,i);
		}*/
		
	//	System.out.println(stack.displayStack());
		
		stack1 = reverseStack(stack1, stack2);
		boolean b = obj.isPalindrome();
		if(b==true)
			System.out.println("Palindrome.");
		else
			System.out.println("Not Palindrome.");
	}


	private static String[] reverseStack(String[] stack1,String[] stack2) {
		
		if(stack.top==-1 ){
			return stack1;
		}else{
			push(stack.pop());
			return reverseStack(stack1,stack2);
		}
	}
	
		
	public boolean isPalindrome() {
		for (int i = 0; i < top; i++) {
			if((stack1[i]+"").equals(stack2[i]+"")){
			}else{
				return false;
			}
		}
		return true;
	}
	
	public static String push(String no) {
			top++;
			stack1[top] = no+"";
			return stack1[top]+"";
	}
	
}
