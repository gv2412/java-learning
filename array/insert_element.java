import java.util.*;
public class insert_element {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = s.nextInt();
        }
        int element = s.nextInt();
        int index = s.nextInt();
        int[] newarr = new int[arr.length + 1];
        for(int i=0;i<n+1;i++){
            if(i<index){
                newarr[i]=arr[i];
            }
            else if (i==index) {
                newarr[i]=element;
            }else{
                newarr[i]=arr[i-1];
            }
        }
        System.out.println(Arrays.toString(newarr));
    }
}



