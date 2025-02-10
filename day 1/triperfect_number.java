//tri perfect number 
import java.util.*;
public class triperfect_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum = sum + i;
            }
        }
        int sum1 = 0;
        for (int j = 1; j < sum; j++) {
            if (sum % j == 0) {
                sum1 = sum1 + j;
            }
        }
        if (sum1 == num) {
            System.out.println("tri perfect number");
        } else {
            System.out.println("not a tri perfect number");
        }
    }
}

