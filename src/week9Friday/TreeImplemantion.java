package week9Friday;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TreeImplemantion extends TreeList<Integer> {
	public static void main(String[] args) throws NumberFormatException, IOException {
		TreeImplemantion treeImplemantion = new TreeImplemantion();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println();
			System.out.println("1 - Insert");
			System.out.println("2 - Delete");
			System.out.println("3 - Inorder");
			System.out.println("4 - Preorder");
			System.out.println("5 - Postorder");
			System.out.println("6 - Level Wise");
			System.out.println("7 - Exit");
			System.out.println();
			System.out.println("Enter a choice :: ");
			int choice = Integer.valueOf(bufferedReader.readLine());
			switch (choice) {
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
				treeImplemantion.printLevelOrder();
				break;
			case 10:
				treeImplemantion.inOrderArray();
				break;
			case 7:
				System.out.println("GOOD BYE....!!");
				System.exit(0);
				break;
			}

		}

	}

	

}
