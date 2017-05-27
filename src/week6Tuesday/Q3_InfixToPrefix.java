package week6Tuesday;

import java.util.Scanner;



public class Q3_InfixToPrefix {

	private static char oppref1[] = {'*','/'};
	private static char oppref2[] = {'+','-'};
	private static char oppref3[] = {'(',')'};
	private static char temp[] = new char[10];
	private static char input[] = new char[10];
	static StackProgram stack = new StackProgram();
	private static int tempCnt=0;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expression : ");
		String expr = sc.next();
		StringBuilder b = new StringBuilder(expr);
		expr = new String(b.reverse());
		input = expr.toCharArray();
		input = replacePrenthesis(input);
		processToStack(input);
	}

	private static char[] replacePrenthesis(char[] input2) {
		for (int i = 0; i < input.length; i++) {
			if(input[i]=='(') input[i]=')';
			else if(input[i]==')') input[i]='(';
		}
		return input2;
	}

	private static void processToStack(char[] input) {
		String s="";
		for (char c : input) {
			if(isOperatorP1(c) || isOperatorP2(c) || isOperatorP3(c)){
				if(tempCnt==0){
					temp[tempCnt]=c;
					tempCnt++;
				}else{
				//	System.out.println(isOperatorP2(temp[tempCnt-1]) +" "+ isOperatorP1(c));
					if(isOperatorP3(c) && c == oppref3[1]){
						while(temp[tempCnt-1] !=oppref3[0] && tempCnt!=0){
							stack.push(temp[tempCnt-1]+"");
							tempCnt--;
						}
						if(temp[tempCnt-1] ==oppref3[0])
							tempCnt--;
					}
					if(tempCnt!=0 && isOperatorP1(temp[tempCnt-1]) && isOperatorP2(c))
					{
						stack.push(temp[tempCnt-1]+"");
						tempCnt--;
					}
					if(tempCnt!=0 && isOperatorP1(temp[tempCnt-1]) && isOperatorP1(c))
					{
						stack.push(temp[tempCnt-1]+"");
						tempCnt--;
					}
					if(tempCnt!=0 && isOperatorP2(temp[tempCnt-1]) && isOperatorP2(c))
					{
						stack.push(temp[tempCnt-1]+"");
						tempCnt--;
					}
					if(c != oppref3[1]){
						temp[tempCnt]=c;
						tempCnt++;
					}
				}
			}else{
				stack.push(c+"");
			}
		}
		s+= stack.displayStack()+"";
	//	System.out.print(stack.displayStack());
		for (int i = tempCnt-1; i >= 0; i--) {
		//	System.out.print(temp[i]+" ");
			s+=temp[i]+" ";
		}
	//	System.out.println(s);
		StringBuilder b = new StringBuilder(s);
		System.out.println(b.reverse().substring(1, b.length()));
	}

	public static boolean isOperatorP1(char c) {
		for (int i = 0; i < oppref1.length; i++) 
			if(c==oppref1[i])
				return true;
		return false;
	}
	public static boolean isOperatorP2(char c) {
		for (int i = 0; i < oppref2.length; i++) 
			if(c==oppref2[i])
				return true;
		return false;
	}
	public static boolean isOperatorP3(char c) {
		for (int i = 0; i < oppref3.length; i++) 
			if(c==oppref3[i])
				return true;
		return false;
	}
}