import java.util.Scanner;

public class App05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Compile time Polymorphism (Preferably replace "App05" with "Polymorphism" everywhere, even file name)
        App05 obj1 = new App05(); 
        System.out.print("Enter first string: ");
        String s1 = scan.nextLine();
        System.out.print("Enter second string: ");
        String s2 = scan.nextLine();
        obj1.compare(s1, s2);
        System.out.print("Enter number of characters to compare: ");
        int n = scan.nextInt();
        obj1.compare(s1, s2, n);
        scan.close();
    }

    public void compare(String s1, String s2) {
        if (s1.compareTo(s2) == 0) {
            System.out.println("The 2 strings are same");
        } else {
            System.out.println("The 2 strings are not same");
        }
    }

    public void compare(String s1, String s2, int n) {
        int flag = 0;
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                flag = 1;
            }
        }
        if (flag == 0) {
            System.out.println("The 2 strings are same upto " + n + " characters");
        } else {
            System.out.println("The 2 strings are not same upto " + n + " characters");
        }
    }
}

// Output:
// Enter first string: hello
// Enter second string: world
// The 2 strings are not same
// Enter number of characters to compare: 1
// The 2 strings are not same upto 1 characters

// Enter first string: hello
// Enter second string: hello
// The 2 strings are same
// Enter number of characters to compare: 3
// The 2 strings are same upto 3 characters

// Enter first string: helloworld
// Enter second string: hellcat
// The 2 strings are not same
// Enter number of characters to compare: 4
// The 2 strings are same upto 4 characters
