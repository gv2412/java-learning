
import java.util.Scanner;

public class hollowsphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i <= n; i++) {
                // Print leading spaces
            for (int j = 1; j <= n; j++) {
                    if(i==1||i==n||j==1||j==n){
                        
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

