import java.util.*;
public class non_repeating_element {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int res=0;
        for(int num:arr){
            res=res^num;
        }
        System.out.print("the non repeating element is "+res);
    }
}
 