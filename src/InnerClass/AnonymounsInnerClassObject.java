package InnerClass;

class InnerDemo
{
	void show(){
		System.out.println("show() in InnerDemo class");
	}
}

public class AnonymounsInnerClassObject {
	public static void main(String args[])
	{
		new InnerDemo().show();
	}
}
