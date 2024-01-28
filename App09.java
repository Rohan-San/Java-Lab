// Only interfaces has been implemented since packages wasn't covered in lab

import java.util.Scanner;

public class App09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Compute GBConverter = new BGBConverter();
        System.out.print("Enter number of Giga Bytes (GBs): ");
        double gb = scan.nextDouble();
        double b = GBConverter.convert(gb);
        System.out.println(gb + " GB is equal to " + b + "B");

        Compute EuroConverter = new EuroRsConverter();
        System.out.print("Enter amount in Euros: ");
        double eur = scan.nextDouble();
        double rs = EuroConverter.convert(eur);
        System.out.println(eur + " Euros is equal to " + rs + " Rupees");
        scan.close();
    }
}

interface Compute {
    double convert(double value);
}

class BGBConverter implements Compute {
    public double convert(double gb) {
        // 1 GB = 1000*1000*1000 B
        return (gb * 1000 * 1000 * 1000);
    }
}

class EuroRsConverter implements Compute {
    public double convert(double euro) {
        // 1 Euro = 90 Rs
        return euro * 90.0;
    }
}

// Output:
// Enter number of Giga Bytes (GBs): 2.43
// 2.43 GB is equal to 2.43E9B
// Enter amount in Euros: 420
// 420.0 Euros is equal to 37800.0 Rupees

// Enter number of Kilo Bytes (KBs): 396478000
// 3.96478E8 KB is equal to 396.478 GB
