import java.util.*;
public class reverse_arr {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        System.out.print(Arrays.toString(revarr(arr)));
    }
    public static int[] revarr(int[] arr){
        int num=arr.length;
        int rev[]=new int[num];
        for(int i=0;i<num;i++){
            rev[i]=arr[num-i-1];
        }
        return rev;
    }
}   
 