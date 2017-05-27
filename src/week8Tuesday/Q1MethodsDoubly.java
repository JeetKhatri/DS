package week8Tuesday;

import week8Tuesday.NodeDoubly;

public class Q1MethodsDoubly<T> {

	private NodeDoubly<T> head, p, q, temp = null;

	public boolean insertAtLast(String no) {
		boolean flag = false;
		if (head == null) {
			head = new NodeDoubly(null, no, null);
			flag = true;
		} else {
			temp = new NodeDoubly(null, no, null);
			p = head;
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(temp);
			temp.setPrev(p);
			flag = true;
		}
		return flag;
	}

	String displayLinkedList() {
		String s = "";
		p = head;
		while (p.getNext() != null) {
			s += p.getData() + " ";
			p = p.getNext();
		}
		s+=p.getData()+"\n";
		while (p.getPrev() != null) {
			s += p.getData() + " ";
			p = p.getPrev();
		}
		s+=p.getData()+"\n";
		return s;
	}

	boolean insertAtBegining(String no) {
		boolean flag = false;
		if (head == null) {
			head = new NodeDoubly(null, no, null);
			flag = true;
		} else {
			temp = new NodeDoubly(null, no, head);
			head = temp;
			flag = true;
		}
		return flag;
	}
	boolean insertAfterSpecificNo(String no, T oldNo) {
		boolean flag=false;
		p = head;
		int f = 0;
		while (p != null) {
			if (p.getData().equals(oldNo)) {
				f = 1;
				break;
			}
			p = p.getNext();
		}
		if (f == 1) {
			temp = new NodeDoubly(null,no, p.getNext());
			p.setNext(temp);
			temp.setPrev(p);
			flag=true;
		} else {
			flag=false;
		}
		return flag;
	}
	
	boolean deleteAtLast() {
		boolean flag = false;
		if (head != null) {
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
			flag = true;
		}
		return flag;
	}

	boolean deleteAtBegining() {
		boolean flag = false;
		if (head != null) {
			head = head.getNext();
			flag = true;
		}
		return flag;
	}

	boolean deleteAtAny(T oldNo) {
		boolean flag = false;
		if (head != null) {
			p = head;
			int f = 0;
			while (p != null) {
				if (p.getNext().getData().equals(oldNo)) {
					f = 1;
					break;
				}
				p = p.getNext();
			}
			if (f == 1) {
				q = p.getNext().getNext();
				p.setNext(q);
				q.setPrev(p);
				
				flag=true;
			} else {
				flag=false;
			}
			flag = true;
		}
		return flag;
	}
}
