package week7Tuesday;

import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Limit : ");
		int limit = sc.nextInt();
		StackProgram stack = new StackProgram(limit);
		for (int i = 0; i < limit; i++) {
			stack.push(sc.nextInt()+"");
		}
		int max=Integer.parseInt(stack.peep());
		int min=max;
		String str = stack.checkMinMaxStack(min,max);
		String arr[] = str.split(" ");
		System.out.println("Max : "+arr[0]);
		System.out.println("Min : "+arr[1]);
		System.out.println(stack.displayStack());
	}
}
