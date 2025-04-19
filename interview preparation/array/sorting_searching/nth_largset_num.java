package sorting_searching;
import java.util.Scanner;
public class nth_largset_num {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        sort(arr,n);
            System.out.println("The "+k+" th minimum element is: "+arr[k-1]);
            System.out.print("The "+k+" th maximum element is: "+arr[n-k]);
    }
    public static int[] sort(int arr[],int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}