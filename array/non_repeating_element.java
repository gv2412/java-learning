import java.util.*;
public class non_repeating_element {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        for(int i=0;i<n;i++){
            boolean a=false;
            for(int j=0;j<n;j++){
                if(i!=j&&arr[i]==arr[j]){
                    a=true;
                    break;
                }
            }
            if(!a){
                System.out.print(arr[i]+" ");   
                return;
            }
        }
    }
}
