package Duplicates_Frequency_Count;
import java.util.*;
public class leader_element {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        leader(arr,n);
    }
    public static void leader(int arr[],int n){
        ArrayList<Integer> a=new ArrayList<>();
        int max=arr[n-1];
        a.add(max);
        int c=1;
        for(int i=n-2;i>=0;i--){
            if(arr[i]>max){
                max=arr[i];
                a.add(max);
                c++;
            }
        }
        Collections.reverse(a);
        System.out.println("the count of leader : "+c);
        for(int num:a){
            System.out.print(num+" ");
        }
    }
}
