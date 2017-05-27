package week5;

import java.util.Scanner;


public class InfixToPostfix {

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
		input = expr.toCharArray();
		processToStack(input);
	}

	private static void processToStack(char[] input) {
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
		System.out.print(stack.displayStack());
		for (int i = tempCnt-1; i >= 0; i--) {
			System.out.print(temp[i]+" ");
		}
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






/*
import java.util.Scanner;


public class InfixToPostfix {

	private static char oppref1[] = {'*','/'};
	private static char oppref2[] = {'+','-'};
	private static char temp[] = new char[10];
	private static char input[] = new char[10];
	static StackProgram stack = new StackProgram();
	private static int tempCnt=0;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Expression : ");
		String expr = sc.next();
		input = expr.toCharArray();
		processToStack(input);
	}

	private static void processToStack(char[] input) {
		for (char c : input) {
			if(isOperatorP1(c) || isOperatorP2(c)){
				if(tempCnt==0){
					temp[tempCnt]=c;
					tempCnt++;
				}else{
				//	System.out.println(isOperatorP2(temp[tempCnt-1]) +" "+ isOperatorP1(c));
					if(isOperatorP1(temp[tempCnt-1]) && isOperatorP2(c))
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
					
					temp[tempCnt]=c;
					tempCnt++;
				}
			}else{
				stack.push(c+"");
			}
		}
		System.out.print(stack.displayStack());
		for (int i = tempCnt-1; i >= 0; i--) {
			System.out.print(temp[i]+" ");
		}
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
}
*/