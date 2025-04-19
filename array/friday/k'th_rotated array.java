
import java.util.*;
class num{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        right_rotate(arr,n,k);
        left_rotate(arr,n,k);
    }
// -------------------------------------------------------------------------------------------------------------------------------------------
//     right_rotate:
// ------------------------------------------------------------------------------------------------------------------------------------
    public static void right_rotate(int arr[],int n,int k){
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[(k+i)%n]=arr[i];
        }
        for(int num:r){
            System.out.print(num+" ");
        }
    }

    /*public static void right_rotate(int arr[],int n,int k){
        for(int i=1;i<=k%n;i++){
            int safe=arr[n-1];
            for(int j=n-1;j>=1;j--){
                arr[j]=arr[j-1];
            }
            arr[0]=safe;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }*/
// ----------------------------------------------------------------------------------------------------------------------------------
//     left_rotate:
// -----------------------------------------------------------------------------------------------------------------------------------
    /*public static void left_rotate(int arr[],int n,int k){
        for(int i=1;i<=k%n;i++){
            int safe=arr[0];
            for(int j=0;j<n-1;j++){
                arr[j]=arr[j+1];
            }
            arr[n-1]=safe;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }*/

    public static void left_rotate(int arr[],int n,int k){
        int r[]=new int[n];
        for(int i=0;i<n;i++){
            r[i]=arr[(k+i)%n];
        }
        for(int num:r){
            System.out.print(num+" ");
        }
    }
}