package Collections;

import java.util.*;

public class RandomDemo {
public static void main(String args[])
{
	Random rnd = new Random();
	
	for(int i=0;i<10;i++)
	{
		System.out.println("Random value is:"+rnd.nextInt());
	}
	System.out.println("----------------------");
	for(int i=0;i<10;i++)
	{
		System.out.println("Random value is:"+rnd.nextInt(500));
	}
}
}
