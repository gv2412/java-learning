import java.util.*;
public class array_index_num {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int key=s.nextInt();
        for(int i=0;i<n;i++){
            if(arr[i]==key){
                System.out.print("index of "+key+" is "+i);
                break;
            }
        }
    }
}
