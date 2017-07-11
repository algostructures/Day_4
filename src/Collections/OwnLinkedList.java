package Collections;

class Node
{
	private int i;
	
	Node next;

	Node(int i)
	{
		this.i = i;
	}
	public void set(int i)
	{
		this.i = i;
	}
	
	public int get()
	{
		return i;
	}
	
}

public class OwnLinkedList {
	public static void main(String args[])
	{
		//create elements, and assign next element
		Node n1 = new Node(10);
		
		Node n2 = new Node(20);
		n1.next = n2;
		
		Node n3 = new Node(30);
		n2.next = n3;
		
		Node n4 = new Node(40);
		n3.next = n4;
		
		Node n5 = new Node(50);
		n4.next = n5;
		n5.next = null;
		
		Node tmp = n1;
		while(tmp.next!=null)
		{
			System.out.println(tmp.get());
			tmp = tmp.next;
		}
		
	}
}
