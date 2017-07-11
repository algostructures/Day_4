import java.io.*;

public class DeSerializeArray {
 public static void main(String[] args)
 {
 try
 {
  
  System.out.println("De serializing object...");
  //DeSerialization starts here
  FileInputStream fis = new FileInputStream("C:\\Users\\prajapas\\IdeaProjects\\Day_4\\src\\Files\\student.ser");
  ObjectInputStream ois = new ObjectInputStream(fis);
  StudentInfoArray toa = (StudentInfoArray)ois.readObject();

  System.out.println("before printing Object");

  for(StudentInfo si:toa.arr)//foreach
  {
      System.out.println(si);
  }
    
  //RMI(Remote Method Invocation) is based on Serialization/Deserialization
  }
  catch (Exception e)
  { e. printStackTrace(); }
    }
}
