import java.util.*;
public class character_count {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char ch=s.next().charAt(0);
        char c[]=str.toCharArray();
        int count=0;
        for(int i=0;i<str.length();i++){
            if(c[i]==ch||Character.isUpperCase(c[i])){
                count++;
            }
        }
        System.out.print(count);
    }
}
