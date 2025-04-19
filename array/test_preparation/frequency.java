package test_preparation;
import java.util.*;

public class frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int arr[] = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        freq(arr);
    }

    static void freq(int arr[]) {
        boolean visited[]=new boolean[arr.length];
        int a=0;
        String value="";
        for (int i = 0; i < arr.length; i++) {
            if(visited[i])continue;
             a=arr[i];
             int count=1;
             value = i+",";
            for (int j = i+1; j < arr.length; j++) {
                if (arr[j] == a) {
                    value+=j;
                    count++;
                    visited[j]=true;
                }
            }
            if (count>1) {
            System.out.println("element :"+arr[i]);   
            System.out.println("element index: "+value);
            System.out.println("Frequency: " + count); 
            }
        }

        
    }
}