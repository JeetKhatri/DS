package week7Friday;

public class Q7Methods<T> {

	private Node<T> head, p, q;

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
		return no + " inserted";
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
	
	public Node<T> mergeSort(Node<T> head) {

		if (head == null || head.getNext() == null)
			return head;

		Node<T> mid = getMidNode(head);
		Node<T> secondList = mid.getNext();
		mid.setNext(null);

		return merge(mergeSort(head), mergeSort(secondList));

	}

	public Node<T> merge(Node<T> h1, Node<T> h2) {

		Node<T> result;
		if (h1 == null)
			return h2;
		if (h2 == null)
			return h1;
		if (Integer.parseInt((String) h1.getData()) <= Integer
				.parseInt((String) h2.getData())) {
			result = h1;
			result.setNext(merge(h1.getNext(), h2));
		} else {
			result = h2;
			result.setNext(merge(h1, h2.getNext()));
		}
		return result;
	}

	public Node<T> getMidNode(Node<T> head) {

		Node<T> fast, slow;
		fast = slow = head;

		while (fast.getNext() != null && fast.getNext().getNext() != null) {
			fast = fast.getNext().getNext();
			slow = slow.getNext();
		}
		return slow;

	}
}
