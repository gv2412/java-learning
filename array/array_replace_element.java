
import java.util.*;
public class array_replace_element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int element = s.nextInt();
        int index = s.nextInt();
        int newarr[]=new int[n+1];
        arr[index] = element;
        System.out.println(Arrays.toString(arr));
    }
}
