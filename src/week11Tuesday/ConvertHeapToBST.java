package week11Tuesday; 

public class ConvertHeapToBST<T> extends MyTree{

	public static void main(String[] args) {

		int arr[] = new int[]{20,10,12,7,8,6};
		//This is MAX heap
		
		
		ConvertHeapToBST<Integer> convertHeapToBST = new ConvertHeapToBST<Integer>();

		for(int i=0;i<arr.length;i++)
			convertHeapToBST.add(arr[i]);
		
		convertHeapToBST.inOrder(convertHeapToBST.getRoot());
	}
}