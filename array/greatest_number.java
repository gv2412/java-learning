import java.util.*;
public class greatest_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int min = arr[0];
        int i = 0;
        while (i < arr.length) {
            if (arr[i] < min) {
                min = arr[i];
            }
            i++;
        }
        System.out.println("The maximum number is " + min);

    }
}
