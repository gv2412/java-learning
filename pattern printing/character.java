import java.util.*;


public class character {
    

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n=s.nextInt();

        for(int i=n;i>=1;i--){
            for(char j='a';j<='z';j++){
                System.out.print(j+" ");
            }
            
            
            System.out.println();
        }
    }
}


