import java.util.*;
public class count_frequency_num {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        frequency_number(arr,n);
    }
    public static void frequency_number(int arr[],int n){
        int max=0;
        int num=0;
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(arr[i]==arr[j]){
                    count++;
                }   
            }
            if(count>max){
                max=count;
                num=arr[i];
            }
        }
        System.out.print(num);
    }
}
