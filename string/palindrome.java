import java.util.*;
class palindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        str = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        if (str.equals(rev)) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }        
}
