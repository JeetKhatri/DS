package week7Tuesday;

import java.util.Scanner;

import week7Tuesday.StackProgram;

public class Q6 
{
	public static void main(String[] args) {
		Q6 obj = new Q6();
		char[] opArr = {'+','-','*','/','^'};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter postfix expression : ");
		String expr = sc.nextLine();
		System.out.println(obj.processExpr(expr,opArr));
	}

	private String processExpr(String expr,char[] opArr) {
		
		StackProgram stack = new StackProgram();
		char[] arr = expr.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if(Character.isDigit(arr[i])){
				stack.push(arr[i]+"");
			}
			else if(checkOprator(arr[i],opArr))
			{
				if(stack.top==0){
					return "Invalid";
				}else{
				int no1 = Integer.parseInt(stack.pop());
				int no2 = Integer.parseInt(stack.pop());
				if(arr[i]=='+')
					stack.push((no1+no2)+"");
				else if(arr[i]=='-')
					stack.push((no2-no1)+"");
				else if(arr[i]=='*')
					stack.push((no1*no2)+"");
				else if(arr[i]=='/')
					stack.push((no2/no1)+"");
				else if(arr[i]=='^'){
					stack.push((int)(Math.pow(no2, no1))+"");
				}
				}
			}
				
		}
		return stack.peep()+"";
	}

	private boolean checkOprator(char ch, char[] opArr) {
		for (int i = 0; i < opArr.length; i++) {
			if(opArr[i]==ch)
				return true;
		}
		return false;
	}
}
