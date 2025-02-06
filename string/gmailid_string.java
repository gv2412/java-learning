import java.util.*;
public class gmailid_string {
    //generate the code for checking a string is a valid gmail or not without using map function and provide string as user input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean flag = false;
        if (str.contains("@gmail.com")) {
            flag = true;
        }
        if (flag == true) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }
}


   