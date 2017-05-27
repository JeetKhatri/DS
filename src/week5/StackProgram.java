package week5;

import java.util.Scanner;


public class StackProgram {

	static int MAX_LENGTH=20;
	static String stack[] = new String[MAX_LENGTH];
	static int top=-1;
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean b=true; 
		while(b)
		{
			System.out.println("1. Check of empty/Full\n2. Push\n3. Pop\n4. Peep\n5. Display Stack\n0. Exit\n\nEnter choice : ");
			int ch = sc.nextInt();
			if(ch==1){
				System.out.println(emptyFull());
			}else if(ch==2){
				System.out.println("Enter no : ");
				String no = sc.next();
				System.out.println(push(no));
			}else if(ch == 3){
				System.out.println(pop());
			}else if(ch==4){
				System.out.println(peep());
			}else if(ch==5){
				System.out.println(displayStack());
			}else if(ch==0){
				b=false;
				System.out.println("Exit");
			}else{
				System.out.println("Invalid choice..");
			}
		}
	}
	public static String emptyFull() {
		if(top ==MAX_LENGTH){
			return "Stack full.\n";
		}else if(top ==-1){
			return "Stack empty.\n";
		}else{
			return "Normal\n";
		}
	}
	public static String push(String no) {
		if(top ==MAX_LENGTH){
			return "Stack full.\n";
		}else{
			top++;
			stack[top] = no+"";
			return "Success\n";
		}
	}
	public static String pop() {
		if(top ==-1){
			return "Stack empty.\n";
		}else{
			top--;
			return "Success\n";
		}
	}
	public static String peep() {
		if(top ==-1){
			return "Stack empty.\n";
		}else if(top ==MAX_LENGTH){
			return "Stack Full.\n";
		}else{
			return stack[top]+"";
		}
	}
	public static String displayStack() {
		String s="";
		for (int i = 0; i <= top; i++) {
			s+=stack[i]+" ";
		}
		return s;
	}
}
