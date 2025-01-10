//ampicable pair or not
import java.util.*; 
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum1 = 0;
        int sum2 = 0;
        for(int i=1;i<num1;i++){
            if(num1%i==0){
                sum1 = sum1+i;
               
            }
        }
        for(int j=1;j<num2;j++){
            if(num2%j==0){
                sum2 = sum2+j;
            }
        }

        if(sum1==num2 && sum2==num1){
            System.out.println("ampicable pair");
        }
        else{
            System.out.println("not a ampicable pair");
        }
        
    }
}
