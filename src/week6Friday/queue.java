package week6Friday;

import java.util.Scanner;

public class queue {
	
	static int MAX_SIZE=10;
	static int queue[] = new int[MAX_SIZE];
	static int f=-1,r=-1;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean b = true;
		queue q = new queue();
		while(b==true)
		{
			System.out.println("\n1. Push\n2. Pop\n3. Display\n4. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.println(q.checkForPush());
				break;
			case 2:
				System.out.println(q.checkForPop());
				break;
			case 3:
				System.out.println(q.displayQueue());
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

	String displayQueue() {

		if(isQueueEmpty()){
			return "Queue Empty";
		}else{
			String str="";
			for (int i = f; i <= r; i++) 
				str+=queue[i]+" ";	
			return str;
		}
	}

	String checkForPop() {
		if(isQueueEmpty())
			return "Queue Empty";
		else
			return pop();
	}

	String checkForPush() {
		if(isQueueFull())
			return "Queue Full";
		else{
			System.out.println("Enter no : ");
			int no = sc.nextInt();
			return push(no)+" inserted";
		}
		
	}

	String push(int no) {
			if(f==-1 && r==-1){
				f++;
				r++;
			}else
				r++;
			queue[r] = no;
			return queue[r]+"";
	}
	
	String pop() {
		int item = queue[f];
		if (f == r) {
			f = -1;
			r = -1;
		} else
			f++;
		return item+"";

	}

	boolean isQueueFull() {
		if(r==MAX_SIZE-1)
			return true;
		else
			return false;
	}
	boolean isQueueEmpty() {
		if(f==-1)
			return true;
		else
			return false;
	}
}
