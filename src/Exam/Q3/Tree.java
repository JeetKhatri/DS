package Exam.Q3;

public class Tree {

	private int data;
	private Tree left;
	private Tree right;
	
	public Tree(){
		data=0;
		left=null;
		right=null;
	}
	
	public Tree(int data){
		this.data=data;
		this.left=null;
		this.right=null;
	}
	
	public boolean isFull(){
		return this.left!=null && this.right!=null;
	}

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
