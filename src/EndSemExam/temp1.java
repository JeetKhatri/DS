package EndSemExam;

import java.io.*;
import java.util.*;

public class temp1 {

   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		PriorityQueue<Integer> arr = new PriorityQueue<Integer>();
		int cnt = 0;
        for(int i=0;i<N;i++)
			arr.offer(sc.nextInt());
		try {
			while (arr.peek() < K) {
				int newt = (1 * arr.poll() + 2 * arr.poll());
				arr.offer(newt);
				cnt++;
			}
			if (arr.peek() >= K) {
				System.out.println(cnt);
			}
		} catch (Exception e) {
			System.out.println(-1);
		}
	}
}