import java.util.*;
public class string_comparision {
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String str1=s.nextLine();
        String str2=s.nextLine();
       
        if(str1.equals(str2)){
            System.out.println("equals in char");
        }
        else if(str1.equalsIgnoreCase(str2)){
            System.out.println("equals in alphabets");
        }
        else{
            System.out.println("not equals");
        }
    }

}
