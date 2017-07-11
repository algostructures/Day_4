/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.io.*;

public class DeSerializeList {
 public static void main(String[] args)
 {
 try
 {
  
  System.out.println("De serializing object...");
  //DeSerialization starts here
  FileInputStream fis = new FileInputStream("C:\\Users\\prajapas\\IdeaProjects\\Day_4\\src\\Files\\student1.ser");
  ObjectInputStream ois = new ObjectInputStream(fis);
  StudentInfoList toa = (StudentInfoList)ois.readObject();

  System.out.println("before printing Object");

  for(Object si:toa.lst)//foreach
  {
      System.out.println((StudentInfo)si);
  }
    
  //RMI(Remote Method Invocation) is based on Serialization/Deserialization
  }
  catch (Exception e)
  { e. printStackTrace(); }
    }
}

