package week7Tuesday;

import java.util.Scanner;
import week7Tuesday.StackProgram;

public class Q5_SortStack {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Q5_SortStack ss= new Q5_SortStack();
		System.out.println("Enter Limit : ");
		int ch = sc.nextInt();
		StackProgram stack = new StackProgram();
		for (int i = 0; i < ch; i++) {
			stack.push(sc.next());
		}
		System.out.println(stack.displayStack());
		ss.sortStack(stack);
		System.out.println(stack.displayStack());
	}

	void sortStack(StackProgram stack) {
		if (!stack.isEmpty()) {
			int temp = Integer.parseInt(stack.pop());
			System.out.println(temp);
			sortStack(stack);
			addToStack(stack, temp);
		}
	}

	private void addToStack(StackProgram stack, int temp) {
		if (stack.isEmpty())
			stack.push(temp + "");
		else if (temp > stack.top())
			stack.push(temp + "");
		else {
			int u = Integer.parseInt(stack.pop());
			addToStack(stack, temp);
			stack.push(u + "");
		}

	}
}
