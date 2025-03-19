import java.util.*;
public class odd_even_sum {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int odd=0;
        int even=0;
        int sum1=0;
        int sum2=0;
        for(int num:arr){
            if(num%2==0){
                sum1+=num;
                even++;
            }
            else{
                sum2+=num;
                odd++;
            }
        }
        if(odd>even){
            System.out.print("sum of max count of odd :"+sum1);
        }else{
            System.out.print("sum of max count of even :"+sum2);
        }
    }
}
