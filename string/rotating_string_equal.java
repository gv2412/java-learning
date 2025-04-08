import java.util.Scanner;
public class rotating_string_equal {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    String s1=s.next();
    String s2=s.next();
    String s3=s1.concat(s1);
    System.out.println(s3.contains(s2)?"yes":"no");
    }   
}
