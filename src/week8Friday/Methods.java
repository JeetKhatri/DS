package week8Friday;

import week8Tuesday.NodeDoubly;

public class Methods<T> {

	private Tree<T> head, p, q, temp = null;

	public boolean insertNode(int no) {
		
		boolean flag = false;
		if (head == null) {
			head = new Tree(null, no, null);
			flag = true;
		} else {
			temp = new Tree(null, no, null);
			p = head;
		/*	while (p.getNext() != null)
				p = p.getNext();
			p.setNext(temp);
			temp.setPrev(p);*/
			flag = true;
		}
		return flag;
	}
}
