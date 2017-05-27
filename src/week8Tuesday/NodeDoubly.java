package week8Tuesday;

public class NodeDoubly<T> {

	private T data;
	private NodeDoubly<T> next;
	private NodeDoubly<T> prev;
	
	public NodeDoubly() {}
	
	public NodeDoubly(NodeDoubly<T> prev,T data,NodeDoubly<T> next){
		this.data=data;
		this.next=next;
		this.prev=prev;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeDoubly<T> getNext() {
		return next;
	}

	public void setNext(NodeDoubly<T> next) {
		this.next = next;
	}

	public NodeDoubly<T> getPrev() {
		return prev;
	}

	public void setPrev(NodeDoubly<T> prev) {
		this.prev = prev;
	}
}