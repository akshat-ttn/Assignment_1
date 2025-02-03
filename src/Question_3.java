import java.util.Scanner;

class CircleCalculator{
    static double calArea(double radius) {
        return Math.PI * radius * radius;
    }

    static double calCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}

public class Question_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        double radius;

        do {
            // Display the menu
            System.out.println("*******Menu*******");
            System.out.println("1. Calculate Area of Circle");
            System.out.println("2. Calculate Circumference of a Circle");
            System.out.println("3. Exit");
            System.out.print("Choose an option (1-3): ");

            choice = sc.nextInt();

            if (choice == 1 || choice == 2) {
                System.out.print("Enter the radius of the circle: ");
                radius = sc.nextDouble();
            } else {
                radius = 0;
            }

            switch (choice) {
                case 1:
                    double area = CircleCalculator.calArea(radius);
                    System.out.printf("Area of the circle: %.2f%n", area);
                    break;
                case 2:
                    double circumference = CircleCalculator.calCircumference(radius);
                    System.out.printf("Circumference of the circle: %.2f%n", circumference);
                    break;
                case 3:
                    System.out.println("Exiting the program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid option (1-3).");
            }
            System.out.println();
        } while (choice != 3);
    }
}

