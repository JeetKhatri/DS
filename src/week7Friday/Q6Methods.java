package week7Friday;

public class Q6Methods<T> {

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

	public boolean compareTwoLinkedList(Q6Methods<String> obj1,Q6Methods<String> obj2) {
		p = (Node<T>) obj1.head;
		q = (Node<T>) obj2.head;
		temp=q;
		boolean flag=false;
		int cnt=0;
		while (p != null) {
			while (q != null) {
				System.out.println(p.getData() +" "+q.getData());
				if(p.getData().equals(q.getData())){
					cnt++;
					//break;
				}
				q=q.getNext();
			}
			q = temp;
			p = p.getNext();
		}
		if(cnt==totalEliment()) flag=true;
		return flag;
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
