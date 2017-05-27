package week11Tuesday; 
class Tree {

	private int data;
	private Tree left;
	private Tree right;
	private Tree parent;
	
	public Tree getParent() {
		return parent;
	}

	public void setParent(Tree parent) {
		this.parent = parent;
	}

	public Tree() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	
	public boolean isFull() {
		return this.left != null && this.right != null;
	}


	public Tree(int data) {
		this.data = data;
		this.left = null;
		this.right = null;
		this.parent=null;
	}

	// getter setter method
	
	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Tree getLeft() {
		return left;
	}

	public void setLeft(Tree left) {
		this.left = left;
	}

	public Tree getRight() {
		return right;
	}

	public void setRight(Tree right) {
		this.right = right;
	}

}
