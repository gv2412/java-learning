import java.util.*;
public class digit_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 1; 
        printDigits(num, c);
        sc.close(); 
    }

    public static void printDigits(int num, int c) {
        if (num == 0) {
            return; 
        }

        int digit = num % 10;
        
        switch (c) {
            case 1:
                System.out.println(digit + " is at ones place");
                break;
            case 2:
                System.out.println(digit + " is at tens place");
                break;
            case 3:
                System.out.println(digit + " is at hundreds place");
                break;
            case 4:
                System.out.println(digit + " is at thousands place");
                break;
            case 5:
                System.out.println(digit + " is at ten thousands place");
                break;
            default:  
                System.out.println(digit + " is at infinity");
        }



        printDigits(num / 10, c + 1); 
    }
}
