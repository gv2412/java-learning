
import java.util.*;
public class sorting_array {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        int temp;
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=1;i<n;i++){
            if(arr[i]>arr[i-1]){
                temp=arr[i];
                arr[i]=arr[i-1];
                arr[i-1]=temp;
            }
            else{
                temp=arr[i];
            }
            System.out.print(temp+" ");
        }
        
    
}
}
