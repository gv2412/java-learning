import java.util.*;
public class vowels_consonants {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String s1="";
        String s2="";
        int c1=0;
        int c2=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(Character.isLetter(c)){
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
                s1+=c+",";
                c1++;
            }
            else{
                c2++;
                s2+=c+",";
            }
        }
            
        }
        String a=s1.substring(0,s1.length()-1);
        String b=s2.substring(0,s2.length()-1);
        System.out.println("VOWELS :"+c1);   
        System.out.println("VOWELS letter : "+a);
        System.out.println("CONSONANTS :"+c2);
        System.out.println("CONSONANTS letters : "+b);
    }
}
