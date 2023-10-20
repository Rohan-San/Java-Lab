import java.util.Scanner;

public class rectArea {
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter length and breadth: ");
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        int rect = n1 * n2;
        System.out.println("The area of rectangle is: "+rect);
        scan.close();
    }
}
