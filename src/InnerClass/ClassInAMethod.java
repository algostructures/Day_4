package InnerClass;

public class ClassInAMethod {
	public static void main(String[] args) {
		new OuterClass().display();
	}
}

class OuterClass {
		
	
	public void display() {
		final String s = "Test: ";
		//class declared inside a method
		class Rect {
			private float width;
			private float height;
			public Rect(float width,float height) { this.width=width; this.height=height; 
			System.out.println("Rect() constructor");
			}
			
			//s is member of OuterClass
			public String toString() { return ""+width+","+height+s; }
		};
		System.out.println(new Rect(1.2f,2.3f));
	} // end of method print
} // class OC