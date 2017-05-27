package week8Tuesday;

import week7Friday.Node;

public class Q3Methods<T> {

	public boolean checkIsCercular(Node<T> head) {
		
		boolean flag=false;
		if (head == null)
		       flag=true;
		else{
			Node<T> temp = head.getNext();	
			while (temp != null && temp != head)
				temp = temp.getNext();
			if(temp == head)
				flag=true;
		}
		return flag;
	}
	

}
