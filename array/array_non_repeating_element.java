import java.util.*;
public class array_non_repeating_element {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        unique_number(arr,n);
    }
    public static void unique_number(int arr[],int n){
        ArrayList<Integer> a=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]==arr[j]){
                    a.add(arr[i]);
                }
                if(arr[i]!=arr[j]){
                    a.add(arr[i]);
                }
            }
        }
        System.out.print(a);
    }
}
