//multiplication of n numbers
import java.util.*;

public class ex7 {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =1;
        for(int i=1;i<=num;i=i+1)
        {
            sum = sum*i;
        }
        System.out.println("the produt of "+num+" number is "+sum);
    }
    
}
