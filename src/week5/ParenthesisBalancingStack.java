package week5;

import java.util.Scanner;


public class ParenthesisBalancingStack {
	
	static char chOpen[] = {'(','{','['};
	static char chClose[] = {')','}',']'};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str = sc.next();
		System.out.println(processParenthesis(str));
		
	}
	public static boolean processParenthesis(String str) {
		
		char arr[] = new char[20];
		int top=0;
		char charArray[] = str.toCharArray();
		try{
		for (char c : charArray) {
			if(isInChOpen(c)){
				arr[top] = c;
				top++;
			}else if(isInChClose(c) && isChOpenCloseCompare(c,arr[top-1])){
				top--;
			}else{
				return false;
			}
		}
		}catch(Exception e){
			return false;
		}
		if(top==0){
			return true;
		}else{
			return false;
		}
	}
	public static boolean isInChOpen(char c) {
		
		for (int i = 0; i < chOpen.length; i++)
			if(c == chOpen[i])
				return true;
		return false;
	}
	public static boolean isInChClose(char c) {
		
		for (int i = 0; i < chClose.length; i++)
			if(c == chClose[i])
				return true;
		return false;
	}
	public static boolean isChOpenCloseCompare(char c,char arrTop) 
	{
		int i=0,j=0;
		for (i = 0; i < chClose.length; i++)
			if(c == chClose[i])
				break;
		for (j = 0; j < chOpen.length; j++)
			if(arrTop == chOpen[j])
				break;
		if(i==j)
			return true;
		else
			return false;
	}

}
