import java.util.*;
public class swapping_values {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.print("before swapping");
        int a=s.nextInt();
        int b=s.nextInt();

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after swapping");
        System.out.println(a);
        System.out.println(b);
    }
}
