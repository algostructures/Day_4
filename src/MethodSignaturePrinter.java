import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * Created by prajapas on 7/8/2017.
 */
public class MethodSignaturePrinter {
    public static void main(String args[]) throws Exception {
        Class no_params[] = {};
        Class c = Class.forName("Thrower");
        Method mta[] = c.getMethods();
        System.out.println("Below are methods in the class");
        for (Method mt : mta) {

            if (mt.getName().length() != 1 ) {
                continue;
            }
            System.out.println();
            Class Et[] = mt.getExceptionTypes();
            Class rt = mt.getReturnType();
            Class pt[] = mt.getParameterTypes();
            int mo = mt.getModifiers();
            Annotation[] annot = mt.getAnnotations();
            for(Annotation i : annot) {

                System.out.print("@"+filter(i.annotationType().toString())+" ");
            }
            System.out.println();
            System.out.print(Modifier.toString(mo) + " " + rt.getName() + " " + mt.getName() + " (");
            for (int i = 0; i < pt.length; i++) {
                System.out.print(filter(pt[i].getName()));
                if (i != pt.length - 1)
                    System.out.print(", ");
            }
            System.out.print(") ");
            if (Et.length > 0)
                System.out.print("throws ");
            for (int i = 0; i < Et.length; i++) {
                System.out.print(filter(Et[i].getName()));
                if (i != Et.length - 1)
                    System.out.print(", ");
            }

            System.out.println();
        }
    }

    public static String filter(String s) {
        String filt[] = s.split("\\.|\\s+");
        if (filt.length == 0) {
            return s;
        } else if (filt.length == 1) {
            return filt[0];
        } else {
            return filt[filt.length - 1];
        }
    }
}

class Thrower extends same{
    Thrower() {
    }

    @Deprecated @MyAnnotation @MyAnnotation_2
    public void a(int a, String b) throws IOException {

    }
    @MyAnnotation @MyAnnotation_2
    public int b(String a) throws NullPointerException, ArrayIndexOutOfBoundsException {
        return 1;
    }
    @Override
    public int c() {
        return 1;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
class same{
    public int c(){return 1;};
}