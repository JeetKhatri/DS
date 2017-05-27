package week7Tuesday;

import java.util.Scanner;

import week7Tuesday.StackProgram;

public class CircularQueueUsingMultipleStacks {

	static StackProgram stack = new StackProgram();
	static int top=-1;
	static int MAX_SIZE=stack.MAX_LENGTH;
	static String[] stack1 = new String[MAX_SIZE];
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		boolean b = true;
		while(b==true)
		{
			CircularQueueUsingMultipleStacks q = new CircularQueueUsingMultipleStacks();
			System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.print(q.checkForPush());
				System.out.println(stack.displayStack());
				break;
			case 2:
				System.out.println(q.checkForPop());
				break;
			case 3:
				System.out.println(stack.displayStack());
				break;
			case 4:
				b=false;
				System.out.println("END");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}

	String checkForPush() {
		if(isQueueFull())
			return "Queue Full";
		else{
			System.out.println("Enter no : ");
			int no = sc.nextInt();
			return stack.push(no+"");
		}
		
	}
	
	private String checkForPop() {
		if(isQueueEmpty())
			return "Queue Empty";
		else
		{
			while(stack.top >= 0){
				top++;
				stack1[top] = stack.pop();
			}
			for(int i=top-1;i>=0;i--){
				stack.push(stack1[i]);
			}
			if(stack.top > -1)
				System.out.println(stack.displayStack());
			else
				System.out.println("Empty");
			top=-1;
			return "";
		}
	}
	private boolean isQueueFull() {
		if(stack.top==MAX_SIZE-1)
			return true;
		else
			return false;
	}
	private boolean isQueueEmpty() {
		if(stack.top==-1)
			return true;
		else
			return false;
	}
}
