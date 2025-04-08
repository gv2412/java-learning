import java.util.*;
public class array_ronaldo_num {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        boolean a=false;
        for(int i=0;i<n;i++){
            if (arr[0]+arr[arr.length-1]==7) {
                a=true;
            }
            else{
                a=false;
            }
        }
        if(a){
            System.out.print("ronaldo");
        }else{
            System.out.print("not ronaldo");
        }
    }
}
