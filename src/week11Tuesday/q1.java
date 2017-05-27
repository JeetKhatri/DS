package week11Tuesday;

public class q1 {
	static void MinHeap(int arr[], int i, int n) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < n && arr[l] < arr[i])
			largest = l;
		if (r < n && arr[r] < arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MinHeap(arr, largest, n);
		}
	}

	static void MaxHeap(int arr[], int i, int n) {
		int l = 2 * i + 1;
		int r = 2 * i + 2;
		int largest = i;
		if (l < n && arr[l] > arr[i])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;
		if (largest != i) {
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeap(arr, largest, n);
		}
	}

	static void print(int arr[]) {
		for (int i = 0; i < arr.length; ++i)
			System.out.print(arr[i] + " ");
	}

	static void convertMaxHeap(int arr[], int n) {
		for (int i = (n - 2) / 2; i >= 0; --i)
			// last root
			MaxHeap(arr, i, n);
	}

	static void convertMinHeap(int arr[], int n) {
		for (int i = (n - 2) / 2; i >= 0; --i)
			// last root
			MinHeap(arr, i, n);
	}

	public static void main(String[] args) {
		int arr[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 };
		int n = arr.length;
		System.out.println("Min Heap is : ");
		print(arr);
		convertMaxHeap(arr, n);
		System.out.println("\nMax Heap is : ");
		print(arr);
		int arr1[] = { 20, 18, 10, 12, 9, 9, 3, 5, 6, 8 };
		System.out.println("\n\n\nMax Heap is : ");
		print(arr1);
		convertMinHeap(arr1, n);
		System.out.println("\nMin Heap is : ");
		print(arr1);

	}
}
