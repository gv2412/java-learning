import java.util.*;
public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false; 
        }

        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSpecial = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            } else if ("@#$%^&+=!".contains(String.valueOf(ch))) { 
                hasSpecial = true;
            } else if (Character.isWhitespace(ch)) {
                return false; 
            }
        }

        return hasUpper && hasLower && hasDigit && hasSpecial;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String passwords[]=new String[5];
        for(int i=0;i<1;i++){
            passwords[i]=s.nextLine();
        }
        for (String password : passwords) {
            System.out.println("Password: " + password + " -> " + (isValidPassword(password) ? "Valid" : "Invalid"));
        }
    }
}
