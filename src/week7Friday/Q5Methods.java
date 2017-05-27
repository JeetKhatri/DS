package week7Friday;

public class Q5Methods<T> {

	private Node<T> head, p,q;
	private int cnt=0;
	
	public Node<T> getHead()
	{
		return head;
	}

	public String displayLinkedList() {
		String s = "";
		p = head;
		while (p != null) {
			s += p.getData() + " ";
			p = p.getNext();
		}
		return s;
	}

	public String insertAtLast(String no) {
		if (head == null) {
			head = new Node(no, null);
		} else {
			Node<T> temp = new Node(no, null);
			p = head;
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(temp);
		}
		cnt++;
		return no + " inserted";
	}

	public Node<T> getLastNode(){
		Node<T> temp = head;
		while (temp.getNext() != null)
			temp = temp.getNext();
		return temp;
	}
	
	public void generateLoop(T data) {
		p = head;
		while (p != null) {
			if(p.getData().equals(data)){
				q = getLastNode();
				q.setNext(p);
				break;
			}
			p = p.getNext();
		}
	}
	
	public boolean detectLoop(){
		p=head;
		boolean flag=false;
		for (int i = 0; i < cnt-1; i++) {
			p=p.getNext();
		}
		if(p.getNext() != null){
			p.setNext(null);
			flag=true;
		}
		return flag;
	}
}
