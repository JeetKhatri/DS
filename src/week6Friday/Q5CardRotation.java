package week6Friday;

import java.util.Scanner;

import week6Friday.circularQueue;

public class Q5CardRotation {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		sc.close();

		circularQueue queue = new circularQueue(52);
		for (int i = 0; i < n; i++)
			queue.enqueue(i);

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				queue.enqueue(queue.dequeue());
			}
			arr[queue.dequeue()] = i;
		}
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + "  ");
	}
}
