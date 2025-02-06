import java.util.*;
public class power_two {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n&(n-1))==0){
            System.out.print("power of 2");
        }
        else{
            System.out.print("not a power of 2");
        }
    }
}
