package Collections;

class Node1
{
	private int i;
	
	Node1 next;
	Node1 previous;

	Node1(int i)
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

public class OwnCLinkedList {
	public static void main(String args[])
	{
		Node1 n_head, n_tail;
		//create elements, and assign next and previous element
		Node1 n1 = new Node1(10);
		
		Node1 n5 = new Node1(50);
		
		n_head = n1; //set head node
		n_tail = n5; //set tail node
		
		n1.previous = n5;
		Node1 n2 = new Node1(20);
		n1.next = n2;
		n2.previous = n1;
		
		Node1 n3 = new Node1(30);
		n2.next = n3;
		n3.previous = n2;
		
		Node1 n4 = new Node1(40);
		n3.next = n4;
		n4.previous = n3;
		
		
		n4.next = n5;
		n5.previous = n4;
		n5.next = n1;
		
		Node1 tmp = n_head;
		while(tmp!=n_tail)
		{
			System.out.println(tmp.get());
			tmp = tmp.next;
		}
		
	}
}
