package Collections;

import java.util.TreeSet;
 
class MyItem implements Comparable<MyItem>{
	
	private String name;
	
	public MyItem(String name) {
		//super();
		this.name = name;
	}
	
	/*public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}*/

	public String toString()
	{
		return " "+name+" ";
	}
	
	//declared in java.lang.Comparable interface
	public int compareTo(MyItem compareItem) {
	
		String tmp_name = ((MyItem) compareItem).name; 
		
		//System.out.println( this.name+" is compared with "+compareItem.name);
		return this.name.length() - tmp_name.length();
	}	
}

public class MyTreeMapComparable {
	 
    public static void main(String a[]){
        TreeSet<MyItem> ts = new TreeSet<MyItem>();
        
        MyItem it1 = new MyItem("sjdhfgsdhj");
        MyItem it2 = new MyItem("sdgfhds");
        MyItem it3 = new MyItem("olkmdf");
        /*MyItem it4 = new MyItem("ba");
        MyItem it5 = new MyItem("bcd");*/
        
        ts.add(it1);
        ts.add(it2);
        ts.add(it3);
        /*ts.add(it5);
        ts.add(it4);*/
        
        System.out.println(ts);
    }
}