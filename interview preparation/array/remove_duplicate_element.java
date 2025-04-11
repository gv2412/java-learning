import java.util.*;
public class remove_duplicate_element {
    public static void main(String[] args){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
        arr[i]=s.nextInt();
    }
    remove_duplicate(arr,n);
    }
    
    public static void remove_duplicate(int arr[],int n){
        int res[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(arr[i]!=arr[i+1]){
                res[j]=arr[i];
                j++;
            }
        }
        res[j]=arr[n-1];
        j++;
        for(int i=0;i<j;i++){
            System.out.print(res[i]+" ");
        } 
    }
}