
//with args with return type
import java.util.*;

public class swapp {
    public static void main(String[] args) {

        swap();
    }

    public static void swap() {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println(a + " " + b);
        // return b;

    }
}
