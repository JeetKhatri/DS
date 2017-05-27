package week8Tuesday;

import week7Friday.Node;

public class Q2MethodsCircular<T> {

	private Node<T> head, p, q, temp = null;

	public boolean insertAtLast(String no) {
		boolean flag = false;
		if (head == null) {
			head = new Node(no, null);
			head.setNext(head);
			flag = true;
		} else {
			Node<T> temp = new Node(no, head);
			p = head.getNext();
			while (p.getNext() != head)
				p = p.getNext();
			p.setNext(temp);
			flag = true;
		}
		return flag;
	}

	String displayLinkedList() {
		String s = head.getData() + " ";
		p = head.getNext();
		while (p != head) {
			s += p.getData() + " ";
			p = p.getNext();
		}
		return s;
	}

	boolean insertAtBegining(String no) {
		boolean flag = false;
		if (head == null) {
			head = new Node(no, null);
			head.setNext(head);
			p = head;
			flag = true;
		} else {
			q = head.getNext();
			while (q.getNext() != head) {
				q = q.getNext();
			}
			p = new Node(no, head);
			q.setNext(p);
			head = p;
			flag = true;
		}
		return flag;
	}

	public boolean insertAfterSpecificNo(String no, String oldNo) {
		boolean flag = false;
		if (head.getData().equals(oldNo)) {
			head = new Node(no, null);
			head.setNext(head);
			flag = true;
		} else {
			p = head.getNext();
			while (p.getNext() != head) {
				if (p.getData().equals(oldNo)) {
					temp = new Node(no, p.getNext());
					p.setNext(temp);
					flag = true;
					break;
				}
				p = p.getNext();
			}
		}
		return flag;
	}

	public boolean deleteAtLast() {
		boolean flag = false;
		p = head.getNext();
		q = head.getNext();
		while (p.getNext() != head) {
			p = p.getNext();
		}
		while (q.getNext() != p) {
			q = q.getNext();
		}
		q.setNext(p.getNext());
		p.setNext(null);
		flag = true;
		return flag;
	}

	public boolean deleteAtBegining() {
		boolean flag = false;
		if (head == null)
			flag = false;
		else {
			p = head.getNext();
			q = head.getNext();
			while (p.getNext() != head) {
				p = p.getNext();
			}
			p.setNext(q);
			head = q;
			flag = true;
		}
		return flag;
	}

	public boolean deleteAtAny(String oldNo) {
		boolean flag=false;
		if (head == null) {
				flag =false;
		}else if(head.getData().equals(oldNo)){
			if(deleteAtBegining())
				flag=true;
		}else {
			p = head;
			while (!p.getData().equals(oldNo)) {
				p = p.getNext();
			}
			q = head.getNext();
			while (q.getNext() != p) {
				q = q.getNext();
			}
			q.setNext(p.getNext());
			flag=true;
		}
		return flag;
	}

	public Node<T> getHead() {
		return head;
	}

}
