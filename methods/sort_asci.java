import java.util.*;
public class sort_asci {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
        int index = s.nextInt();
        sort(arr, index);
        System.out.println(Arrays.toString(arr));
    }
    public static void sort(int arr[], int index) {
        Arrays.sort(arr, 0, index);
        int start = index;
        int end = arr.length - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
}
