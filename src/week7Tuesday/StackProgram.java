package week7Tuesday;

import java.util.Scanner;


public class StackProgram {

	public static int MAX_LENGTH=20;
	static String stack[] = new String[MAX_LENGTH];
	static int top=-1,c=0;
	static int arr[]  = new int[20]; 
	public StackProgram() {}
	public StackProgram(int MAX_LENGTH) {
		this.MAX_LENGTH= MAX_LENGTH;
	}
	
	public static void main(String[] args) 
	{
		StackProgram s = new StackProgram();
		Scanner sc = new Scanner(System.in);
		boolean b=true; 
		while(b)
		{
			System.out.println("1. Check of empty/Full\n2. Push\n3. Pop\n4. Peep\n5. Display Stack\n0. Exit\n\nEnter choice : ");
			int ch = sc.nextInt();
			if(ch==1){
				System.out.println(s.emptyFull());
			}else if(ch==2){
				System.out.println("Enter no : ");
				String no = sc.next();
				System.out.println(push(no));
			}else if(ch == 3){
				System.out.println(pop());
			}else if(ch==4){
				System.out.println(peep());
			}else if(ch==5){
				System.out.println(displayStack()+" " +top);
			}else if(ch==0){
				b=false;
				System.out.println("Exit");
			}else{
				System.out.println("Invalid choice..");
			}
		}
	}
	public String emptyFull() {
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
			return "0";
		}else{
			String s = stack[top]+"";
			top--;
			return s;
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
	public int peepFirstEliment() {
		return Integer.parseInt(stack[top]);
	}
	public static String displayStack() {
		String s="";
		for (int i = 0; i <= top; i++) {
			s+=stack[i]+" ";
		}
		return s;
	}
	public static String checkMinMaxStack(int min, int max) {
		String s="";
		if(top>=0){
			int no = Integer.parseInt(pop());
			arr[c++] = no;
			if(max < no) max = no;
			if(min > no) min = no;
			return checkMinMaxStack(min,max);
		}else{
			for (int i = c-1; i >=0; i--) {
				push(arr[i]+"");
			}
			s=max+" "+min;
			return s;
		}
	}
	public boolean isEmpty() {
		if(top ==-1){
			return true;
		}else{
			return false;
		}
	}
	public int top() {
			return Integer.parseInt(stack[top]);
	}
	public int topMinusOne() {
		if(isEmpty() ==false)
		{
			pop();
			return Integer.parseInt(stack[top]);
		}else{
			return 0;
		}
		
}
	public int totalEliment()
	{
		int x=0;
		for (int i = 0; i <= top; i++) 
			x++;
		return x;
	}
}
