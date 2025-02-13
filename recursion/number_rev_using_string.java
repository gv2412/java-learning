import java.util.*;
public class number_rev_using_string {
    static String reverseNumber(int n) {
        if (n < 10) {
            return String.valueOf(n);
        }
        return String.valueOf(n % 10) + reverseNumber(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int n = sc.nextInt();
        System.out.println(reverseNumber(n));
        sc.close();
    }

}
