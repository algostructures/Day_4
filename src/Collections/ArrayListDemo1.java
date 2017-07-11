package Collections;

import java.util.Arrays;
import java.util.*;


public class ArrayListDemo1 {
	public static void main(String[] args) {
		String arr1[] = {"J","a","v","a"};
		String arr2[] = {"6","5","2"};
		
		List lst = Arrays.asList(arr1);
		List lst1 = Arrays.asList(arr2);
		
		ArrayList al = new ArrayList(lst);
		al.addAll(lst1);
		
		System.out.println(al);
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}
}
