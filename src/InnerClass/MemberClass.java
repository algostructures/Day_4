package InnerClass;

public class MemberClass {
public static void main(String[] args) {
// one way:
OC2 a = new OC2();
OC2.IC2 b = a.new IC2();
b.print(); // outputs 3

// another way:
new OC2().new IC2().print(); // outputs 3
}
}

class OC2 {
private int x = 1;

//Inner class
//Inner class can be protected, also
public class IC2 {
public int y = 2;
public void print() {System.out.println(x+y);}
}

/*public void xyz(){
	y = 10; //private members of inner class not directly accessible
}*/

}

