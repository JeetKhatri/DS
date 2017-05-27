package week13Tuesday;

public class Node {

	private int data;
	private Node left,right;
	
	Node(){
		data=0;
		left=null;
		right=null;
	}
	
	Node(int data){
		this.data=data;
		left=null;
		right=null;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}
	
	
	
}
