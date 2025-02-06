import java.util.Scanner;

public class on_off_swithch {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if((n&1)==1){
            System.out.print("ON ");
        }
        else{
            System.out.print("OFF ");
        }
    }
}
