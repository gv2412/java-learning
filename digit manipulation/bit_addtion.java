import java.util.*;
public class bit_addtion {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int b=s.nextInt();
        while(b!=0){
            int c=a&b;
            a=a^b;
            b=c<<1;
        }
        System.out.print("Output of the value: "+a);
    }
}
