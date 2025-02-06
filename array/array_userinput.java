import java.util.*;
class array_userinput{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
            
        }
        System.out.println(Arrays.toString(arr));
        for(int i:arr){
            System.out.println(i);
        }
    }
}