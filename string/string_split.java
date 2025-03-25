import java.util.*;
public class string_split {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String in=s.nextLine();
        String s1=s.nextLine();
        int rem=in.length()-s1.length();
        String res=in.substring(rem-1);
        System.out.print(res);
    }
}
