package week7Friday;

public class Q2Methods<T> {

	private Node<T> head, p, q, temp = null;
	private int MAX_LENGTH = 5, f = -1, r = -1;

	public String insertAtLast(String no) {
		if (isQueueFull()) {
			return "Queue Full";
		} else {
			checkForInsert();
			if (head == null) {
				head = new Node(no, null);
			} else {
				Node<T> temp = new Node(no, null);
				p = head;
				while (p.getNext() != null)
					p = p.getNext();
				p.setNext(temp);
			}
		}
		return no + " inserted";
	}

	public void checkForInsert() {
		if (isQueueFull()) {
		} else {
			if (f == -1 && r == -1) {
				f = 0;
				r = 0;
			} else if (r == MAX_LENGTH - 1) {
				r = 0;
			} else {
				r++;
			}
		}
	}

	public String deleteAtBegining() {
		String s = head.getData() + " Deleted";
		head = head.getNext();
		checkForDelete();
		return s;
	}

	public void checkForDelete() {
		if (f == r) {
			f = -1;
			r = -1;
		} else if (f == MAX_LENGTH - 1) {
			f = 0;
		} else
			f++;
	}

	public String displayLinkedList() {
		String s = "";
		p = head;
		while (p != null) {
			s += p.getData()+" ";
			p = p.getNext();
		}
		return s;
	}

	boolean isQueueFull() {
		if ((r == MAX_LENGTH-1 && f == 0) || r == f - 1)
			return true;
		else
			return false;
	}

	public int totalEliment() {
		int n = 0;
		p = head;
		while (p != null) {
			n++;
			p = p.getNext();
		}
		return n;
	}
}
