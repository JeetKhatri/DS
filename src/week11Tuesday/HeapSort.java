package week11Tuesday; 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HeapSort<T> extends MyTree {

	public static void main(String[] args) throws NumberFormatException, IOException {

		HeapSort<Integer> convertToMaxHeap = new HeapSort<Integer>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Level Wise");
			System.out.println("4 - Sort");
			System.out.println("5 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
			case 1:
				int no = Integer.valueOf(bufferedReader.readLine());
				convertToMaxHeap.add(no);
				break;
			case 2:
				no = Integer.valueOf(bufferedReader.readLine());
				convertToMaxHeap.deleteKey(no);
				break;
			case 3:
				convertToMaxHeap.printLevelOrder();
				break;
			case 4: {
				String[] str = convertToMaxHeap.sortedString().split(",");
				int[] elem = new int[str.length];
				Heap<Integer> heap = new Heap<Integer>();
				for (int i = 0; i < str.length; i++) {
					elem[i] = Integer.parseInt(str[i]);
					heap.add(elem[i]);
				}
				System.out.println("\nInOrder");
				heap.inOrder(heap.getHead());
				System.out.println("\nPreOrder");
				heap.preOrder(heap.getHead());
				System.out.println("\nPostOrder");
				heap.postOrder(heap.getHead());
				System.out.println("\nLevel Wise");
				heap.printLevelOrder();
				break;
			}
			case 5:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}

}
