package InnerClass;

public class MemberClass1 {
public static void main(String[] args) {
new OC().print();
}
}

class OC {
	public void print() 
	{
	
		final String s = "test: ";
		class Point {
			private int x;
			private int y;
			public Point(int x,int y) { this.x=x; this.y=y; }
			public String toString() { return s+"("+x+","+y+")"; }
		};
		System.out.println(new Point(1,2));
	} // method print
} // class OC