import java.util.*;
public class ButterflyPattern{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int i,j;

        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=2*(n-i);j++){
                System.out.print(" ");

            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*import java.util.Scanner;

 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input the number of rows for the pattern
        System.out.print("Enter the number of rows: ");
        int n = sc.nextInt();

        // Upper half of the butterfly
        for (int i = 1; i <= n; i++) {
            // Left half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the butterfly
        for (int i = n; i >= 1; i--) {
            // Left half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces in the middle
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }
            // Right half stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        sc.close();
    }
}*/
