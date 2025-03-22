import java.util.*;
public class third_smallest_element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[] =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        Arrays.sort(arr);
        System.out.print(arr[key-1]);
    }
}
