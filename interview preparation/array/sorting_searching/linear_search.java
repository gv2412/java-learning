package sorting_searching;
import java.util.*;
public class linear_search {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        if(search(arr,n,k)){
            System.out.println("target found");
        }else{
            System.out.println("target not found");
        }
        count(arr,n,k);
    }
//------------------------------------------------------------------------------------------------------------------------
    //CHECK ARR[I]==TARGET:
//------------------------------------------------------------------------------------------------------------------------

    public static boolean search(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                return true;
            }
        }
        return false;
    }
//------------------------------------------------------------------------------------------------------------------------
    //COUNT OF OCCURANCE OF TARGET :
//------------------------------------------------------------------------------------------------------------------------

    public static void count(int arr[],int n,int k){
        int c=0;
        for(int i=0;i<n;i++){
            if(arr[i]==k){
                c++;
            }
        }
        if(c>1){
        System.out.print("count of target : "+c);
        }else{
            System.out.print("target is unique");
        }
    }
}
