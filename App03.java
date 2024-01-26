import java.util.Scanner;

public class App03 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the real and imaginary part of first Complex Number: ");
        double r1 = scan.nextDouble();
        double i1 = scan.nextDouble();
        System.out.print("Enter the real and imaginary part of second Complex Number: ");
        double r2 = scan.nextDouble();
        double i2 = scan.nextDouble();
        ComplexNumber c1 = new ComplexNumber(r1, i1);
        ComplexNumber c2 = new ComplexNumber(r2, i2);
        System.out.println("The two complex numbers are: ");
        c1.display();
        c2.display();

        // 1. Addition
        System.out.println("The sum of both complex numbers is: ");
        ComplexNumber sum = c1.add(c2);
        sum.display();

        // 2. Subtraction
        System.out.println("The difference of both complex numbers is: ");
        ComplexNumber diff = c1.subtract(c2);
        diff.display();

        // Increment Decrement
        System.out.println("Incrementation of first complex numbers is: ");
        c1.increment();
        c1.display();
        System.out.println("Decrementation of second complex numbers is: ");
        c2.decrement();
        c2.display();

        // 3. Comparison
        boolean val = c1.isEqual(c2);
        if (val == true) {
            System.out.println("The 2 complex numbers are equal");
        } else {
            System.out.println("The 2 complex numbers are unequal");
        }
        System.out.println();
    }
}

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        double t1 = this.real + other.real;
        double t2 = this.imaginary + other.imaginary;
        return new ComplexNumber(t1, t2);
    }

    public ComplexNumber subtract(ComplexNumber other) {
        double t1 = this.real - other.real;
        double t2 = this.imaginary - other.imaginary;
        return new ComplexNumber(t1, t2);
    }

    public void increment() {
        this.real++;
        this.imaginary++;
    }

    public void decrement() {
        this.real--;
        this.imaginary--;
    }

    public boolean isEqual(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }

    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

// Output:
// Enter the real and imaginary part of first Complex Number: 21 5
// Enter the real and imaginary part of second Complex Number: 24 7
// The two complex numbers are:        
// 21.0 + 5.0i
// 24.0 + 7.0i
// The sum of both complex numbers is: 
// 45.0 + 12.0i
// The difference of both complex numbers is:
// -3.0 + -2.0i
// Incrementation of first complex numbers is:
// 22.0 + 6.0i
// Decrementation of second complex numbers is:
// 23.0 + 6.0i
// The 2 complex numbers are unequal

// Enter the real and imaginary part of first Complex Number: 21 7
// Enter the real and imaginary part of second Complex Number: 21 7
// The two complex numbers are: 
// 21.0 + 7.0i
// 21.0 + 7.0i
// The sum of both complex numbers is:
// 42.0 + 14.0i
// The difference of both complex numbers is:
// 0.0 + 0.0i
// Incrementation of first complex numbers is:
// 22.0 + 8.0i
// Decrementation of second complex numbers is:
// 20.0 + 6.0i
// The 2 complex numbers are unequal

// Enter the real and imaginary part of first Complex Number: 20 3
// Enter the real and imaginary part of second Complex Number: 22 5
// The two complex numbers are: 
// 20.0 + 3.0i
// 22.0 + 5.0i
// The sum of both complex numbers is:
// 42.0 + 8.0i
// The difference of both complex numbers is:
// -2.0 + -2.0i
// Incrementation of first complex numbers is:
// 21.0 + 4.0i
// Decrementation of second complex numbers is:
// 21.0 + 4.0i
// The 2 complex numbers are equal
