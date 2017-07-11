package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class TreeMapDemo {
public static void main(String[] args) {
		
		//Map is used to store key:value pairs
		//HashMap doesn't follow any order, hence there is no guarantee for the order
		//Tree Map stores elements in ascending order of keys
		TreeMap tm1 = new TreeMap();
		tm1.put("hhhhhhh","jfhsgfdjusgfsd");		
		tm1.put("sfdsfds"/*key*/, "nfghgfhfg"/*value*/);
		tm1.put("qwdfdsfs", "nfghgfhgf");
		tm1.put("wererwe", "mhjuytuy");
		tm1.put("qwewewq", "vnfkhfjfk");
		tm1.put("nvcsdsfh", "wyetrwye");
		tm1.put("mnxcvbcjx", "werewhwej");
		tm1.put("msdfksdfhsd", null);
		
		System.out.println("Value is: "+tm1.get("qwewewq"));
		Set s= tm1.entrySet();
		Iterator itr1 = s.iterator();
		while(itr1.hasNext())
		{
			Map.Entry me = (Map.Entry)itr1.next();
			System.out.println("Key:"+me.getKey()+" "+"value:"+me.getValue());
		}
		
		return;
}
}
