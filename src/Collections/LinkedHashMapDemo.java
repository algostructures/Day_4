package Collections;

import java.util.*;
public class LinkedHashMapDemo{  
 public static void main(String args[]){  
   
  LinkedHashMap<Integer,String> hm=new LinkedHashMap<Integer,String>();  
  
  hm.put(100,"hghf");  
  hm.put(101,"wqeweq");  
  hm.put(102,"mhujh");  
  
for(Map.Entry m:hm.entrySet()){  
   System.out.println(m.getKey()+" "+m.getValue());  
  }  
 }  
}  