package Collections;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

class Student{
	int age;
}

public class SetComparatorStudent {
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.age = 23;
		
		Student s2 = new Student();
		s2.age = 25;
		
		MyComp2 mc = new MyComp2();
		TreeSet<Student> ts = new TreeSet<Student>(mc);
		
		ts.add(s1);
		ts.add(s2);
		
		Iterator<Student> itr = ts.iterator();
		
		for(;itr.hasNext();)
		{
		System.out.println(itr.next().age);
		}
	}
}

class MyComp2 implements Comparator<Student>{
	 
    public int compare(Student std1, Student std2) {
    	return (std1.age-std2.age);//sort based on String size
    }
     
}
