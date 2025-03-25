import java.util.*;
public class odd_even_amcat {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        odd_even(arr);
    }
    public static void odd_even(int arr[]){
        int n=arr.length;
        int even[]=new int[n];
        int odd[]=new int[n];
        int even_count=0;
        int odd_count=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                even[even_count++]=arr[i];
            }
            else{
                odd[odd_count++]=arr[i];
            }
        }
        for(int i=0;i<even_count;i++){
            System.out.print(even[i]+" ");
        }
        for(int i=0;i<odd_count;i++){
            System.out.print(odd[i]+" ");
        }
    }
}
