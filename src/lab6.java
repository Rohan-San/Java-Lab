// 1. Write a Java program using encapsulation and constructors to create a class to represent a complex number and perform the operation. 
// a. addition of two complex numbers.
// b. subtraction  of two complex numbers
// c.increnent 
// d. decrement
// e. compare the complex numbers

public class ComplexNumber {
    private double real;
    private double imaginary;
    // Constructors
    public ComplexNumber() {
        this.real = 0.0;
        this.imaginary = 0.0;
    }
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }
    // Getters and Setters
    public double getReal() {
        return real;
    }
    public void setReal(double real) {
        this.real = real;
    }
    public double getImaginary() {
        return imaginary;
    }
    public void setImaginary(double imaginary) {
        this.imaginary = imaginary;
    }
    // Addition of two complex numbers
    public ComplexNumber add(ComplexNumber other) {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    // Subtraction of two complex numbers
    public ComplexNumber subtract(ComplexNumber other) {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new ComplexNumber(newReal, newImaginary);
    }
    // Increment
    public void increment() {
        this.real++;
        this.imaginary++;
    }
    // Decrement
    public void decrement() {
        this.real--;
        this.imaginary--;
    }
    // Compare two complex numbers
    public boolean isEqual(ComplexNumber other) {
        return this.real == other.real && this.imaginary == other.imaginary;
    }
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(3.0, 4.0);
        ComplexNumber num2 = new ComplexNumber(1.5, 2.5);
        // Addition
        ComplexNumber sum = num1.add(num2);
        System.out.println("Sum: " + sum.getReal() + " + " + sum.getImaginary() + "i");
        // Subtraction
        ComplexNumber difference = num1.subtract(num2);
        System.out.println("Difference: " + difference.getReal() + " + " + difference.getImaginary() + "i");
        // Increment
        num1.increment();
        System.out.println("After Increment: " + num1.getReal() + " + " + num1.getImaginary() + "i");
        // Decrement
        num2.decrement();
        System.out.println("After Decrement: " + num2.getReal() + " + " + num2.getImaginary() + "i");
        // Compare
        if (num1.isEqual(num2)) {
            System.out.println("The complex numbers are equal.");
        } else {
            System.out.println("The complex numbers are not equal.");
        }
    }
}

// 2. Write a Java program to read two positive integers, perform the division operation, and display the result if a user enters a positive integer and non-zero denominator. If the input is negative or the denominator is zero, generate a negative number input and divide by zero to handle the scenario.

import java.util.Scanner;

public class DivisionProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            // Read the numerator
            System.out.print("Enter a positive numerator: ");
            int numerator = scanner.nextInt();
            // Read the denominator
            System.out.print("Enter a positive non-zero denominator: ");
            int denominator = scanner.nextInt();
            // Check for positive input and non-zero denominator
            if (numerator > 0 && denominator != 0) {
                // Perform the division
                double result = (double) numerator / denominator;
                System.out.println("Result of division: " + result);
            } else {
                // Generate a negative number input and divide by zero to handle the scenario
                int negativeInput = -5;
                int divideByZeroResult = negativeInput / 0;
                System.out.println("Error: Negative input or division by zero detected. Result: " + divideByZeroResult);
            }
        } catch (Exception e) {
            // Handle non-integer input
            System.out.println("Error: Please enter valid integers.");
        } finally {
            scanner.close(); // Close the scanner
        }
    }
}

// 3. Write a Java program to define an interface to compute with an abstract method convert. define two new classes that implement the compute interface and extend the convert method to convert from bytes to kilobytes and euros to rupees declare objects for each class and demonstrate conversion from euros to rupees and bytes to kilobytes.

// Define the Compute interface
interface Compute {
    void convert();
}
// Class implementing Compute for bytes to kilobytes conversion
class BytesConverter implements Compute {
    private int bytes;
    // Constructor
    public BytesConverter(int bytes) {
        this.bytes = bytes;
    }
    // Implementation of the convert method for bytes to kilobytes
    @Override
    public void convert() {
        double kilobytes = bytes / 1024.0;
        System.out.println(bytes + " bytes is equal to " + kilobytes + " kilobytes");
    }
}
// Class implementing Compute for euros to rupees conversion
class CurrencyConverter implements Compute {
    private double euros;
    // Constructor
    public CurrencyConverter(double euros) {
        this.euros = euros;
    }
    // Implementation of the convert method for euros to rupees
    @Override
    public void convert() {
        // Assuming 1 Euro = 90 Rupees for the sake of example
        double rupees = euros * 90;
        System.out.println(euros + " euros is equal to " + rupees + " rupees");
    }
}

public class ConversionDemo {
    public static void main(String[] args) {
        // Demonstrate bytes to kilobytes conversion
        BytesConverter bytesConverter = new BytesConverter(2048); // 2048 bytes
        System.out.println("Bytes to Kilobytes Conversion:");
        bytesConverter.convert();
        System.out.println();
        // Demonstrate euros to rupees conversion
        CurrencyConverter currencyConverter = new CurrencyConverter(50.0); // 50 euros
        System.out.println("Euros to Rupees Conversion:");
        currencyConverter.convert();
    }
}
