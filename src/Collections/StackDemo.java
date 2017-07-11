package Collections;

import java.util.*;

public class StackDemo {
   public static void main(String[] a) {
/*
 * The Stack class represents a last-in-first-out (LIFO) stack of objects. 
 * It extends class Vector with five operations 
 * that allow a vector to be treated as a stack. 
 * The usual push and pop operations are provided, as well as a method to 
 * peek at the top item on the stack, 
 * a method to test for whether the stack is empty.
 */
   // create stack object
   Stack st = new Stack();
      
   // push elements to Stack
   System.out.println("Push object: "+"Chennai");
   
   st.push("Chennai");
   
   System.out.println("Push object: "+"Bangalore");
   st.push("Bangalore");
   
   System.out.println("Peek object is: "+st.peek());
   
   System.out.println("Push object: "+"Mumbai");
   st.push("Mumbai");
   
   //st.add(1, "arg1");
   System.out.println("Push object: "+"New Delhi");
   st.push("New Delhi");
      
   // removing top object, Last element which got added is popped out
   System.out.println("Removed object is: "+st.pop());
   
   //
   
   // elements after pop
   System.out.println("Elements after remove: "+st);
   }    
}