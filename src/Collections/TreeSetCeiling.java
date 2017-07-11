package Collections;

import java.util.Iterator;
import java.util.TreeSet;
import java.util.SortedSet;

public class TreeSetCeiling {
   public static void main(String[] args) {
   // creating a TreeSet 
   TreeSet <Integer>treeadd = new TreeSet<Integer>();
     
   // adding in the tree set
   treeadd.add(12);
   treeadd.add(11);
   treeadd.add(16);
   treeadd.add(15);
     
   // getting ceiling value for 13
   System.out.println("Ceiling value for 13: "+treeadd.ceiling(13));   
   
   System.out.println("Floor value for 14: "+treeadd.floor(14));
   
   SortedSet<Integer> hdst = treeadd.headSet(15);

   System.out.println("HeadSet:"+hdst);
   System.out.println("TailSet:"+treeadd.tailSet(11));
   
   System.out.println("Before Polling First Element:"+treeadd);
   
   Integer p1 = treeadd.pollFirst();
   System.out.println("Polled First element: "+p1.intValue());
   
   System.out.println("After Polling First Element:"+treeadd);
   }     
}