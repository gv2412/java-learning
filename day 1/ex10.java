//factor sum and count of n nymber
import java.util.*;
public class ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int count = 0;
        
        for(int i=1;i<=num;i=i+1){
            if(num%i==0){
                sum = sum+i;
                count = count+1;
                System.out.println(i);
            }
        }
        System.out.println("sum=" +sum);
        System.out.println("count=" +count);
    }   
}
