//sum of odd and even numbers in n numbers
import java.util.*;

public class ex6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        int i = 0;
       
        
        for (; i <= num;i = i+1) 
        {
            if (i % 2 == 0) {
                sum1 = sum1 + i;
        }
    }
        System.out.println("the sum of even number is " + sum1);
    if(i%2!=0){
        for(int j=0;j<=num;j=j+2){
            sum2 = sum2 +j;
        }
        System.out.println("the sum of odd number is " + sum2);
    }
        
       

    }
}
