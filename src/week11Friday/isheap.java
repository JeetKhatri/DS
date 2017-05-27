package week11Friday;

import java.util.Scanner;

public class isheap {

	public static boolean isMinHeap(int[] heap) {
		try {
			for (int i = 0; i < heap.length / 2; i++)
				if (heap[i] > heap[2 * (i + 1) - 1])
					return false;
				else if (heap[i] > heap[2 * (i + 1)])
					return false;
		} catch (Exception e) {
			return true;
		}
		return true;
	}

	public static boolean isMaxHeap(int[] heap) {
		try {
			for (int i = 0; i < heap.length / 2; i++)
				if (heap[i] < heap[2 * (i + 1) - 1])
					return false;
				else if (heap[i] < heap[2 * (i + 1)])
					return false;
		} catch (Exception e) {
			return true;
		}
		return true;
	}

	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);
		int ch = 0;
		System.out.print("Enter length: ");
		int[] heap = new int[scan.nextInt()];
		System.out.println("Enter array!");
		for (int i = 0; i < heap.length; i++)
			heap[i] = scan.nextInt();
		System.out.println("MinHeap: " + isMinHeap(heap));
		System.out.println("MaxHeap: " + isMaxHeap(heap));
	}

}
