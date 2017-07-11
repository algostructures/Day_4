package Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class RemoveDuplicatesFromArray {
	public static void main(String[] args) {
		int arr[] = {11,9,3,11,21,3,56,95,95};

		long rt = 45L;
		Set st = new HashSet();
		
		for(int i : arr)
		{
			st.add(i);
		}
		
		System.out.println("Set:"+st);
		Object obj[] = st.toArray();
		
		for(Object element: obj)
		{
			System.out.print(element+"  ");
		}
	}
}
