package EndSemExam;

import java.util.Scanner;

public class Solution {

	public static int MAX_LENGTH = 20;
	 String stack[] = new String[MAX_LENGTH];
	static int topStack1 = -1, c = 0;
	static int arr[] = new int[20];

	public Solution() {
	}

	public Solution(int MAX_LENGTH) {
		this.MAX_LENGTH = MAX_LENGTH;
	}

	public static void main(String[] args) {
		Solution s = new Solution();
		Solution stack1 = new Solution();
		String stackA[] = new String[MAX_LENGTH];
		int topStackA = -1;
		String stackB[] = new String[MAX_LENGTH];
		int topStackB = -1;
		String stackC[] = new String[MAX_LENGTH];
		int topStackC = -1;
		String stackD[] = new String[MAX_LENGTH];
		int topStackD = -1;
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Q = sc.nextInt();
		for (int i = 0; i < N; i++) {
			stack1.push(sc.nextInt() + "");
		}
		String data;
		while (stack1.topStack1 >= 0) {
			data = stack1.pop();
			if ((stack1.topStack1 % 2) == 0){
				topStackA++;
				stackA[topStackA] = data + "";
			}else{
				topStackB++;
				stackB[topStackB] = data + "";
			}
		}
		
		while (topStackA >= 0) {
			data = stackA[topStackA] + "";
			topStackA--;
			topStackC++;
			stackC[topStackC] = data + "";
		}
		while (topStackB >= 0) {
			data = stackB[topStackB] + "";
			topStackB--;
			topStackD++;
			stackD[topStackD] = data + "";
		}
		for (int i = 0; i <= topStackC; i++) {
			System.out.println(stackC[i]);
		}
		for (int i = 0; i <= topStackD; i++) {
			System.out.println(stackD[i]);
		}
	}


	public String push(String no) {
		if (topStack1 == MAX_LENGTH) {
			return "Stack full.\n";
		} else {
			topStack1++;
			stack[topStack1] = no + "";
			return "Success\n";
		}
	}

	public String pop() {
		if (topStack1 == -1) {
			return "0";
		} else {
			String s = stack[topStack1] + "";
			topStack1--;
			return s;
		}
	}



	
}
