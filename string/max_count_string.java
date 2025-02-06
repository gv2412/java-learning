import java.util.*;
public class max_count_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int n=str.length();
        int max=0;
        char ch=' ';
        for(int i=0;i<n;i++){
            int count=0;
            for(int j=0;j<n;j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                }
            }   
            if(count>max){
                max=count;
                ch=str.charAt(i);
            }
        }
        System.out.println(ch);
    }
}

       