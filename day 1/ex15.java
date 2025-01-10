//duck number
import java.util.*;
public class ex15 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int count=0;    
        while(num>0)
        {
            int d=num%10;
            if(d==0)
            {
                count=count+1;
            }
        }
        

    }

    
}