package week11Tuesday; 
import java.util.LinkedList;
import java.util.Queue;

public class Heap<T> {
	private int length = 0;
	private Tree head;

	public void add(int elem) {
		Tree newTree = new Tree(elem);
		if (this.head == null) {
			this.head = newTree;
			return;
		}
		Queue<Tree> queue = new LinkedList<>();
		queue.add(this.head);
		this.add(newTree, queue);
	}

	private void add(Tree newTree, Queue<Tree> queue) {
		Queue<Tree> temp = new LinkedList<Tree>();
		for (Tree tempnode : queue)
			temp.add(tempnode);
		for (Tree tempnode : temp)
			if (tempnode.isFull()) {
				queue.add(tempnode.getLeft());
				queue.add(tempnode.getRight());
				queue.poll();
			} else {
				if (tempnode.getLeft() == null)
					tempnode.setLeft(newTree);
				else
					tempnode.setRight(newTree);
				return;
			}
		this.add(newTree, queue);
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Tree getHead() {
		return head;
	}

	public void setHead(Tree head) {
		this.head = head;
	}
	public void inOrder(Tree node) {
		if (node != null) {
			inOrder(node.getLeft());
			System.out.print(node.getData() + " ");
			inOrder(node.getRight());
		}
	}

	public void postOrder(Tree node) {
		if (node != null) {
			postOrder(node.getLeft());
			postOrder(node.getRight());
			System.out.print(node.getData() + " ");
		}
	}

	public void preOrder(Tree node) {
		if (node != null) {
			System.out.print(node.getData() + " ");
			preOrder(node.getLeft());
			preOrder(node.getRight());
		}
	}
	public void printLevelOrder() {

		int i;
		for (i = 0; i <= getSize(this.head); i++) {
			printGivenLevel(this.head, i);
			System.out.println();
		}
	}

	private void printGivenLevel(Tree node, int level) {
		if (node == null)
			return;
		if (level == 1)
			System.out.print(node.getData() + " ");
		else if (level > 1) {
			printGivenLevel(node.getLeft(), level - 1);
			printGivenLevel(node.getRight(), level - 1);
		}
	}

	public int getSize(Tree tree) {
		if (tree == null)
			return 0;
		else
			return getSize(tree.getLeft()) + getSize(tree.getRight()) + 1;
	}




}
