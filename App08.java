import java.util.Scanner;

public class App08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.print("Enter the numerator (positive integer): ");
            int num = scan.nextInt();
            System.out.print("Enter the denominator (positive integer, non-zero): ");
            int den = scan.nextInt();
            if (num > 0 && den > 0) {
                double res = (double) num / den;
                System.out.println("Result of division: " + res);
            } else {
                throw new ArithmeticException("Invalid input: Numerator and denominator must be positive and non-zero");
            }
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Invalid input: Please enter integers only.");
        } finally {
            scan.close();
        }
    }
}

// Output:
// Enter the numerator (positive integer): 8
// Enter the denominator (positive integer, non-zero): 3
// Result of division: 2.6666666666666665

// Enter the numerator (positive integer): 8
// Enter the denominator (positive integer, non-zero): 0
// Invalid input: Numerator and denominator must be positive and non-zero

// Enter the numerator (positive integer): -7
// Enter the denominator (positive integer, non-zero): 3
// Invalid input: Numerator and denominator must be positive and non-zero

// Enter the numerator (positive integer): a
// Invalid input: Please enter integers only.
