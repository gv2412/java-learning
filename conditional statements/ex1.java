// print odd or even
import java.util.*;
class ex1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        if(num%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("odd");
        }
    }
}