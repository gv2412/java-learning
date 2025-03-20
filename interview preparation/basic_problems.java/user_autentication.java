//generate a user authentication program to check whether the input username and password are correct or not which should meet the following requirements:
//1. The username should be similar to email id and the password should contain a uppercase ,lowercase ,numbers and special characters in it.
//2. If the username and password are correct, print "Welcome admin".
//3. If the username is correct but the password is incorrect, print "Invalid password".
//4. If the username is incorrect, print "Invalid username".
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@" +
                "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
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
