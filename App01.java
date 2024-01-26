import java.util.Arrays;
import java.util.Scanner;

public class App01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Area of rectangle
        System.out.print("Enter the length of the rectangle: ");
        double length = scan.nextDouble();
        System.out.print("Enter the width of the rectangle: ");
        double width = scan.nextDouble();
        double area = calculateRectangleArea(length, width);
        System.out.println("Area of the rectangle: " + area);

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

    public static double calculateRectangleArea(double length, double width) {
        return length * width;
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
