package week8Friday;

public class Tree<T> {

	private T data;
	private Tree<T> leftChild;
	private Tree<T> rightChild;
	
	public Tree(){}

	public Tree(Tree<T> leftChild,T data,Tree<T> rightChild){
		this.data=data;
		this.leftChild=leftChild;
		this.rightChild=rightChild;
	}
	
	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Tree<T> getLeftChild() {
		return leftChild;
	}

	public void setLeftChild(Tree<T> leftChild) {
		this.leftChild = leftChild;
	}

	public Tree<T> getRightChild() {
		return rightChild;
	}

	public void setRightChild(Tree<T> rightChild) {
		this.rightChild = rightChild;
	}
	
}
