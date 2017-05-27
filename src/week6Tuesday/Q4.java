package week6Tuesday;

import java.util.Scanner;

public class Q4 
{
	public static void main(String[] args) {

		char[] opArr = {'+','-','*','/','^'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postfix expression : ");
		String expr = sc.nextLine();
		System.out.println(expr);
		System.out.println(processExpr(expr,opArr));
	}

	private static String processExpr(String expr,char[] opArr) {
		
		StackProgram stack = new StackProgram();
		String[] arr = expr.split(" ");
		for (int i = 0; i < arr.length; i++) {
			char c[]  = arr[i].toCharArray();
			if(Character.isDigit(c[0])){
				stack.push(arr[i]+"");
			}
			else if(checkOprator(c[0],opArr))
			{
				if(stack.top==0){
					return "Invalid";
				}else{
				int no1 = Integer.parseInt(stack.pop());
				int no2 = Integer.parseInt(stack.pop());
				if(c[0]=='+')
					stack.push((no1+no2)+"");
				else if(c[0]=='-')
					stack.push((no2-no1)+"");
				else if(c[0]=='*')
					stack.push((no1*no2)+"");
				else if(c[0]=='/')
					stack.push((no2/no1)+"");
				else if(c[0]=='^'){
					stack.push((int)(Math.pow(no2, no1))+"");
				}
				}
			}
				
		}
		return stack.peep()+"";
	}

	private static boolean checkOprator(char ch, char[] opArr) {
		for (int i = 0; i < opArr.length; i++) {
			if(opArr[i]==ch)
				return true;
		}
		return false;
	}
	
public static String processExpretion(String expr,char[] opArr) {
		StackProgram stack = new StackProgram();
		char[] arr = expr.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])){
				stack.push(arr[i]+"");
			}else if(Character.isAlphabetic(arr[i])){
				if(arr[i] == 'C' || arr[i] == 'c'){
					stack.push("12");
				}else if(arr[i] == 'H' || arr[i] == 'h'){
					stack.push("1");
				}else if(arr[i] == 'O' || arr[i] == 'o'){
					stack.push("16");
				}
			}
			else if(checkOprator(arr[i],opArr))
			{
				if(stack.top==0){
					return "Invalid";
				}else{
					int no1 = Integer.parseInt(stack.pop());
					int no2 = Integer.parseInt(stack.pop());
					if(arr[i]=='+'){
						int n=no1+no2;
						stack.push(n+"");
					}else if(arr[i]=='-'){
						stack.push((no2-no1)+"");
				}else if(arr[i]=='*'){
						stack.push((no1*no2)+"");
			}else if(arr[i]=='/'){
						stack.push((no2/no1)+"");
			}else if(arr[i]=='^'){
						stack.push((int)(Math.pow(no2, no1))+"");
			}
				}
			}
		}
		
		return stack.displayStack()+"";
	}
}
