package Collections;

import java.util.*;

public class QueueDemo {
	
	 static public void main(String args[])
	{
		//FIFO, Queue is an interface
		Queue queueA = new LinkedList();

		queueA.add("element 0");
		queueA.add("element 1");
		queueA.add("element 2");
		//queueA.add(0,"sfdgdfgf");
		System.out.println("Peek method:"+queueA.peek());
		//returns first element, without deleting
		
		System.out.println("Poll method:"+queueA.poll());
		//returns first element, and deletes
		//Queue is an interface, and represents FIFO(First In First Out) operations


		printQueue(queueA);
		System.out.println("Removing:"+queueA.remove());
		
		System.out.println("After removal........");
		printQueue(queueA);
		
		
	}
	
	static void printQueue(Queue qObj)
	{
		System.out.println("Contents of Queue are.......");
		//access via Iterator
		Iterator itr = qObj.iterator();
		while(itr.hasNext()){
		  String element = (String) itr.next();
		  System.out.println(element);
		}
	}
}
