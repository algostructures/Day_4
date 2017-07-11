package Collections;

import java.util.HashSet;
import java.util.Iterator;

//Any objects can be stored in Set, or any other Collection
class Abc 
{
	private int i,j;
	Abc(int i,int j)
	{
		this.i = i;
		this.j = j;
	}
	
public String toString()
	{
		return "i is:"+i+" j is:"+j;
	}
}

public class SetObjectDemo {
	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		
		//HashSet is internally implemented using hash table
		Abc oa,ob,oc,od,oe;
		
		oa = new Abc(12,89);
		ob = new Abc(21,98);
		oc = new Abc(33,58);
		od = new Abc(68,89);
		oe = new Abc(32,26);
		
		hs.add(oa);
		hs.add(ob);
		hs.add(oc);
		/*hs.add(od);
		hs.add(oe);*/
		//hs.add("hgfhgfhg");
		
		
		//System.out.println(" :"+hs);
		
		Iterator itr = hs.iterator();
		while(itr.hasNext())
		{
			Abc tmp = (Abc)itr.next();
			System.out.println(tmp);
		}

	}

}