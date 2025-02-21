import java.util.*;
public class min_max_diff {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        String num=String.valueOf(n);
        int arr[] = new int[num.length()];
        for(int i = 0;i < num.length(); i++){
           arr[i] = num.charAt(i) - '0';
        }

        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length-1];
        System.out.print( max - min );
    }
}