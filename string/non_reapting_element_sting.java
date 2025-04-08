import java.util.*;
public class non_reapting_element_sting {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(c[i]==c[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.print(c[i]+" ");
            }
        }
    }
}
