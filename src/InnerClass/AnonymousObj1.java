package InnerClass;

class InnerClass{

	public void met1()
	{
		System.out.println("met1() in InnerClass");
	}
}

public class AnonymousObj1 {
	public static void main(String args[])
	{
		final int i=8;
		new InnerClass(){
			public void met1(){
				System.out.println("met1() in Anonymous class"+i);
			}
		}.met1();
	}
}
