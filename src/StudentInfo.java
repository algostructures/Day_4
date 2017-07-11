/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import java.util.List;

class StudentInfo implements Serializable
{
 //transient data members will not take part in Serialization   
 static String name;
 static int rid;
 String address;
 StudentInfo(String n, int r, String add)
 {
  this.name = n;
  this.rid = r;
  this.address = add;
 }

 void printStudentInfo()
 {
     System.out.println("StudentInfo details Test:"+name+" "+rid+" "+" "+address);
 }
 
 public String toString()
 {
     return "name="+name+", id="+rid+", "+address;
 }
}


class StudentInfoArray implements Serializable{
    StudentInfo arr[];
    
    StudentInfoArray(StudentInfo arr[])
    {
        this.arr = arr;
    }
}

class StudentInfoList implements Serializable{
    List  lst;
    
    StudentInfoList(List lst)
    {
        this.lst = lst;
    }
}