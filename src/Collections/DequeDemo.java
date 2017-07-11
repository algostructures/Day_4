package Collections;/*
 * It represents a queue where you can insert and remove elements from both ends of the queue. Thus, "Deque" is short for "Double Ended Queue"
 */

import java.util.Deque;
import java.util.LinkedList;
public class DequeDemo {
	public static void main(String args[])
	{
		Deque dequeA = new LinkedList();

		dequeA.add     ("element 1"); //add element at tail
		dequeA.addFirst("element 2"); //add element at head
		dequeA.addLast ("element 3"); //add element at tail
		
		Object firstElement = dequeA.element();
		Object firstElement2 = dequeA.getFirst();
		Object lastElement  = dequeA.getLast();
		
		System.out.println(firstElement);
		System.out.println(firstElement2);
		System.out.println(lastElement);
		
		System.out.println("\nIterating thru elements");
		for(Object object : dequeA) {
		    String element = (String) object;
		    System.out.println(element);
		}
		
		Object fElement = dequeA.remove();
		Object fElement1 = dequeA.removeFirst();
		Object lElement  = dequeA.removeLast();
	}

}
