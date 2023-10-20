public class bubblesort {
    public static void main(String[] args) {
        float arr[] = new float [] { 1.2f, 5.3f, 3.7f, 8.3f, 4.5f, 2.9f };
        float n = arr.length;
        float temp = 0;
        System.out.println("Array Before Bubble Sort");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("Array After Bubble Sort");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
