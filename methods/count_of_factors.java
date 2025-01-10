import java.util.*;
public class count_of_factors {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        System.out.println(factors(n));
    }
    public static int factors(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        return count;
    }
    
}
