import java.util.*;
public class odd_even_end {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        odd_even(arr,n);
    }
    public static void odd_even(int arr[],int n){ 

        //Sorted array
        ArrayList<Integer> odd=new ArrayList<>();
        ArrayList<Integer> even=new ArrayList<>();
        for(int num:arr){
            if(num%2==0){
                even.add(num);
            }else{
                odd.add(num);
            }
        }
        Collections.sort(even);
        Collections.sort(odd);
        int i=0;
        for(int num:even){
            arr[i++]=num;
        }
        for(int num:odd){
            arr[i++]=num;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }

        //unsorted array
        /*int start=0;
        int end=n-1;
        while(start<end){
            if(arr[start]%2==0){
                start++;
            }
            else if(arr[end]%2!=0){
                end--;
            }
            else{
                int temp=arr[start];
                arr[start]=arr[end];
                arr[end]=temp;
                start++;
                end--;
            }
        }*/
    }
}
