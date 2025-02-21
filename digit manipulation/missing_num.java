import java.util.*;
public class missing_num {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[10];
        int temp=n;
        arr[0]=1;
        while(temp>0){
            int rem=temp%10;
            arr[rem]=rem;
            temp=temp/10;
        }
        Arrays.sort(arr);
        for(int i=0;i<10;i++){
            if(i==arr[i]){
                System.out.println(arr[i]+" is present");
            }
            else{
                System.out.println("missing number is "+i);
            }
        }
    }
}