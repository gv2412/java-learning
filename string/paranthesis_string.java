import java.util.*;
public class paranthesis_string {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        for(char c:str.toCharArray()){
            if(c=='('){
                count++;
            }
            else if(c==')'){
                count--;
            }
        }
        if(count==0){
            System.out.println("valid");
        }
        else{
            System.out.println("invalid");
        }
    }

}
