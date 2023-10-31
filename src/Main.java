import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Object[] ob = new Object[] { 22, 7 };
        System.out.println(Arrays.toString(ob));
        int retval = ob.hashCode();


        System.out.println("The hash code of value1 is: " + retval+"\n");
        ob = new Object[] { 3.5, 8.5 };
        System.out.println(Arrays.toString(ob));
        retval = ob.hashCode();
        System.out.println("The hash code of value2 is: " + retval);
    }
}