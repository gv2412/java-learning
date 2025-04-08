import java.util.*;
class panagram {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.toLowerCase();
        boolean flag = true;
        if (str.length() < 26) {
            flag = false;
        } else {
            for (char ch = 'a'; ch <= 'z'; ch++) {
                if (str.indexOf(ch) < 0) {
                    flag = false;
                    break;  
                }
            }
        }
            System.out.println(flag? "panagram" : "not panagram");
    }    
}
