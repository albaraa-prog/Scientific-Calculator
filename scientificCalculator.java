import java.util.Scanner;

public class scientificCalculator {

    public static double Multiply(double a, double b) {
        return a * b;
    }

    public static double Add(double a, double b){
        return a + b;
    }

    public static double Subtract(double a, double b){
        return a - b;
    }

    public static double Division(double a, double b){
        return a / b;
    }

    public static double squareRoot(double a){
        return Math.sqrt(a);
    }

    public static double Power(double a, double b){
        return Math.pow(a ,b);
    }

    public static double Sine(double a){
        return Math.sin(Math.toRadians(a));
    }

    public static double Cosine(double a){
        return Math.cos(Math.toRadians(a));
    }

    public static double Tangent(double a){
        return Math.tan(Math.toRadians(a));
    }

    public static double naturalLogarithm(double a){
        return Math.log(a);
    }

    public static double logarithmBase10(double a){
        return Math.log10(a);
    }

    public static double AbsoluteValue(double a){
        return Math.abs(a);
    }

    public static double Round(double a){
        return Math.round(a);
    }

    public static double Ceiling(double a){
        return Math.ceil(a);
    }

    public static double Floor(double a){
        return Math.floor(a);
    }

    public static double Minimum(double a, double b){
        return Math.min(a, b);
    }

    public static double Maximum(double a, double b){
        return Math.max(a, b);
    }

    public static void displayMenu(){
        System.out.println("\nScientific Calculator Menu:");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Square Root");
        System.out.println("6. Power");
        System.out.println("7. Sine");
        System.out.println("8. Cosine");
        System.out.println("9. Tangent");
        System.out.println("10. Natural Logarithm");
        System.out.println("11. Logarithm Base 10");
        System.out.println("12. Absolute Value");
        System.out.println("13. Round");
        System.out.println("14. Ceiling");
        System.out.println("15. Floor");
        System.out.println("16. Minimum");
        System.out.println("17. Maximum");
        System.out.println("0. Exit");
        System.out.print("Choose an operation: ");
    }

    private static void performOperation(Scanner scanner, int choice) {
        double a, b, result = 0;
        boolean valid = true;

        try {
            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = Add(a, b);
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = Subtract(a, b);
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = Multiply(a, b);
                    break;
                case 4:
                    System.out.print("Enter numerator and denominator: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    if (b == 0) {
                        System.out.println("Error: Division by zero.");
                        valid = false;
                    } else {
                        result = Division(a, b);
                    }
                    break;
                case 5:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = squareRoot(a);
                    break;
                case 6:
                    System.out.print("Enter base and exponent: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = Power(a, b);
                    break;
                case 7:
                    System.out.print("Enter angle in degrees: ");
                    a = scanner.nextDouble();
                    result = Sine(a);
                    break;
                case 8:
                    System.out.print("Enter angle in degrees: ");
                    a = scanner.nextDouble();
                    result = Cosine(a);
                    break;
                case 9:
                    System.out.print("Enter angle in degrees: ");
                    a = scanner.nextDouble();
                    result = Tangent(a);
                    break;
                case 10:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = naturalLogarithm(a);
                    break;
                case 11:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = logarithmBase10(a);
                    break;
                case 12:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = AbsoluteValue(a);
                    break;
                case 13:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = Round(a);
                    break;
                case 14:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = Ceiling(a);
                    break;
                case 15:
                    System.out.print("Enter a number: ");
                    a = scanner.nextDouble();
                    result = Floor(a);
                    break;
                case 16:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = Minimum(a, b);
                    break;
                case 17:
                    System.out.print("Enter two numbers: ");
                    a = scanner.nextDouble();
                    b = scanner.nextDouble();
                    result = Maximum(a, b);
                    break;
                default:
                    valid = false;
                    System.out.println("Invalid choice.");
            }
            if (valid) {
                System.out.println("Result: " + result);
            }
        } catch (Exception e) {
            System.out.println("Input error. Please enter valid numbers.");
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        char continueChoice;
        do {
            displayMenu();
            while (!scanner.hasNextInt()) {
                System.out.print("Please enter a valid number: ");
                scanner.next();
            }
            choice = scanner.nextInt();
            if (choice != 0) {
                performOperation(scanner, choice);
                System.out.print("(Y/y to continue): ");
                continueChoice = scanner.next().charAt(0);
            } else {
                System.out.println("closing calculator...");
                break;
            }
        } while (continueChoice == 'Y' || continueChoice == 'y');
        System.out.println("closing calculator...");
        scanner.close();
    }
}
