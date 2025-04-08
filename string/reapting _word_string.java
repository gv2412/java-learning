import java.util.*;
class reapting_word_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        char c[]=str.toCharArray();
        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(c[i]==c[j]){
                    System.out.print(c[i]+" ");}}}}}