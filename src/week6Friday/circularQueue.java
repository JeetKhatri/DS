package week6Friday;

import java.util.Scanner;

import week6Friday.circularQueue;

public class circularQueue {

	static int MAX_SIZE=100;
	static int cirQueue[] = new int[MAX_SIZE];
	static int f=-1,r=-1;
	static Scanner sc = new Scanner(System.in);
	circularQueue(){}
	circularQueue(int MAX_SIZE)
	{
		this.MAX_SIZE=MAX_SIZE;
	}
	public static void main(String[] args) {
		boolean b = true;
		circularQueue q = new circularQueue();
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
			if(r >= f){
				for(int i = f; i <= r; i++) 
					str+=cirQueue[i]+" ";
			}else{
				System.out.println(f+ " " +r);
				for(int i=f;i<MAX_SIZE;i++)
					str+=cirQueue[i]+" ";
				for(int i=0;i<=r;i++)
					str+=cirQueue[i]+" ";
				
			}
			return str;
		}
	}

	String checkForPop() {
		if(isQueueEmpty())
			return "Queue Empty";
		else
			return pop();
	}
	int dequeue() {
		if(isQueueEmpty())
			return 0;
		else
			return Integer.parseInt(pop());
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
	 int enqueue(int no){
		 if(isQueueFull())
				return 0;
			else{
				return Integer.parseInt(push(no));
			}
	 }

	 String push(int no) {
			if(f==-1 && r==-1){
				f=0;
				r=0;
			}else if(r==MAX_SIZE-1){
				r=0;
			}else{
				r++;
			}
			cirQueue[r] = no;
			return cirQueue[r]+"";
	}
	
	 String pop() {
		int item = cirQueue[f];
		if(f==r){
			f=-1;
			r=-1;
		}else if(f==MAX_SIZE-1){
			f=0;
		}else
			f++;
		return item+"";
		
}

	 boolean isQueueFull() {
		if((r==MAX_SIZE-1 && f==0) || r==f-1)
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
	 String peep()
	 {
		 if(isQueueFull())
				return "Queue Full";
		 else{
				return cirQueue[f]+"";
		 } 
	 }
}
