package week6Tuesday;

import java.util.Scanner;

public class Q1 {

	StackProgram stack = new StackProgram();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.nextLine();
		char ch[] = str.toCharArray();
		Q1 obj = new Q1();
		InfixToPostfix itof = new InfixToPostfix();
		char[] arr = obj.createStack(ch);
		String s = itof.processToPostfix(arr);
		System.out.println(s+"ss");
		Q4 qv = new Q4();
		System.out.println(qv.processExpretion(s, arr));
		
	}

	

	private char[] createStack(char[] ch) {

		char[] arr = new char[100];
		int top = -1;
		for (int i = 0; i < ch.length; i++) {

			if (i == 0) {
				stack.push(ch[i] + "");
				arr[++top] = ch[i];
			} else {
				String s = stack.peep();
				char c[] = s.toCharArray();
				if (Character.isAlphabetic(c[0])
						&& Character.isAlphabetic(ch[i])) {
					stack.push("+");
					stack.push(ch[i] + "");
					arr[++top] = '+';
					arr[++top] = ch[i];
				} else if (Character.isAlphabetic(c[0]) && ch[i] == ')') {
					stack.push(")");
					arr[++top] = ')';
				} else if (c[0] == '(' && Character.isAlphabetic(ch[i]) ) {
					stack.push(ch[i]+"");
					arr[++top] = ch[i];
				} else if(c[0]==')' && Character.isDigit(ch[i])){
					stack.push("*");
					stack.push(ch[i] + "");
					arr[++top] = '*';
					arr[++top] = ch[i];
				} else if(c[0]==')' && Character.isAlphabetic(ch[i])){
					stack.push("+");
					stack.push(ch[i] + "");
					arr[++top] = '+';
					arr[++top] = ch[i];
				} else if(Character.isAlphabetic(c[0]) && Character.isDigit(ch[i])){
					stack.push("*");
					stack.push(ch[i] + "");
					arr[++top] = '*';
					arr[++top] = ch[i];
				} else if(Character.isAlphabetic(ch[i]) && Character.isDigit(c[0])){
					stack.push("+");
					stack.push(ch[i] + "");
					arr[++top] = '+';
					arr[++top] = ch[i];
				}else if(ch[i]=='(' && Character.isDigit(c[0])){
					stack.push("+");
					stack.push(ch[i] + "");
					arr[++top] = '+';
					arr[++top] = ch[i];
				} else if(Character.isAlphabetic(c[0]) && ch[i]=='('){
					stack.push("+");
					stack.push(ch[i] + "");
					arr[++top] = '+';
					arr[++top] = ch[i];
				} else if(c[0]==')' && ch[i]=='('){
					stack.push("+");
					stack.push(ch[i] + "");
					arr[++top] = '+';
					arr[++top] = ch[i];
				} else if (ch[i] == '(') {
					stack.push("(");
					arr[++top] = '(';
				} else if (ch[i] == ')') {
					stack.push(")");
					arr[++top] = ')';
				} 
			}
		}
		char[] a = new char[top+1];
		for (int j = 0; j <=top; j++) {
			a[j] = arr[j];
		}
	/*	for (int j = 0; j <=top; j++) {
			System.out.println(a[j]);
		}*/
		return a;
	}
}
