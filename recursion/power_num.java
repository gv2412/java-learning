import java.util.*;
public class power_num {
    static int power(int base, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow == 1) {
            return base;
        }
        return base * power(base, pow - 1);
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int base = s.nextInt();
        int pow = s.nextInt();
        int result = power(base, pow);
        System.out.println(base + " power " + pow + " is " + result);
    }

}
