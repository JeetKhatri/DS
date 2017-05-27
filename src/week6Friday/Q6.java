package week6Friday;

import java.util.Scanner;

import week6Friday.circularQueue;

public class Q6 {

	static circularQueue q = new circularQueue();
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no : ");
		int no = sc.nextInt();
		if(q.MAX_SIZE > no) 
		{
			convertToBinary(no);
			System.out.println(q.displayQueue());
			boolean b = true;
			while(b==true)
			{
				System.out.println("\n1. Dequeue and Print\n2. Append “0” & enqueue it.\n3. Append “1” & enqueue it.\n4. Display\n5. Exit\n\nEnter your choice : ");
				int ch = sc.nextInt();
				switch(ch){
				case 1:
					System.out.println(q.checkForPop());
					break;
				case 2:
					System.out.println(AppendZeroEnqueueIt());
					break;
				case 3:
					System.out.println(AppendOneEnqueueIt());
					break;
				case 4:
					System.out.println(q.displayQueue());
					break;
				case 5:
					b=false;
					System.out.println("END");
					break;
				default:
					System.out.println("Invalid choice");
					break;
				}
			}
			
		}else{
			System.out.println("Full");
		}
	}
	
	private static String AppendOneEnqueueIt() {
		String s="";
		if(q.peep().equals("Queue Full"))
			s="Queue Full";
		else
			s =q.push(Integer.parseInt(q.peep()+"1"))+" Inserted";
		return s;
	}

	private static String AppendZeroEnqueueIt() {

		String s="";
		if(q.peep().equals("Queue Full"))
			s="Queue Full";
		else
			s =q.push(Integer.parseInt(q.peep()+"0"))+" Inserted";
		return s;
		
	}
	private static void convertToBinary(int no) {

		for (int i = 1; i <= no; i++) {
			if(q.isQueueFull())
				System.out.println("Queue Full");
			else{
				q.push(Integer.parseInt(Integer.toBinaryString(i)));
			}
		}
		
	}
}
