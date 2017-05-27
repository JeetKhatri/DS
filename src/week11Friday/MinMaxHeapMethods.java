package week11Friday;

public class MinMaxHeapMethods {


	public void print(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}

	public void convertToMaxHeap(int[] arr, int n) {
		for(int i=(n-2)/2 ; i>=0 ; --i){
			MaxHeap(arr,n,i);
		}
	}
	
	
	public void convertToMinHeap(int[] arr, int n) {
		for(int i=(n-2)/2 ; i>=0 ; --i){
			MinHeap(arr,n,i);
		}
	}

	public void MaxHeap(int[] arr, int n, int i) {
		int l = (i*2)+1;
		int r = (i*2)+2;
		int largest = i;
		if (l < n && arr[l] > arr[i])
			largest = l;
		if (r < n && arr[r] > arr[largest])
			largest = r;
		if (largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeap(arr,n,largest);
		}
	}
	private void MinHeap(int[] arr, int n, int i) {
		int l = (i*2)+1;
		int r = (i*2)+2;
		int largest = i;
		if(l < n && arr[l] < arr[i])
			largest = l;
		if(r < n && arr[r] < arr[largest])
			largest = r;
		if(largest != i){
			int temp = arr[i];
			arr[i] = arr[largest];
			arr[largest] = temp;
			MaxHeap(arr,n,largest);
		}
	}
	
}
