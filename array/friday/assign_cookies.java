
import java.util.*;
class number{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        if(balance(arr,n)==true){
            System.out.print("true");
        }else{
            System.out.print("false");
        }
    }
    public static boolean balance(int arr[],int n){
        int five=0;
        int ten=0;
        int twe=0;
        for(int i=0;i<n;i++){
            if(arr[i]==5){
                five++;
            }else if(arr[i]==10){
                ten++;
                if(five>0)
                five--;
            else{
                return false;
            }
        }
            else{
                twe++;
                if(five>0&&ten>0){
                    five--;
                    ten--;
                }else if(five>=3){
                    five-=3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}