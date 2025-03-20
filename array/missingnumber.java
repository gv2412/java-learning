import java.util.*;
public class missingnumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        int sum = 0;
        for (int i = 0; i <n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }
        int expectedSum = n * (n + 1) / 2;
        int missingNumber = sum-expectedSum;
        System.out.println("The missing number is: " + missingNumber);
    }
}