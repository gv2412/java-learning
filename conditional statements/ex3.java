//greatest of 3 numbers
import java.util.*;
public class ex3 {
    public static void main(String[] args) {
        Scanner s = new scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        int num3 = s.nextInt();

        if(num1>num2){
            if(num1>num3){
                System.out.println("num1 is greater");
            }  
        }
        else{
            if(num2>num3){
                System.out.println("num2 is greater");
            }
            else{
                System.out.println("num3 is greatest");
            }
        }
        /*if(num1>num2 && num1>num3) */
    }
}
