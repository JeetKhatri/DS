package week7Friday;

public class Q1Method<T>
{
	private Node<T> head, p, q, temp = null;
	private int MAX_LENGTH=5,cnt=0;

	public String insertAtLast(String no) {
		if (head == null) {
			head = new Node(no, null);
			cnt++;
		} else {
			if(!isEmpty())	
			{
				Node<T> temp = new Node(no, null);
				p = head;
				while (p.getNext() != null)
					p = p.getNext();
				p.setNext(temp);
				cnt++;
			}else{
				return "Queue Full";
			}
		}
		return no + " inserted";
	}
	public String deleteAtBegining() {
		String s = head.getData() + " Deleted";
		head = head.getNext();
		return s;
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
	public boolean isEmpty()
	{
		if(cnt < MAX_LENGTH)
			return false;
		else
			return true;
	}
	public Node<T> getHead() {
		return head;
	}

}
