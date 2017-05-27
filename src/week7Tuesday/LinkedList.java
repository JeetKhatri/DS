package week7Tuesday;

import java.util.Scanner;


public class LinkedList {

	static Node head, p, q, temp = null;

	public static void main(String[] args) {

		LinkedList ll = new LinkedList();
		Scanner sc = new Scanner(System.in);
		boolean b = true;
		while (b == true) {
			System.out.println("\n1. insert at Begining\n2. insert at End\n3. Insert After Specific Number\n4. Insert Before Specific Number\n5. Insert Number at pecific position");
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

	private String deleteAtAnyIndex(int oldNo) {
		
		p = head;
		int flag = 0,cnt=2;
		while (p != null) {
			if (cnt == oldNo) {
				flag = 1;
				break;
			}
			cnt++;
			p = p.next;
		}
		String s = "";
		if (flag == 1) {
			s = p.next.data + " deleted";
			p.next = p.next.next;
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String deleteAtAny(int oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.next.data == oldNo) {
				flag = 1;
				break;
			}
			p = p.next;
		}
		String s = "";
		if (flag == 1) {
			s = p.next.data + " Deleted";
			p.next = p.next.next;
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
			p = p.next;
		}
		String s = "";
		if (flag == 1) {
			temp = new Node(no, p.next);
			p.next = temp;
			s = temp.data + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertAfterSpecificNo(int no, int oldNo) {

		p = head;
		int flag = 0;
		while (p != null) {
			if (p.data == oldNo) {
				flag = 1;
				break;
			}
			p = p.next;
		}
		String s = "";
		if (flag == 1) {
			temp = new Node(no, p.next);
			p.next = temp;
			s = temp.data + " Inserted";
		} else {
			s = oldNo + " Not Found";
		}
		return s;
	}

	private String insertBeforeSpecificNo(int no, int oldNo) {

		p = head;
		int flag = 0;
		String s="";
		if(p.data == oldNo){
			flag=1;
			temp = new Node(no, head);
			head = temp;
			s = temp.data + " Inserted";
		}
		if(flag!=1)
		{
		 while (p != null) {
			if (p.next.data == oldNo) {
				flag = 1;
				break;
			}
			p = p.next;
		 }
		 if (flag == 1) {
			temp = new Node(no, p.next);
			p.next = temp;
			s = temp.data + " Inserted";
		 } else {
			s = oldNo + " Not Found";
		 }
		}
		return s;
	}

	private String deleteAtBegining() {
		String s = head.data + " Deleted";
		head = head.next;
		return s;
	}

	private String deleteAtLast() {
		p = head;
		q = head;
		while (p.next != null) {
			p = p.next;
		}
		while (q.next != p) {
			q = q.next;
		}
		String s = q.next.data + " Deleted";
		q.next = null;
		return s;
	}

	private String displayLinkedList() {
		String s = "";
		p = head;
		while (p != null) {
			s += p.data + " ";
			p = p.next;
		}
		return s;
	}

	private String insertAtLast(int no) {
		if (head == null) {
			head = new Node(no, null);
		} else {
			Node temp = new Node(no, null);
			p = head;
			while (p.next != null)
				p = p.next;
			p.next = temp;
		}
		return no + " inserted";
	}

	private String insertAtBegining(int no) {
		if (head == null) {
			head = new Node(no, null);
		} else {
			temp = new Node(no, head);
			head = temp;
		}
		return no + " inserted";
	}
}
