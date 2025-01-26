import java.util.*;
public class diagnol_array {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();
        int m=s.nextInt();
       
        int[][] arr = new int[n][m];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int a=arr.length;
        int b=arr[0].length;
        for(int i=0;i<a;i++){
            for(int j=0;j<b;j++){
                if(i>=j){
                System.out.print(arr[i][j]+" ");
                }
                else{
                System.out.print(" ");
                }
            }
            System.out.println();
        }
        
    }

}


