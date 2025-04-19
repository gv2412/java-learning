import java.util.*;
public class ones_max_dist {
        public static void main(String[] args){
            Scanner s=new Scanner(System.in);    
            int n=s.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++){
                arr[i]=s.nextInt();
            }
            System.out.print(max_ones_dist(arr,n));
        }
    public static int max_ones_dist(int arr[],int n){
        int first=-1;
        int last=-1;
        int i=0;
        while(i<n){
            if(arr[i]==1){
                if(first==-1){
                    first=i;
                }
                last=i;
            }
            i++;
        }
        if(first==-1||first==last){
            return 0;
        }
        return last-first;
    } 
}