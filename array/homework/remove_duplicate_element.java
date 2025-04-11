package homework;
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
//--------------------------------------------------------------------------------------------------------------------    
    //METHOD 1:SORTED ARRAY
    /*public static void remove_duplicate(int arr[],int n){
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
    }*/
//----------------------------------------------------------------------------------------------------------------
    //METHOD 2:SORTED ARRAY
    /*public static void remove_duplicate(int arr[],int n){
        int pos=0;
        for(int i=1;i<n;i++){
            if(arr[pos]!=arr[i]){
                pos++;
                arr[pos]=arr[i];
            }
        }
        for(int i=0;i<=pos;i++){
            System.out.print(arr[i]+" ");    
        }
    }*/
//------------------------------------------------------------------------------------------------------------------
    // METHOD 3: UNSORTED ARRAY 
    public static void remove_duplicate(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]&&arr[i]!=-1){
                    arr[j]=-1;
                }
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=-1){
            System.out.print(arr[i]+" ");
            }
        }
    }
}
          