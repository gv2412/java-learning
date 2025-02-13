import java.util.Scanner;

public class natural_num {
    static void printNaturalNumbers(int n) {
        if (n > 0) {
            printNaturalNumbers(n-1);
            System.out.print(n + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        printNaturalNumbers(n);
    }
}
