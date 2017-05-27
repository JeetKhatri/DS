package week6Tuesday;

import java.util.Scanner;


public class Q5_ParenthesisBalancingStack_Count {
	
	static char chOpen[] = {'(','{','['};
	static char chClose[] = {')','}',']'};
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input : ");
		String str = sc.next();
		processParenthesis(str);
		
	}
	public static void processParenthesis(String str) {
		
		char arr[] = new char[20];
		int top=0,cntUp=0,t=0,cntDown=0;
		char charArray[] = str.toCharArray();
		try{
		for (char c : charArray) {
			if(isInChOpen(c)){
				arr[top] = c;
				if(top==0) cntUp=0;
				top++;
				cntUp++;
			}else if(isInChClose(c) && isChOpenCloseCompare(c,arr[top-1])){
				top--;
				cntDown++;
				if(top==0)
					t++;
			}else{
				displayAns(t,cntUp,top);
			}
		}
		}catch(Exception e){
			displayAns(t,cntUp,top);
		}
		displayAns(t,cntUp,top);
	}
	public static void displayAns(int t,int cntUp,int top) 
	{
	
		if(cntUp == 1)
			System.out.println(t*2);
		else{
			if(top==0)
				System.out.println(((t*2)+cntUp));
			else
				System.out.println(((t*2)+top));
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
