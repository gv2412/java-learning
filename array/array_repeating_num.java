import java.util.*;
public class array_repeating_num {
    public static void main(String[] a    ){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int a1[]=new int[n];
        int c=0;
        for(int i=0;i<=n-2;i++){
            if(arr[i]!=arr[i+1]){
                a1[c]=arr[i];
                c++;
            }
           
        }
        a1[c]=arr[n-1];
        for(int i=0;i<c;i++){
            System.out.print(a1[i]+" ");
        }
    }
}
