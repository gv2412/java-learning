import java.util.*;
public class array_reverse_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        int temp;
        for(int i=0;i<n;i++){
            temp=arr[i];
            arr[i]=arr[n-1];
            arr[n-1]=temp;
            n--;
            
       }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

