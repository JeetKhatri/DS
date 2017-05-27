package week5;

import java.util.Scanner;


public class InverseOfMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("2. 2X2\n3. 3X3\nEnter matrix type : ");
		int n = sc.nextInt();
		if(n<2 || n>3) 
			System.out.println("Invalid choice");
		else
		{
			System.out.println("\nEnter matrix :-");
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("arr["+i+"]["+j+"] : ");
					arr[i][j] = sc.nextInt();
				}
			}
			if(n==3)
				System.out.println(processInverse(arr,n));
			else if(n==2)
				System.out.println(makeInverse2X2(arr));
		}
	}

	private static String processInverse(int[][] arr,int n) {
		System.out.println();
		String s="";
		int a1 = arr[0][0],a2 = arr[0][1],a3 = arr[0][2];
		int b1 = arr[1][0],b2 = arr[1][1],b3 = arr[1][2];
		int c1 = arr[2][0],c2 = arr[2][1],c3 = arr[2][2];
		int cal = a1*b2*c3 + a2*b3*c1 + a3*b1*c2 - a1*b3*c2 - a3*b2*c1 - a2*b1*c3;
		if(cal==0){
			return "Matrix not exist";
		}else{
		int temp[][] = new int[n][n];
		String str="";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				str="";
				for (int l = 0; l < n; l++) {
					for (int r = 0; r < n; r++) {
						
						if(l==i || r==j){
						}else{
							str+= arr[l][r]+" ";
						}
					}
				}
				temp[i][j] = makeMatrix(str,n);
			}
		}
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if((i-j ==1 || i-j==-1) && temp[i][j] > 0){
					temp[i][j]=-temp[i][j];
				}else if((i-j ==1 || i-j==-1) && temp[i][j] < 0){
					temp[i][j] = (temp[i][j]-(temp[i][j]*2));
				}
			}
		}
		
		int tempsam[][] = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tempsam[i][j] = temp[j][i];
			}
		}
		int no1 =makeInverse3X3(tempsam);;
		/*	        */
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				tempsam[i][j] = tempsam[i][j]*no1;
			}
		}
		System.out.println();
		//display
				for (int i = 0; i < n; i++) {
					for (int j = 0; j < n; j++) {
						System.out.print(tempsam[i][j]+" ");
					}
					System.out.println();
				}
		}		
		return s;
	}

	public static int makeInverse3X3(int arr[][]){
		int no1 = arr[0][0]*((arr[1][1]*arr[2][2])-(arr[1][2]*arr[2][1]));
		int no2 = arr[1][0]*((arr[0][1]*arr[2][2])-(arr[0][2]*arr[2][1]));
		int no3 = arr[2][0]*((arr[0][1]*arr[1][2])-(arr[0][2]*arr[1][1]));
		return -(no1+no2+no3);
	}
	
	public static int makeMatrix(String str,int n) {

		String[] a = str.split(" ");
		int cnt=0;
		int tempArr[][] = new int[n-1][n-1];
		while(cnt<a.length){
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++,cnt++) {
					tempArr[i][j] = Integer.parseInt(a[cnt]);
				}
			}
		}
		return (tempArr[0][0] * tempArr[1][1])-(tempArr[0][1] * tempArr[1][0]);
	}
	
	
	
	public static String makeInverse2X2(int arr[][]){
		String s="";
		int no1 = (arr[0][0] * arr[1][1])-(arr[0][1] * arr[1][0]);
//		System.out.println(no1+" < no1");
		if(no1 == 0){
			s+="0  0\n0  0";
		}else{
			double newArr[][] = new double[2][2];
			newArr[0][0] = arr[1][1];
			newArr[1][1] = arr[0][0];
			newArr[0][1] = -arr[0][1];
			newArr[1][0] = -arr[1][0];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					s+=(newArr[i][j]/no1)+"  ";
				}
				s+="\n";
			}
		}
		return s;
	}
}
 










/*
import java.util.Scanner;
 


public class InverseOfMatrix {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("2. 2X2\n3. 3X3\n4. 4X4\nEnter matrix type : ");
		int n = sc.nextInt();
		if(n<2 || n>4) 
			System.out.println("Invalid choice");
		else
		{
			System.out.println("\nEnter matrix :-");
			int arr[][] = new int[n][n];
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					System.out.print("arr["+i+"]["+j+"] : ");
					arr[i][j] = sc.nextInt();
				}
			}
			if(n==3)
				System.out.println(processInverse(arr,n));
			else if(n==2)
				System.out.println(makeInverse2X2(arr));
		}
	}

	private static String processInverse(int[][] arr,int n) {
		System.out.println();
		String s="";
		int no1,no2,no3,no4;
		String str="";
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				str="";
				for (int l = 0; l < n; l++) {
					for (int r = 0; r < n; r++) {
						
						if(l==i || r==j){
						}else{
							str+= arr[l][r]+" ";
						}
					}
				}
				makeMatrix(str,n);
			}
		}
		return s;
	}

	public static void makeMatrix(String str,int n) {

		String[] a = str.split(" ");
		int cnt=0;
		int tempArr[][] = new int[n-1][n-1];
		while(cnt<a.length){
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++,cnt++) {
					tempArr[i][j] = Integer.parseInt(a[cnt]);
				}
			}
		}
		
		for (int i = 0; i < tempArr.length; i++) {
			for (int j = 0; j < tempArr.length; j++) {
				System.out.println(tempArr[i][j]);
			}
		}
		System.out.println(makeInverse2X2(tempArr));
	}
	public static String makeInverse2X2(int arr[][]){
		String s="";
		int no1 = (arr[0][0] * arr[1][1])-(arr[0][1] * arr[1][0]);
//		System.out.println(no1+" < no1");
		if(no1 == 0){
			s+="0  0\n0  0";
		}else{
			double newArr[][] = new double[2][2];
			newArr[0][0] = arr[1][1];
			newArr[1][1] = arr[0][0];
			newArr[0][1] = -arr[0][1];
			newArr[1][0] = -arr[1][0];
			for (int i = 0; i < 2; i++) {
				for (int j = 0; j < 2; j++) {
					s+=(newArr[i][j]/no1)+"  ";
				}
				s+="\n";
			}
		}
		return s;
	}
}
*/