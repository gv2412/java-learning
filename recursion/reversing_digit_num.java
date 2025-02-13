import java.util.Scanner;
public class reversing_digit_num {
    static void reverseNumber(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        }
        System.out.print(n % 10);
        reverseNumber(n / 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to be reversed:");
        int n = sc.nextInt();
        reverseNumber(n);
        sc.close();
    }
  
}
