package Collections;

import java.util.*;
class VectorDemo{      
 public static void main(String args[]){      
//Vector is synchornized, and ArrayList is not synchronized
//Vector exists, since first release of Java
//Now Vector also implements from Collection interface
//Vector provides methods of Collection as well as legacy methods of Vector
	 
	 //Vector obj = new Vector();
	 //Vector also has both generic and non generic implementations
  Vector<String> v=new Vector<String>();//creating vector  
  v.add("kiran");//method introduced with Collection  
  v.addElement("kishore");//legacy method of Vector  
  v.addElement("ramesh");  
  v.addElement("kishore");

  
  //Vector can also use Iterator
  Iterator itr = v.iterator();
  
  while(itr.hasNext())
  {
	  String str = (String)itr.next();
	  
	  if(str.equals("kishore"))
	  {
		  itr.remove();
		  continue;
	  }
	  System.out.println(str);
  }
  
  System.out.println("-------------------------");
  //traversing elements using Enumeration, legacy method
  Enumeration e=v.elements();  
  while(e.hasMoreElements()){  
   System.out.println(e.nextElement());  
  }  
 }      
}    
