import java.util.Scanner;

public class gmailid_string {
    public static boolean isValidEmail(String email) {
        if (email == null || email.isEmpty()) {
            return false;
        }

        boolean hasSpecialChar = false;
        boolean hasNumber = false;

        for (char c : email.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '@' && c != '.') {
                hasSpecialChar = true;
            }
            if (Character.isDigit(c)) {
                hasNumber = true;
            }
        }

        return email.contains("@") && email.contains(".") && hasSpecialChar && hasNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        if (isValidEmail(email)) {
            System.out.println("Valid email");
        } else {
            System.out.println("Invalid email");
        }
        scanner.close();
    }
}
  