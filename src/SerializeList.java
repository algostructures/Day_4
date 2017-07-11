/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
*/

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializeList
{
    
 public static void main(String[] args)
 {
 try
 {
//Serialization starts here
  StudentInfo si1 = new StudentInfo("checkingnexttime", 310, "hyd");
  
  StudentInfo si2 = new StudentInfo("checkingnexttime1", 311, "etw");
  
  StudentInfo si3 = new StudentInfo("checkingnexttime2", 312, "blr");
  
  List lst = new ArrayList();
  lst.add(si1);
  lst.add(si2);
  
  StudentInfoList sia = new StudentInfoList(lst);
  
  //.ser is a standard file extension, to store serialized object
  FileOutputStream fos = new FileOutputStream("C:\\Users\\prajapas\\IdeaProjects\\Day_4\\src\\Files\\student1.ser");

  //instead of writing object stream to a file, it is also possible to send object thru 
  //Network using socket programming
  ObjectOutputStream oos = new ObjectOutputStream(fos);

  System.out.println("Serialing the object...");
  oos.writeObject(sia);
  oos.close();
  fos.close();  
  }
  catch (Exception e)
  { e. printStackTrace(); }
 }
}
