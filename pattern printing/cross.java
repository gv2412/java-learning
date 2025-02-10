import java.util.*;
public class cross {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j;
        n=2*n-1;
        for(i=1;i<=n;i++){
            for(j=1;j<=n;j++){
                if(j==i||j==n-i+1){
                    System.out.print("*");
                }
            else{
                    System.out.print(" ");
                }
            }
            System.out.println();   
        }
    }
}
    

