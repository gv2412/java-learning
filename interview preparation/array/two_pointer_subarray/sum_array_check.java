import java.util.*;
class sum_array_check{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        if(sum_of_element(arr,n,key)!=null){
        System.out.print("pair found :"+Arrays.toString(sum_of_element(arr,n,key)));
        }
        else{
            System.out.print("pair not found");
        }
    }
    public static int[] sum_of_element(int arr[],int n,int k){
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(arr[i]+arr[j]==k){
                    return new int[] {arr[i],arr[j]};
                }
            }
        }
        return null;
    }
}