package week11Tuesday; 

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class TreeImplemantion extends TreeList<Integer> 
{
	public static void main(String[] args) throws NumberFormatException, IOException 
	{
		TreeImplemantion treeImplemantion = new TreeImplemantion();
		
		Tree root=new Tree();
		Tree left=new Tree();
		Tree right=new Tree();
		Tree left1=new Tree();
		
		root.setData(5);
		left.setData(10);
		left1.setData(3);
		right.setData(12);
		root.setLeft(left);
		root.setRight(right);
		left.setLeft(left1);
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc=new Scanner(System.in);
		
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Inorder");
			System.out.println("4 - Preorder");
			System.out.println("5 - Postorder");
			System.out.println("6 - Exit");
			System.out.println("7 - lca");     //lowest common ancestor
			System.out.println("8 - isbst");
			System.out.println("9 - Predecessor & Succesor");
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) 
			{
				case 1:
					int no = Integer.valueOf(bufferedReader.readLine());
					treeImplemantion.add(no);
					break;
				case 2:
					no = Integer.valueOf(bufferedReader.readLine());
					treeImplemantion.deleteKey(no);
					break;
				case 3:
					treeImplemantion.inOrder();
					break;
				case 4:
					treeImplemantion.preOrder();
					break;
				case 5:
					treeImplemantion.postOrder();
					break;
				case 6:
					break;
				case 7:
					String n1=sc.next();
					String n2=sc.next();
					Tree x1=treeImplemantion.find(treeImplemantion.getRoot(), n1);
					Tree x2=treeImplemantion.find(treeImplemantion.getRoot(), n2);
					Tree x3=treeImplemantion.LCA(x1,x2);
					System.out.println("Lca : "+x3.getData()+"");
					break;
				case 8:
					System.out.println(treeImplemantion.isbst(root));
					break;
				case 9:
					ArrayList s = new ArrayList();
					s = treeImplemantion.pre(treeImplemantion.getRoot());
					System.out.println("Enter key..");
					String u = sc.next();
					int i = s.indexOf(u);
				
					if (i != -1) {
						if (i == 0)
							System.out.println("Predecessor : " + s.get(i));
						else
							System.out.println("Predecessor : " + s.get(i - 1));
						
						if (i == s.size() - 1)
							System.out.println("Succesor : " + s.get(i));
						else
							System.out.println("Succesor : " + s.get(i + 1));

					} else {
						System.out.println("Element does not found..");
					}
					break;
				case 10:
					System.out.println("GOOD BYE....!!");
					System.exit(0);
					break;
			}
		}
	}
}