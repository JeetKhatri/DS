package week7Tuesday;

public class NodeUsingGetterSetter<T> {
	
	private T data;
	private NodeUsingGetterSetter<T> next;
	
	public NodeUsingGetterSetter() {}
	
	NodeUsingGetterSetter(T data,NodeUsingGetterSetter<T> next){
		this.data=data;
		this.next=next;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public NodeUsingGetterSetter<T> getNext() {
		return next;
	}

	public void setNext(NodeUsingGetterSetter<T> next) {
		this.next = next;
	}
	
	

}







/*package week8;

public class NodeUsingGetterSetter {
	
	private int data;
	private NodeUsingGetterSetter next;
	
	public NodeUsingGetterSetter() {}
	
	NodeUsingGetterSetter(int data,NodeUsingGetterSetter next){
		this.data=data;
		this.next=next;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public NodeUsingGetterSetter getNext() {
		return next;
	}
	public void setNext(NodeUsingGetterSetter next) {
		this.next = next;
	}

}
*/