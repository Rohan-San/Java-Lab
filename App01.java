import java.util.Arrays;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // // 0. Area of rectangle
        // System.out.print("Enter the length of the rectangle: ");
        // double length = scan.nextDouble();
        // System.out.print("Enter the width of the rectangle: ");
        // double width = scan.nextDouble();
        // double area = calculateRectangleArea(length, width);
        // System.out.println("Area of the rectangle: " + area);

        // 1. Roots of Quadratic Equation
        System.out.println("Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:");
        System.out.print("Enter coefficient a: ");
        double a = scan.nextDouble();
        System.out.print("Enter coefficient b: ");
        double b = scan.nextDouble();
        System.out.print("Enter coefficient c: ");
        double c = scan.nextDouble();
        quadRoots(a, b, c);

        // 2. Multiply arrays
        System.out.print("Enter the size of the arrays: ");
        int size = scan.nextInt();
        int[] array1 = new int[size];
        int[] array2 = new int[size];
        System.out.println("Enter elements of array1: ");
        for (int i = 0; i < size; i++) {
            array1[i] = scan.nextInt();
        }
        System.out.println("Enter elements of array2: ");
        for (int i = 0; i < size; i++) {
            array2[i] = scan.nextInt();
        }
        int[] result = multiplyArrays(array1, array2);
        System.out.println("Multiplication Result: " + Arrays.toString(result));

        // 3. Bubble sort
        System.out.println("Enter the size of the array to be sorted: ");
        size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        bubbleSortAscending(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));
        bubbleSortDescending(arr);
        System.out.println("Descending Order: " + Arrays.toString(arr));
        scan.close();
    }

    // public static double calculateRectangleArea(double length, double width) {
    //     return length * width;
    // }

    public static void quadRoots(double a, double b, double c) {
        double disc = b * b - 4 * a * c;
        if (disc > 0) {
            double root1 = (-b + Math.sqrt(disc)) / (2 * a);
            double root2 = (-b - Math.sqrt(disc)) / (2 * a);
            System.out.println("Roots are real and different:");
            System.out.println("Root 1 = " + root1);
            System.out.println("Root 2 = " + root2);
        } else if (disc == 0) {
            double root = -b / (2 * a);
            System.out.println("Roots are real and same:");
            System.out.println("Root = " + root);
        } else {
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-disc) / (2 * a);
            System.out.println("Roots are complex and different:");
            System.out.println("Root 1 = " + realPart + " + " + imaginaryPart + "i");
            System.out.println("Root 2 = " + realPart + " - " + imaginaryPart + "i");
        }
    }

    public static int[] multiplyArrays(int[] array1, int[] array2) {
        int length = array1.length;
        int[] result = new int[length];
        for (int i = 0; i < length; i++) {
            result[i] = array1[i] * array2[i];
        }
        return result;
    }

    public static void bubbleSortAscending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void bubbleSortDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

// Output:
// Enter the length of the rectangle: 12
// Enter the width of the rectangle: 4
// Area of the rectangle: 48.0   

// Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:
// Enter coefficient a: 1
// Enter coefficient b: 4
// Enter coefficient c: 1
// Roots are real and different:
// Root 1 = -0.2679491924311228
// Root 2 = -3.732050807568877

// Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:
// Enter coefficient a: 1
// Enter coefficient b: 2
// Enter coefficient c: 1
// Roots are real and same:
// Root = -1.0

// Enter the coefficients of the quadratic equation ax^2 + bx + c = 0:
// Enter coefficient a: 1
// Enter coefficient b: 1
// Enter coefficient c: 1
// Roots are complex and different:
// Root 1 = -0.5 + 0.8660254037844386i
// Root 2 = -0.5 - 0.8660254037844386i

// Enter the size of the arrays: 7
// Enter elements of array1: 
// 1 3 2 4 6 5 8
// Enter elements of array2: 
// 2 5 4 1 7 3 6
// Multiplication Result: [2, 15, 8, 4, 42, 15, 48]

// Enter the size of the array to be sorted:
// 9
// Enter elements of the array: 
// 21 23 54 6 24 78 61 59 84
// Ascending Order: [6, 21, 23, 24, 54, 59, 61, 78, 84]
// Descending Order: [84, 78, 61, 59, 54, 24, 23, 21, 6]
