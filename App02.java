import java.util.Scanner;

public class App02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // 1. Read and display details
        System.out.print("Enter number of employees: ");
        int num = scan.nextInt();
        scan.nextLine(); // Consumes the newline character left by nextInt()
        empdetails[] employees = new empdetails[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter details for Employee " + (i + 1));
            employees[i] = new empdetails();
            employees[i].getdata();
        }
        for (int i = 0; i < num; i++) {
            System.out.println("Details for Employee " + (i + 1));
            employees[i].printdata();
        }

        // 2. Sum of salary of sales department
        double salestotal = 0;
        for (int i = 0; i < num; i++) {
            if (employees[i].dept.compareTo("sales") == 0) {
                salestotal = salestotal + employees[i].sal;
            }
        }
        System.out.println("Total Salary of Sales Department is " + salestotal);

        // 3. Highest paid manager in purchase
        double max = 0;
        int index = 0;
        for (int i = 0; i < num; i++) {
            if (employees[i].dept.compareTo("purchase") == 0 & employees[i].des.compareTo("manager") == 0) {
                if (employees[i].sal > max) {
                    max = employees[i].sal;
                    index = i;
                }
            }
        }
        if (max == 0) {
            System.out.println("There are no managers in purchase department");
        } else {
            System.out.println("Details of highest paid manager of purchase department is ");
            employees[index].printdata();
        }
    }
}

class empdetails {
    public String name, ID, dept, des;
    public int age;
    public double sal;

    public void getdata() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the name of the employee: ");
        name = scan.nextLine();
        System.out.print("Enter the Employee ID: ");
        ID = scan.nextLine();
        System.out.print("Enter the department of the employee: ");
        dept = scan.nextLine();
        System.out.print("Enter the age of employee: ");
        age = scan.nextInt();
        scan.nextLine(); // Consumes the newline character left by nextInt()
        System.out.print("Enter the designation of the employee: ");
        des = scan.nextLine();
        System.out.print("Enter the salary of the employee: ");
        sal = scan.nextDouble();
        scan.nextLine(); // Consumes the newline character left by nextDouble()
        System.out.println();
    }

    public void printdata() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Employee ID: " + ID);
        System.out.println("Department: " + dept);
        System.out.println("Designation: " + des);
        System.out.println("Salary: " + sal);
        System.out.println();
    }
}

// Output:
// Enter number of employees: 5
// Enter details for Employee 1    
// Enter the name of the employee: Rohan
// Enter the Employee ID: 001
// Enter the department of the employee: purchase
// Enter the age of employee: 20
// Enter the designation of the employee: manager
// Enter the salary of the employee: 15000

// Enter details for Employee 2
// Enter the name of the employee: Davin
// Enter the Employee ID: 002
// Enter the department of the employee: purchase
// Enter the age of employee: 21
// Enter the designation of the employee: manager
// Enter the salary of the employee: 20000

// Enter details for Employee 3
// Enter the name of the employee: Yash
// Enter the Employee ID: 003
// Enter the department of the employee: sales
// Enter the age of employee: 22
// Enter the designation of the employee: manager
// Enter the salary of the employee: 50000

// Enter details for Employee 4
// Enter the name of the employee: Kshitij
// Enter the Employee ID: 004
// Enter the department of the employee: sales
// Enter the age of employee: 20
// Enter the designation of the employee: assistant
// Enter the salary of the employee: 18000

// Enter details for Employee 5
// Enter the name of the employee: Surya
// Enter the Employee ID: 005
// Enter the department of the employee: sales
// Enter the age of employee: 20
// Enter the designation of the employee: assistant
// Enter the salary of the employee: 18000

// Details for Employee 1
// Name: Rohan
// Age: 20
// Employee ID: 001
// Department: purchase
// Designation: manager
// Salary: 15000.0

// Details for Employee 2
// Name: Davin
// Age: 21
// Employee ID: 002
// Department: purchase
// Designation: manager
// Salary: 20000.0

// Details for Employee 3
// Name: Yash
// Age: 22
// Employee ID: 003
// Department: sales
// Designation: manager
// Salary: 50000.0

// Details for Employee 4
// Name: Kshitij
// Age: 20
// Employee ID: 004
// Department: sales
// Designation: assistant
// Salary: 18000.0

// Details for Employee 5
// Name: Surya
// Age: 20
// Employee ID: 005
// Department: sales
// Designation: assistant
// Salary: 18000.0

// Total Salary of Sales Department is 86000.0
// Details of highest paid manager of purchase department is
// Name: Davin
// Age: 21
// Employee ID: 002
// Department: purchase
// Designation: manager
// Salary: 20000.0
