import java.util.Scanner;

public class reversing_natural_num {
    static void printReverseNaturalNumbers(int n) {
        if (n > 0) {
            System.out.print(n + " ");
            printReverseNaturalNumbers(n - 1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        printReverseNaturalNumbers(n);
        sc.close();
    }

}
