import java.util.*;
public class positive_negative_count {
    public static void main(String[] args){
        Scanner s=new Scanner (System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int p=0,neg=0,z=0;
        for(int num:arr){
            if(num>0){
                p++;
            }else if(num<0){
                neg++;
            }
            else{
                z++;
            }
        }
        System.out.println("positive :"+p);
        System.out.println("negative :"+neg);
        System.out.println("zero :"+z);
    }
}
