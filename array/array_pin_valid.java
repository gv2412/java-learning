import java.util.*;
public class array_pin_valid {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int s1=0;
        for(int i=0;i<arr.length/2;i++){
            s1+=arr[i];
        }
        int s2=0;
        for(int i=(arr.length/2);i<arr.length;i++){
            s2+=arr[i];
        }
        if(s1==s2){
            System.out.print("verified");
        }else{
            System.out.print("not verified");
        }
       
    }
}
