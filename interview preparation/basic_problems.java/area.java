
import java.util.Scanner;

public class area {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose an operation:");
        System.out.println("1. Calculate area");
        System.out.println("2. Calculate volume");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                calculateArea(scanner);
                break;
            case 2:
                calculateVolume(scanner);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }

    public static void calculateArea(Scanner scanner) {
        System.out.println("Choose a shape:");
        System.out.println("1. Circle");
        System.out.println("2. Rectangle");
        System.out.println("3. Square");
        System.out.println("4. Triangle");
        int shapeChoice = scanner.nextInt();

        switch (shapeChoice) {
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Area of circle: " + (Math.PI * radius * radius));
                break;
            case 2:
                System.out.print("Enter length: ");
                double length = scanner.nextDouble();
                System.out.print("Enter width: ");
                double width = scanner.nextDouble();
                System.out.println("Area of rectangle: " + (length * width));
                break;
            case 3:
                System.out.print("Enter side: ");
                double side = scanner.nextDouble();
                System.out.println("Area of square: " + (side * side));
                break;
            case 4:
                System.out.print("Enter base: ");
                double base = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                System.out.println("Area of triangle: " + (0.5 * base * height));
                break;
            default:
                System.out.println("Invalid shape choice.");
        }
    }
        public static void calculateVolume(Scanner scanner) {
        System.out.println("Choose a shape:");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cone");
        int shapeChoice = scanner.nextInt();
        switch (shapeChoice) {
        
            case 1:
                System.out.print("Enter radius: ");
                double radius = scanner.nextDouble();
                System.out.println("Volume of sphere: " + (4.0 / 3.0 * Math.PI * radius * radius * radius));
                break;
            case 2:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height: ");
                double height = scanner.nextDouble();
                System.out.println("Volume of cylinder: " + (Math.PI * radius * radius * height));
                break;
            case 3:
                System.out.print("Enter radius: ");
                radius = scanner.nextDouble();
                System.out.print("Enter height: ");
                height = scanner.nextDouble();
                System.out.println("Volume of cone: " + (1.0 / 3.0 * Math.PI * radius * radius * height));
                break;
            default:
                System.out.println("Invalid shape choice.");
        }

    }
}

    
