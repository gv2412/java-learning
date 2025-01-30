import java.util.*;
public class string_lower_upper_case {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str3=str1.toLowerCase();
        String str4=str1.toUpperCase();
        System.out.println(str3);
        System.out.println(str4);
    }
}