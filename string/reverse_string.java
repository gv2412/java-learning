import java.util.*;
public class reverse_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String res[]=str.split(" ");
        String s1="";
        for(int i=res.length-1;i>=0;i--)
        {
            s1+=res[i]+" ";
        }
        System.out.print(s1.trim());
     
    }
}
