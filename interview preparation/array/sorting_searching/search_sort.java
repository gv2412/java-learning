package sorting_searching;

import java.util.Scanner;

public class search_sort {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();
        int num[]=sort(arr,n);
        System.out.print("Sorted array: ");
        for(int ne:num){
            System.out.print(ne+" ");
        }
        System.out.println();
        int i=search(num,n,k);
        if(i!=-1){
            System.out.print("key found at index : "+i);
        }else{
            System.out.print("key not found");
        }
    }
//------------------------------------------------------------------------------------------------------------------------
    //BINARY SEARCH
//------------------------------------------------------------------------------------------------------------------------

    public static int search(int arr[],int n,int k){
        int first=0;
        int last=n-1;
        while(first<=last){
            int mid=(first+last)/2;
            if(arr[mid]==k){
                return mid;
            }else if(arr[mid]>k){
                last=mid-1;
            }else{
                first=mid+1;
            }
        }
        return -1;
    }
//------------------------------------------------------------------------------------------------------------------------
    //BUBBLE SORT
//------------------------------------------------------------------------------------------------------------------------

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
