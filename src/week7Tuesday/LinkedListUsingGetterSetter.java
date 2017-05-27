package week7Tuesday;

import java.util.Scanner;


public class LinkedListUsingGetterSetter<T> {

	private NodeUsingGetterSetter<T> head, p, q, temp = null;

	public static void main(String[] args) {

		LinkedListUsingGetterSetter<String> ll = new LinkedListUsingGetterSetter<String>();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("\n1. insert at Last\n2. insert at Begining\n3. Insert After Specific Number\n4. Insert Before Specific Number\n5. Insert Number at pecific position");
			System.out.println("7. Delete First\n8. Delete last\n9. Delete Any\n10. Delete wise index");
			System.out.println("11. Reverse\n12. Display\n0. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			sc.nextLine();
			switch (ch) {
			case 1:
				System.out.println("Enter no : ");
				String no = sc.nextLine();
				System.out.println(ll.insertAtLast(no));
				break;
			case 2:
				System.out.println("Enter no : ");
				no = sc.nextLine();
				System.out.println(ll.insertAtBegining(no));
				break;
			case 3:
				System.out.println("Enter no for insert : ");
				no = sc.nextLine();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select no : ");
				String oldNo = sc.nextLine();
				System.out.println(ll.insertAfterSpecificNo(no, oldNo));
				break;
			case 4:
				System.out.println("Enter no for insert : ");
				no = sc.nextLine();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select no : ");
				oldNo = sc.nextLine();
				System.out.println(ll.insertBeforeSpecificNo(no, oldNo));
				break;
			case 5:
				System.out.println("Enter no for insert : ");
				no = sc.nextLine();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select Position(Start with 1) : ");
				int pos = sc.nextInt();
				System.out.println(ll.insertNoSpecificPosition(no, pos));
				break;
			case 7:
				System.out.println(ll.deleteAtBegining());
				break;
			case 8:
				System.out.println(ll.deleteAtLast());
				break;
			case 9:
				System.out.println(ll.displayLinkedList());
				System.out.println("Enter no for Delete : ");
				no = sc.nextLine();
				System.out.println(ll.deleteAtAny(no));
				break;
			case 10:
				System.out.println(ll.displayLinkedList());
				System.out.println("Enter index for Delete(start with 1) : ");
				pos = sc.nextInt();
				System.out.println(ll.deleteAtAnyIndex(pos));
				break;
			case 12:
				System.out.println(ll.displayLinkedList());
				break;
			case 11:
				ll.reverse();
				System.out.println(ll.displayLinkedList());
				break;
			case 0:
				b = false;
				System.out.println("END");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}


	private String displayLinkedList() {
		String s = "";
		p = head;
		while (p != null) {
			s += p.getData() + " ";
			p = p.getNext();
		}
		return s;
	}

	private String insertAtLast(String no) {
		if (head == null) {
			head = new NodeUsingGetterSetter(no, null);
		} else {
			NodeUsingGetterSetter<T> temp = new NodeUsingGetterSetter(no, null);
			p = head;
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(temp);
		}
		return no + " inserted";
	}
	
	private String insertAtBegining(String no) {
		if (head == null) {
			head = new NodeUsingGetterSetter(no, null);
		} else {
			temp = new NodeUsingGetterSetter(no, head);
			head = temp;
		}
		return no + " inserted";
	}
	
	private String deleteAtLast() {
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
		return s;
	}
	private String deleteAtAnyIndex(int oldNo) {
		
		p = head;
		int flag = 0,cnt=2;
		while (p != null) {
			if (cnt == oldNo) {
				flag = 1;
				break;
			}
			cnt++;
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			s = p.getNext().getData() + " deleted";
			p.setNext(p.getNext().getNext());
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String deleteAtAny(T oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.getNext().getData().equals(oldNo)) {
				flag = 1;
				break;
			}
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			s = p.getNext().getData() + " Deleted";
			p.setNext(p.getNext().getNext());
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertNoSpecificPosition(String no, int oldNo) {

		p = head;
		int flag = 0,cnt=2;
		while (p != null) {
			if (cnt == oldNo) {
				flag = 1;
				break;
			}
			cnt++;
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			temp = new NodeUsingGetterSetter(no, p.getNext());
			p.setNext(temp);
			s = temp.getData() + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertAfterSpecificNo(String no, T oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.getData().equals(oldNo)) {
				flag = 1;
				break;
			}
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			temp = new NodeUsingGetterSetter(no, p.getNext());
			p.setNext(temp);
			s = temp.getData() + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertBeforeSpecificNo(String no, T oldNo) {

		p = head;
		int flag = 0;
		String s="";
		if(p.getData().equals(oldNo)){
			flag=1;
			temp = new NodeUsingGetterSetter(no, head);
			head = temp;
			s = temp.getData() + " Inserted";
		}
		if(flag!=1)
		{
		  while (p != null) {
			if (p.getNext().getData().equals(oldNo)) {
				flag = 1;
				break;
			}
			p = p.getNext();
		  }
		  if (flag == 1) {
			temp = new NodeUsingGetterSetter(no, p.getNext());
			p.setNext(temp);
			s = temp.getData() + " Inserted";
		  } else {
			s = oldNo + " Not Found";
		  }
		} 
		return s;
	}

	private String deleteAtBegining() {
		String s = head.getData() + " Deleted";
		head = head.getNext();
		return s;
	}
	void reverse() {
		NodeUsingGetterSetter prev = null;
		NodeUsingGetterSetter current = head;
		NodeUsingGetterSetter next = null;
        while (current != null) {
            next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        head = prev;
    }

}




/*package week8;

import java.util.Scanner;


public class LinkedListUsingGetterSetter {

	static NodeUsingGetterSetter head, p, q, temp = null;

	public static void main(String[] args) {

		LinkedListUsingGetterSetter ll = new LinkedListUsingGetterSetter();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("\n1. insert at Last\n2. insert at Begining\n3. Insert After Specific Number\n4. Insert Before Specific Number\n5. Insert Number at pecific position");
			System.out.println("7. Delete First\n8. Delete last\n9. Delete Any\n10. Delete wise index");
			System.out.println("11. Display\n0. Exit\n\nEnter your choice : ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("Enter no : ");
				int no = sc.nextInt();
				System.out.println(ll.insertAtLast(no));
				break;
			case 2:
				System.out.println("Enter no : ");
				no = sc.nextInt();
				System.out.println(ll.insertAtBegining(no));
				break;
			case 3:
				System.out.println("Enter no for insert : ");
				no = sc.nextInt();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select no : ");
				int oldNo = sc.nextInt();
				System.out.println(ll.insertAfterSpecificNo(no, oldNo));
				break;
			case 4:
				System.out.println("Enter no for insert : ");
				no = sc.nextInt();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select no : ");
				oldNo = sc.nextInt();
				System.out.println(ll.insertBeforeSpecificNo(no, oldNo));
				break;
			case 5:
				System.out.println("Enter no for insert : ");
				no = sc.nextInt();
				System.out.println(ll.displayLinkedList());
				System.out.println("Select Position(Start with 1) : ");
				oldNo = sc.nextInt();
				System.out.println(ll.insertNoSpecificPosition(no, oldNo));
				break;
			case 7:
				System.out.println(ll.deleteAtBegining());
				break;
			case 8:
				System.out.println(ll.deleteAtLast());
				break;
			case 9:
				System.out.println(ll.displayLinkedList());
				System.out.println("Enter no for Delete : ");
				no = sc.nextInt();
				System.out.println(ll.deleteAtAny(no));
				break;
			case 10:
				System.out.println(ll.displayLinkedList());
				System.out.println("Enter index for Delete(start with 1) : ");
				no = sc.nextInt();
				System.out.println(ll.deleteAtAnyIndex(no));
				break;
			case 11:
				System.out.println(ll.displayLinkedList());
				break;
			case 0:
				b = false;
				System.out.println("END");
				break;
			default:
				System.out.println("Invalid choice");
				break;
			}
		}
	}


	private String displayLinkedList() {
		String s = "";
		p = head;
		while (p != null) {
			s += p.getData() + " ";
			p = p.getNext();
		}
		return s;
	}

	private String insertAtLast(int no) {
		if (head == null) {
			head = new NodeUsingGetterSetter(no, null);
		} else {
			NodeUsingGetterSetter temp = new NodeUsingGetterSetter(no, null);
			p = head;
			while (p.getNext() != null)
				p = p.getNext();
			p.setNext(temp);
		}
		return no + " inserted";
	}
	
	private String insertAtBegining(int no) {
		if (head == null) {
			head = new NodeUsingGetterSetter(no, null);
		} else {
			temp = new NodeUsingGetterSetter(no, head);
			head = temp;
		}
		return no + " inserted";
	}
	
	private String deleteAtLast() {
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
		return s;
	}
	private String deleteAtAnyIndex(int oldNo) {
		
		p = head;
		int flag = 0,cnt=2;
		while (p != null) {
			if (cnt == oldNo) {
				flag = 1;
				break;
			}
			cnt++;
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			s = p.getNext().getData() + " deleted";
			p.setNext(p.getNext().getNext());
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String deleteAtAny(int oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.getNext().getData() == oldNo) {
				flag = 1;
				break;
			}
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			s = p.getNext().getData() + " Deleted";
			p.setNext(p.getNext().getNext());
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertNoSpecificPosition(int no, int oldNo) {

		p = head;
		int flag = 0,cnt=2;
		while (p != null) {
			if (cnt == oldNo) {
				flag = 1;
				break;
			}
			cnt++;
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			temp = new NodeUsingGetterSetter(no, p.getNext());
			p.setNext(temp);
			s = temp.getData() + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertAfterSpecificNo(int no, int oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.getData() == oldNo) {
				flag = 1;
				break;
			}
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			temp = new NodeUsingGetterSetter(no, p.getNext());
			p.setNext(temp);
			s = temp.getData() + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertBeforeSpecificNo(int no, int oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.getNext().getData() == oldNo) {
				flag = 1;
				break;
			}
			p = p.getNext();
		}
		String s = "";
		if (flag == 1) {
			temp = new NodeUsingGetterSetter(no, p.getNext());
			p.setNext(temp);
			s = temp.getData() + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String deleteAtBegining() {
		String s = head.getData() + " Deleted";
		head = head.getNext();
		return s;
	}

}

*/