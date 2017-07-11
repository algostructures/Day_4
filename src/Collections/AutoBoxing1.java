package Collections;

public class AutoBoxing1 {
	public static void main(String args[])
	{
		Integer val1=12;
		
		//Here val1 is automatically converted to primitive type int
		//after above conversion, comparison is done
		if(val1<6)
		{
			System.out.println("12 is less than 6");
		}
		else
		{
			System.out.println("12 is not less than 6");
		}
	}
}
