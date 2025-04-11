
import java.util.*;
public class leader_element {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(count>=n/2){
                        System.out.print("majority number is "+arr[i]);
                        return;
                    }
                } 
            }
        }
    }
}