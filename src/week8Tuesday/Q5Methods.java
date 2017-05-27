package week8Tuesday;

public class Q5Methods {

	public int length = 0;
	private Q5Node head, p;

	void insertAtLast(int mul, int power) {
		if (head == null) {
			head = new Q5Node(mul, power, null);
		} else {
			Q5Node temp = new Q5Node(mul, power, null);
			p = head;
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(temp);
		}
	}

	String displayLinkedList() {
		String s = "";
		p = head;
		while (p != null) {
			// s += p.getMul()+"x^"+p.getPower()+"+";
			if (p.getMul() > 1)
				s += p.getMul() + "";
			else if (p.getMul() == 0)
				s += "";
			if (p.getMul() != 0) {
				if (p.getPower() == 1)
					s += "x";
				else if (p.getPower() == 0)
					s += "";
				else
					s += "x^" + p.getPower();
			}
			if (p.getMul() != 0)
				s += "+";
			p = p.getNext();
		}
		return s.substring(0, s.length() - 1);
	}

	public int evaluate(int x) {
		int ans = 0;
		Q5Node temp = this.head;
		while (temp != null) {
			ans += temp.getMul() * Math.pow(x, temp.getPower());
			temp = temp.getNext();
		}
		return ans;
	}

	public static Q5Methods add(Q5Methods pol1, Q5Methods pol2) {
		Q5Methods sum = new Q5Methods();
		Q5Node temp1 = pol1.head;
		while (temp1 != null) {
			sum.insertAtLast(temp1.getMul(), temp1.getPower());
			temp1 = temp1.getNext();
		}
		temp1 = pol2.head;
		while (temp1 != null) {
			sum.insertAtLast(temp1.getMul(), temp1.getPower());
			temp1 = temp1.getNext();
		}
		return sum;
	}

	public static Q5Methods subtract(Q5Methods pol2,Q5Methods pol1)
	{
		Q5Methods sum=new Q5Methods();
		Q5Node temp1=pol2.head;
		while(temp1!=null)
		{
			sum.insertAtLast(temp1.getMul(),temp1.getPower());
			temp1=temp1.getNext();
		}
		temp1=pol1.head;
		while(temp1!=null)
		{
			sum.insertAtLast(temp1.getMul()*-1,temp1.getPower());
			temp1=temp1.getNext();
		}
		return sum;
	}

	String displayLinkedList2() {
		String s = "";
		p = head;
		while (p != null) {
			// s += p.getMul()+"x^"+p.getPower()+"+";
			if (p.getMul() > 1)
				s += p.getMul() + "";
			else if (p.getMul() == 0)
				s += "";
			if (p.getMul() != 0) {
				if (p.getPower() == 1)
					s += "x";
				else if (p.getPower() == 0)
					s += "";
				else
					s += "x^" + p.getPower();
			}
			if (p.getMul() != 0)
				s += "-";
			p = p.getNext();
		}
		return s.substring(0, s.length() - 1);
	}
}
