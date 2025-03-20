import java.util.*;
public class leader_element {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    count++;
                }
            }
            if(count==0){
                System.out.print(arr[i]+" ");
            }
        }
    }
}
