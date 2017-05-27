package week11Friday;

import java.util.Scanner;

public class KthEliment {
	static int partition(int A[], int start, int end){
	    int i= start+1;
	    int j = i;
	    int pivot = start;
	    for(; i<end; i++){
	        if(A[i]<A[pivot]){
	            int temp=A[i];
	            A[i]=A[j];
	            A[j]=temp;
	            j++;
	        }
	    }
	    if(j<=end){
	        int temp=A[pivot];
	        A[pivot]=A[j-1];
	        A[j-1]=temp;
	    }
	    
	 
	        return j-1;
	}
	static void print(int arr[])
	{
	    for (int i = 0; i < arr.length; ++i)
	        System.out.print(arr[i]+" ");
	}
	static void kthsmallest(int a[], int start,int end, int k)
	{//not quick sort but just method
		  int part ;
		    if(start <end) {
		        part  =  partition(a, start, end);
		            if(part == k-1){
		                System.out.println("kth smallest element : "+ a[part]);
		            }
		        if(part>k-1){
		        	kthsmallest(a, start,part, k);
		        }
		        else{
		        	kthsmallest(a, part+1, end, k);
		        }
		    }
	}

public static void main(String[] args) {
	 int arr[] = {3, 5, 9, 6, 8, 20, 10, 12, 18, 9};//min heap
	 Scanner sc=new Scanner(System.in);
	 
	 System.out.println("\nMin Heap is : ");
	 print(arr);

	 System.out.println("\nEnter kth max element in min heap...");
	 int k=sc.nextInt();
	 k=arr.length-k+1;
	 kthsmallest(arr, 0, arr.length,k);
	 
	 int arr1[]={20,18,10,12 ,9,9,3,5,6,8};
	 System.out.println("\n\n\nMax Heap is : ");
	 print(arr1);
	 
	 System.out.println("\nEnter kth min element in max heap...");
	 k=sc.nextInt();
	 
	 kthsmallest(arr, 0, arr.length,k);
	 
	 
}
}
