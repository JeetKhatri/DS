package week6Tuesday;
import java.util.Scanner;


public class StackProgram {

	public int MAX_LENGTH=200;
	String stack[] = new String[MAX_LENGTH];
	public int top=-1;
	int no;
	public StackProgram(){}
	public StackProgram(int no) {
		MAX_LENGTH = no;
	}
	
	public static void main(String[] args) 
	{
		StackProgram sp = new StackProgram();
		Scanner sc = new Scanner(System.in);
		boolean b=true; 
		while(b)
		{
			System.out.println("1. Check of empty/Full\n2. Push\n3. Pop\n4. Peep\n5. Display Stack\n0. Exit\n\nEnter choice : ");
			int ch = sc.nextInt();
			if(ch==1){
				System.out.println(sp.emptyFull());
			}else if(ch==2){
				System.out.println("Enter no : ");
				String no = sc.next();
				System.out.println(sp.push(no));
			}else if(ch == 3){
				System.out.println(sp.pop());
			}else if(ch==4){
				System.out.println(sp.peep());
			}else if(ch==5){
				System.out.println(sp.displayStack());
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
	public String push(String no) {
		if(top ==MAX_LENGTH){
			return "Stack full.\n";
		}else{
			top++;
			stack[top] = no+"";
			return "Success\n";
		}
	}
	public String pop() {
		if(top ==-1){
			return "0";
		}else{
			String s = stack[top]+"";
			top--;
			return s;
		}
	}
	public String peep() {
		if(top ==-1){
			return "Stack empty.\n";
		}else if(top ==MAX_LENGTH){
			return "Stack Full.\n";
		}else{
			return stack[top]+"";
		}
	}
	public String displayStack() {
		String s="";
		for (int i = 0; i <= top; i++) {
			s+=stack[i]+" ";
		}
		return s;
	}
	public  int getSum() {
		int c=0;
		for (int i = 0; i <= top; i++) {
			c+=Integer.parseInt(stack[i]);
		}
		return c;
	}
	public int getSize() {
		int c=0;
		for (int i = 0; i <= top; i++) {
			c++;
		}
		return c;
	}
	
	public void reverse()
	{
		String[] temp=new String[stack.length];
		for(int i=0;i<top;i++)
			temp[i]=stack[((top-1)-i)];
		for(int i=0;i<top;i++)
			stack[i]=temp[i];
	}
}


/*package week6;
import java.util.Scanner;


public class StackProgram {

	public static int MAX_LENGTH=20;
	static String stack[] = new String[MAX_LENGTH];
	public static int top=-1;
	
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
	public static String displayStack() {
		String s="";
		for (int i = 0; i <= top; i++) {
			s+=stack[i]+" ";
		}
		return s;
	}
	public  int getSum() {
		int c=0;
		for (int i = 0; i <= top; i++) {
			c+=Integer.parseInt(stack[i]);
		}
		return c;
	}
	public int getSize() {
		int c=0;
		for (int i = 0; i <= top; i++) {
			c++;
		}
		return c;
	}
	
	public void reverse()
	{
		String[] temp=new String[stack.length];
		for(int i=0;i<top;i++)
			temp[i]=stack[((top-1)-i)];
		for(int i=0;i<top;i++)
			stack[i]=temp[i];
	}
}

*/