import java.util.*;
public class factors_count {
    //generate a code to print the count of factors using recursion
    static int countFactors(int n, int i) {
        if (i == 1) {
            return 1;
        }
        if (n % i == 0) {
            return 1 + countFactors(n, i - 1);
        }
        return countFactors(n, i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int count = countFactors(n, n);
        System.out.println("Number of factors of " + n + " is " + count);
        sc.close();
    }

}
