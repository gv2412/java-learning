import java.util.*;
public class zero_end {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        zero(arr,n);
    }

    //merthod 1:
    /*public static void zero(int arr[],int n){
        int count=0;
        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++]=arr[i];
            }
        }
            while(count<n){
                arr[count++]=0;
            }
        System.out.print(Arrays.toString(arr));
    }*/

    //method 2:
    public static void zero(int arr[],int n){
        ArrayList<Integer> one=new ArrayList<>();
        ArrayList<Integer> z=new ArrayList<>();
        for(int num:arr){
            if(num>=1){
                one.add(num);
            }else{
                z.add(0);
            }
        }
        int i=0;
        for(int num:one){
            arr[i++]=num;
        }
        for(int num:z){
            arr[i++]=num;
        }
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
