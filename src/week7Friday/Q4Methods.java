package week7Friday;


public class Q4Methods<T> {

	private Node<T> head, p, q, temp = null;
	
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
		return no + " inserted";
	}
	private String insertAtBegining(String no) {
		if (head == null) {
			head = new Node(no, null);
		} else {
			temp = new Node(no, head);
			head = temp;
		}
		return no + "";
	}
	public String deleteAtLast() {
		p = head;
		q = head;
		while (p.getNext() != null) {
			p = p.getNext();
		}
		while (q.getNext() != p) {
			q = q.getNext();
		}
		String s = q.getNext().getData()+"";
		q.setNext(null);
		return s;
	}
	public void rotateLinkedList(int k)
	{
		for(int i=0;i<k;i++){
			String no = deleteAtLast();
			insertAtBegining(no);
		}
	}
}
