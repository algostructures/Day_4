package Collections;

import java.util.HashSet;
import java.util.Iterator;

class Wxyz{
	
}
//Any objects can be stored in Set, or any other Collection
class Abc1 
{
	private int i,j;
	Abc1(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
	public void display()
	{
		System.out.println("Values are:"+i+" "+j);
	}
}

public class SetObjectGeneric {
	public static void main(String[] args) {
		
		//Generic version of HasSet
		HashSet<Abc1> hs = new HashSet<Abc1>();
		
		//HashSet is internally implemented using hash table
		Abc1 oa,ob; //oc,od,oe;
		
		oa = new Abc1(12,89);
		ob = new Abc1(21,98);
		/*oc = new Abc1(33,58);
		od = new Abc1(68,89);
		oe = new Abc1(32,26);*/
		
		hs.add(oa);
		hs.add(ob);
		/*hs.add(oc);
		hs.add(od);
		hs.add(oe);*/
		//hs.add("jdhgjd");
		
		//System.out.println(" :"+hs);
		
		Iterator<Abc1> itr = hs.iterator();
		while(itr.hasNext())
		{
			Abc1 tmp = itr.next();
			tmp.display();
		}
		
	}

}