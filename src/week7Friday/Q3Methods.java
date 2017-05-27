package week7Friday;

public class Q3Methods<T> {

	private Node<T> head, p, q, temp = null;
	int top = 0, MAX_LENGTH = 5;

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
		if (isFull()) {
			return "Stack Full\n";
		} else {
			if (head == null) {
				head = new Node(no, null);
			} else {
				Node<T> temp = new Node(no, null);
				p = head;
				while (p.getNext() != null)
					p = p.getNext();
				p.setNext(temp);
			}
			top++;
			return no + " inserted";
		}
	}

	public String deleteAtLast() {
		if (isEmpty()) {
			return "Stack Empty.\n";
		} else {
			p = head;
			q = head;
			while (p.getNext() != null) {
				p = p.getNext();
			}
			while (q.getNext() != p) {
				q = q.getNext();
			}
			String s = q.getNext().getData() + " Deleted";
			q.setNext(null);
			top--;
			return s;
		}
	}

	public boolean isEmpty() {
		if (top == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean isFull() {
		if (top == MAX_LENGTH) {
			return true;
		} else {
			return false;
		}
	}
}
