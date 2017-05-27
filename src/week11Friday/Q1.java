package week11Friday;

import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		
		Q1Methods<Integer> q1Methods = new Q1Methods<Integer>();
		
		Tree root=new Tree();
		Tree left=new Tree();
		Tree right=new Tree();
		Tree left1=new Tree();    //checking bst or not
		root.setData(5);
		left.setData(10);          //           5
		left1.setData(3);          //       10     12
		right.setData(12);         //    3
		root.setLeft(left);
		root.setRight(right);
		left.setLeft(left1);
		
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Inorder");
			System.out.println("4 - Preorder");
			System.out.println("5 - Postorder");
			System.out.println("6 - Level order");
			System.out.println("7 - lca");     //lowest common ancestor
			System.out.println("8 - isbst");
			System.out.println("9 - Predecessor & Succesor");
			System.out.println("0 - Exit");
			System.out.println("Enter a choice :: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter no : ");
				int no = sc.nextInt();
				q1Methods.add(no);
				break;
			case 2:
				System.out.println("Enter no : ");
				no = sc.nextInt();
				q1Methods.delete(no);
				break;
			case 3:
				q1Methods.inOrder();
				break;
			case 4:
				q1Methods.preOrder();
				break;
			case 5:
				q1Methods.postOrder();
				break;
			case 6:
				q1Methods.levelOrder();
				break;
			case 7:
				System.out.println("Enter 2 Numbers : ");
				int no1 = sc.nextInt();
				int no2 = sc.nextInt();
				System.out.println("LCA("+no1+", "+no2+") = " + q1Methods.findLCA(no1, no2).getData());
				break;
			case 8:
				System.out.println(q1Methods.isBST(root));
				break;
			case 0:
				b = false;
				System.out.println("END");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}
}
