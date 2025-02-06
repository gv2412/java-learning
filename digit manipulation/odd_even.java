import java.util.*;
class odd_even{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n&1)==1){
            System.out.print("odd number");
        }
        else{
            System.out.print("even number");
        }
    }
}
