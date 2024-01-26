import java.util.Scanner;

public class App06 {
    public static void main(String[] args) {
        CityBank cityBank = new CityBank();
        SBIBank sbiBank = new SBIBank();
        CanaraBank canaraBank = new CanaraBank();
        System.out.println("Enter details for City Bank account:");
        cityBank.readDetails();
        cityBank.displayDetails();
        cityBank.calculateInterest();
        System.out.println("\nEnter details for SBI Bank account:");
        sbiBank.readDetails();
        sbiBank.displayDetails();
        sbiBank.calculateInterest();
        System.out.println("\nEnter details for Canara Bank account:");
        canaraBank.readDetails();
        canaraBank.displayDetails();
        canaraBank.calculateInterest();
    }
}

// Base class
abstract class Bank {
    protected String name;
    protected long accountNumber;
    protected double balance;

    // Member functions
    void readDetails() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = scan.nextLine();
        System.out.print("Enter Account Number: ");
        accountNumber = scan.nextLong();
        System.out.print("Enter Balance: ");
        balance = scan.nextDouble();
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Abstract method for calculating interest
    abstract void calculateInterest();
}

// Derived class CityBank
class CityBank extends Bank {
    // Implementation of the calculateInterest method
    void calculateInterest() {
        double rate = 0.05; // City Bank interest rate
        double interest = balance * rate;
        System.out.println("Interest Earned at City Bank: " + interest);
    }
}

// Derived class SBIBank
class SBIBank extends Bank {
    // Implementation of the calculateInterest method
    void calculateInterest() {
        double rate = 0.06; // SBI Bank interest rate
        double interest = balance * rate;
        System.out.println("Interest Earned at SBI Bank: " + interest);
    }
}

// Derived class CanaraBank
class CanaraBank extends Bank {
    // Implementation of the calculateInterest method
    void calculateInterest() {
        double rate = 0.04; // Canara Bank interest rate
        double interest = balance * rate;
        System.out.println("Interest Earned at Canara Bank: " + interest);
    }
}

// Output:
// Enter details for City Bank account:
// Enter Name: Charitra
// Enter Account Number: 101
// Enter Balance: 23000
// Name: Charitra
// Account Number: 101
// Balance: 23000.0
// Interest Earned at City Bank: 1150.0

// Enter details for SBI Bank account:
// Enter Name: Ramya
// Enter Account Number: 102
// Enter Balance: 25000
// Name: Ramya
// Account Number: 102
// Balance: 25000.0
// Interest Earned at SBI Bank: 1500.0

// Enter details for Canara Bank account:
// Enter Name: Savita
// Enter Account Number: 103
// Enter Balance: 24000
// Name: Savita
// Account Number: 103
// Balance: 24000.0
// Interest Earned at Canara Bank: 960.0
