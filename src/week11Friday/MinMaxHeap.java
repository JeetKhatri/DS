package week11Friday;

public class MinMaxHeap {

	public static void main(String[] args) {

		int arr[] = { 3, 5, 9, 6, 8, 20, 10, 12, 18, 9 };
		MinMaxHeapMethods obj = new MinMaxHeapMethods();
		System.out.print("Min Heap : ");
		obj.print(arr);
		System.out.print("\nMax Heap : ");
		obj.convertToMaxHeap(arr,arr.length);
		obj.print(arr);
		int arr1[] = { 20, 18, 10, 12, 9, 9, 3, 5, 6, 8 };
		System.out.print("\n\nMax Heap : ");
		obj.print(arr1);
		System.out.print("\nMin Heap : ");
		obj.convertToMinHeap(arr1,arr1.length);
		obj.print(arr1);
		
	}
}
