// eliminate the multiples of 4 using continue statement 
import java.util.*;
public class eliminate_multiple_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i=1;i<=num;i=i+1)
        {
            if(i%4==0)
            {
                continue;
            }
            System.out.println(i);
        }   
    }
}
