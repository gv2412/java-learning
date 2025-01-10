import java.util.*;
public class ex14 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int d;

        while(num>0){
            d = num %10;
            num = num/10;
            System.out.println(d);
        }
        
    }
}
