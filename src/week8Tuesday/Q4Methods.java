package week8Tuesday;

import week7Friday.Node;

public class Q4Methods<T> {

	public int length=0;
	private Node<T> head;
	public void sortInteger()
	{
		Node<T> temp1=this.head;
		do{
			Node<T> temp2=temp1.getNext();
			while(temp2!=this.head)
			{
				if((Integer)temp1.getData()>(Integer)temp2.getData())
				{
					T data=temp1.getData();
					temp1.setData(temp2.getData());
					temp2.setData(data);
				}
				temp2=temp2.getNext();
			}
			temp1=temp1.getNext();
		}while(temp1!=this.head);
	}
	public void addAtLast(T elem)
	{
		Node<T> newNode=new Node<T>(elem,null);
		if(this.head==null)
		{
				this.head=newNode;
				this.head.setNext(this.head);
		}
		else
		{
				Node<T> temp=this.head;
				while(temp.getNext()!=this.head)
					temp=temp.getNext();
				temp.setNext(newNode);
				newNode.setNext(this.head);
		}
		this.length++;
	}
	public void display()
	{
		if(this.head==null)
			return;
		Node<T> temp=this.head;
		do{
			System.out.println(temp.getData());
			temp=temp.getNext();
		}while(temp!=this.head);
	}
}
