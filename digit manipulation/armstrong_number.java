import java.util.*;
public class armstrong_number {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int temp=n;
        int sum=0;
        int count=0;
        while(temp>0){
            count++;
            temp=temp/10;
        }
        temp=n;
        while(temp>0){
            int rem=temp%10;
            sum=sum+(int)Math.pow(rem,count);
            temp=temp/10;        
        }
        if(sum==n){
            System.out.print("Armstrong number");
        }
        else{
            System.out.print("not a armstrong number");
        }
    }
}