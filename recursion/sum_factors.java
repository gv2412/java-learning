import java.util.*;
public class sum_factors {
    static int sumFactors(int n, int i) {
        if (i == 1) {
            return 1;
        }
        if (n % i == 0) {
            return i + sumFactors(n, i - 1);
        }
        return sumFactors(n, i - 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int sum = sumFactors(n, n);
        System.out.println("Sum of factors of " + n + " is " + sum);
        sc.close();
    }

}
