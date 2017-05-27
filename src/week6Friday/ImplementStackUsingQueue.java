package week6Friday;

import java.util.Scanner;

import week6Friday.ImplementStackUsingQueue;
import week6Friday.queue;

public class ImplementStackUsingQueue {

	static queue objQueue = new queue();
	static String q2[] = new String[objQueue.MAX_SIZE];
	static int q2F=-1,q2R=-1;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while(b==true)
		{
			ImplementStackUsingQueue q = new ImplementStackUsingQueue();
			System.out.println("\n\n1. Push\n2. Pop\n3. Display\n4. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			switch(ch){
			case 1:
				System.out.print(objQueue.checkForPush());
				break;
			case 2:
				System.out.println(q.trasferQueue());
				break;
			case 3:
				System.out.print(objQueue.displayQueue());
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

	private String trasferQueue() {

		while(objQueue.f!=-1 && objQueue.r!=-1 && objQueue.f != objQueue.r){
			if(q2F==-1 && q2R==-1){
				q2F++;
				q2R++;
			}else
				q2R++;
			q2[q2R] = objQueue.pop();
		}
		String str = objQueue.pop();
		objQueue.f=-1;
		objQueue.r=-1;
		if(q2F!=-1) 
			for (int i = q2F; i <= q2R; i++) objQueue.push(Integer.parseInt(q2[i]));
		else
			str = "Queue Empty";
		q2F=-1;
		q2R=-1;
		return str;
	}
}
