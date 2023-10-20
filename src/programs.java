public class programs {
    // Sum of numbers
    // public static void main(String args[])
    // // Static prefix associates the data member with the whole class and not just an object
    // {
    //     int n1 = 225, n2 = 115, sum;
    //     sum = n1 + n2;
    //     System.out.println("The sum of numbers is: "+sum);
    //     // println will bring cursor to new line, print will not.
    // }

    // Area of rectangle
    // public static void main(String args[])
    // {
    //     int n1 = 20, n2 = 10, rect;
    //     rect = n1 * n2;
    //     System.out.println("The area of rectangle is: "+rect);
    // }

    // Swap
    // public static void main(String args[])
    // {
    //     int n1 = 20, n2 = 10, swap;
    //     System.out.println("Before swapping, n1: "+n1);
    //     System.out.println("Before swapping, n2: "+n2);
    //     swap = n1;
    //     n1 = n2;
    //     n2 = swap;
    //     System.out.println("After swapping, n1: "+n1);
    //     System.out.println("After swapping, n2: "+n2);
    // }
    public static void main(String args[])
    {
        for (int i=0; i< 10; i++){
            if (i%2==0){
                System.out.println(i+" is even.");
            }
            else{
                System.out.println(i+" is odd.");
            }
        }
    }
}
