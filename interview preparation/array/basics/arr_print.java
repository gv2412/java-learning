package basics;
import java.util.*;
public class arr_print {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        problem(arr,n);
    }

//--------------------------------------------------------------------------------------------------------------------
    //ARRAY PRINTING:-
//------------------------------------------------------------------------------------------------------------------------
    /*public static void problem(int arr[],int n){
        for(int num:arr){
            System.out.print(num+" ");
        }
        System.out.println(Arrays.toString(arr));
    }*/




//------------------------------------------------------------------------------------------------------------------------
    //Array odd and even count
//------------------------------------------------------------------------------------------------------------------------

    /*public static void problem(int arr[],int n){
        int o=0;
        int e=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                o++;
            }
            else{
                e++;
            }
        }
        System.out.println("count : "+o);
        System.out.print("count : "+e);
    }*/

    
//------------------------------------------------------------------------------------------------------------------------
    //Array sorted or not
//------------------------------------------------------------------------------------------------------------------------

    public static void problem(int arr[],int n){
        if(sorted(arr,n)){
            System.out.print("Sorted");
        }else{
            System.out.print("Not sorted");
        }
    }
    public static boolean sorted(int arr[],int n){
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                return true;
            }
        }
        return false;
    }
}
