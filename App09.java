// Only interfaces has been implemented since packages wasn't covered in lab

import java.util.Scanner;

public class App09 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Compute GBConverter = new KBGBConverter();
        System.out.print("Enter number of Kilo Bytes (KBs): ");
        double kb = scan.nextDouble();
        double gb = GBConverter.convert(kb);
        System.out.println(kb + " KB is equal to " + gb + " GB");
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

class KBGBConverter implements Compute {
    public double convert(double kb) {
        // 1 GB = 1000*1000 KB
        return (kb / (1000 * 1000));
    }
}

class EuroRsConverter implements Compute {
    public double convert(double euro) {
        // 1 Euro = 90 Rs
        return euro * 90.0;
    }
}

// Output:
// Enter number of Kilo Bytes (KBs): 396478000
// 3.96478E8 KB is equal to 396.478 GB
// Enter amount in Euros: 420
// 420.0 Euros is equal to 37800.0 Rupees
