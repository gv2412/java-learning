import java.util.Scanner;

public class user_autentication {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        if (isValidUsername(username)) {
            if (isValidPassword(password)) {
                System.out.println("Welcome admin");
            } else {
                System.out.println("Invalid password");
            }
        } else {
            System.out.println("Invalid username");
        }
    }

    public static boolean isValidUsername(String username) {
        if(username==null||username.isEmpty()){
            return false;
        }
        if(!username.endsWith("@gmail.com")){
            return false;
        }
        return true;
    }

    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;
        boolean hasSpecial = false;
        for (char c : password.toCharArray()) {
            if (Character.isUpperCase(c)) {
                hasUpper = true;
            } else if (Character.isLowerCase(c)) {
                hasLower = true;
            } else if (Character.isDigit(c)) {
                hasDigit = true;
            } else if (!Character.isLetterOrDigit(c)) {
                hasSpecial = true;
            }
        }
        return hasUpper && hasLower && hasDigit && hasSpecial;
    }
}