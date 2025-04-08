import java.util.*;
public class anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
        char c1[]=str1.toCharArray();
        char c2[]=str2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if(Arrays.equals(c1,c2)){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
}
