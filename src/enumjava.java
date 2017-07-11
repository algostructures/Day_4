
//enum can be declared outside the class also
enum Season { WINTER, SPRING, SUMMER, FALL };  

public class enumjava{  
	public static void main(String[] args) {  
		Season s=Season.WINTER;  
		
		System.out.println(s);  
		
		if(s!=Season.FALL)
		{
			System.out.println("Season is not FALL");
		}
		else
		{
			System.out.println("Season is FALL");
		}
		
		xyz(s);
	}
	
	private static void xyz(Season sn)
	{
		System.out.println("Season is "+sn);
	}
}   