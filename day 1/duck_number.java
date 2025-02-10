//duck number
import java.util.*;
public class duck_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count=0;    
        while(num>0){
            int d=num%10;
            if(d==0){
                count++;
            }
            num=num/10;
        }
        if(count>0){
            System.out.println("duck number");
        }
        else{
            System.out.println("not a duck number");
        }  
    }
}