package week11Tuesday; 
import java.util.HashMap;
import java.util.Map;

public class MyTree {

	private Tree root;
	private Map<Integer, Tree> trees;

	public MyTree() {
		trees = new HashMap<Integer, Tree>();
	}

	public Tree binaryTreeInsert(int level, int parent, char side, int data) {
		Tree tree = new Tree(data);
		if (this.getRoot() == null) {
			trees.put(0, tree);
			root = tree;
		} else {

			if (side == 'l') {
				trees.get((int) Math.pow(2, level) - 1 + parent - 1).setLeft(tree);
				trees.put((((int) Math.pow(2, level) - 1 + parent - 1) * 2) + 1, tree);
			} else {
				trees.get((int) Math.pow(2, level) - 1 + parent - 1).setRight(tree);
				trees.put((((int) Math.pow(2, level) - 1 + parent - 1) * 2) + 2, tree);
			}

		}

		return tree;
	}

	public void add(int data) {
		root = add(this.root, data);
	}

	private Tree add(Tree node, int key) {
		if (node == null) {
			node = new Tree(key);
			return node;
		}

		if ((Integer) key < (Integer) node.getData())
			node.setLeft(add(node.getLeft(), key));
		else if ((Integer) key > (Integer) node.getData())
			node.setRight(add(node.getRight(), key));

		return node;
	}

	public Map<Integer, Tree> getTrees() {
		return trees;
	}

	public void setTrees(Map<Integer, Tree> trees) {
		this.trees = trees;
	}

	public Tree getRoot() {
		return root;
	}

	public void setRoot(Tree root) {
		this.root = root;
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
		for (i = 0; i <= getSize(this.root); i++) {
			printGivenLevel(this.root, i);
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

	public boolean contains(Tree tree, int element) {
		if (tree.getData()==element)
			return true;
		if ((Integer) element < (Integer) tree.getData()) {
			if (tree.getLeft() != null)
				return contains(tree.getLeft(), element);
			else
				return false;
		}
		if ((Integer) element > (Integer) tree.getData()) {
			if (tree.getRight() != null)
				return contains(tree.getRight(), element);
			else
				return false;
		}
		return false;
	}

	public void deleteKey(int key) {
		root = delete(this.root, key);
	}

	public Tree delete(Tree node, int key) {
		if (node == null)
			return node;

		if ((Integer) key < (Integer) node.getData())
			node.setLeft(delete(node.getLeft(), key));
		else if ((Integer) key > (Integer) node.getData())
			node.setRight(delete(node.getRight(), key));
		else {
			if (node.getLeft() == null)
				return node.getRight();
			else if (node.getRight() == null)
				return node.getLeft();
			node.setData(minValue(node.getRight()));
			node.setRight(delete(node.getRight(), node.getData()));
		}

		return node;
	}

	public int minValue(Tree node) {
		int minv = node.getData();
		while (node.getLeft() != null) {
			minv = node.getLeft().getData();
			node = node.getLeft();
		}
		return minv;
	}

	public String sortedString() {
		return sortedString(this.getRoot(), new String());
	}

	private String sortedString(Tree tree, String str) {
		if (tree.getLeft() == null && tree.getRight() == null)
			return str += tree.getData() + ",";
		if (tree.getLeft() != null)
			str = sortedString(tree.getLeft(), str);
		str += tree.getData() + ",";
		if (tree.getRight() != null)
			str = sortedString(tree.getRight(), str);
		return str;
	}

	public boolean isBST() {
		if (this.getRoot() == null)
			return false;
		String[] str = this.sortedString().split(",");
		for (int i = 1; i < str.length; i++)
			if (Integer.parseInt(str[i - 1]) > Integer.parseInt(str[i]))
				return false;
		return true;
	}

}
