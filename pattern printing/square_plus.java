import java.util.*;
public class square_plus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(n%2!=0){
                    if(i==n/2+1||j==n/2+1){
                         System.out.print(" O ");
                     }
                    else{
                    System.out.print(" | ");
                     }
                }
                else{
                    if(i==n/2||j==n/2){
                        System.out.print(" O ");
                      }
                    else{
                        System.out.print(" | ");
                      }
                }
            }
            System.out.println();
        }
    }

}
