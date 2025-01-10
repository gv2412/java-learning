import java.util.*;
//generate code for printing hollow diamond using *symbol in java
import java.util.*;

public class hollowdiamond {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(j==1||j==i||j==2*i-1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                if(j==1||j==i||j==2*i-1||j==n){
                System.out.print("*");
            }
            else{
                System.out.print(" ");
            }
        }
            System.out.println();
        }
    }
}
