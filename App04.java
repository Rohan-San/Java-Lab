// The commented part can be ignored. Learn it only IF YOU WANT to display the details separately and not simultaneously while taking input

import java.util.Scanner;
// import java.util.ArrayList;
// import java.util.List;

public class App04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // List<Employee> employees = new ArrayList<>();
        // List<Student> students = new ArrayList<>();

        // Employee details
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Employee " + i);
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Age: ");
            int age = scan.nextInt();
            scan.nextLine(); // Consume the newline character
            System.out.print("Gender: ");
            String gender = scan.nextLine();
            System.out.print("Employee ID: ");
            String empId = scan.nextLine();
            Employee employee = new Employee(name, age, gender, empId);
            // employees.add(employee);     // Remove the line after this if you're using this line
            employee.displayDetails();
            System.out.println("------------------------");
        }

        // Student details
        for (int i = 1; i <= 5; i++) {
            System.out.println("Enter details for Student " + i);
            System.out.print("Name: ");
            String name = scan.nextLine();
            System.out.print("Age: ");
            int age = scan.nextInt();
            scan.nextLine(); // Consume the newline character
            System.out.print("Gender: ");
            String gender = scan.nextLine();
            System.out.print("Student ID: ");
            String studId = scan.nextLine();
            Student student = new Student(name, age, gender, studId);
            // students.add(student);       // Remove the line after this if you're using this line
            student.displayDetails();
            System.out.println("------------------------");
        }
        scan.close();

        // System.out.println("Employee Details:");
        // for (Employee employee : employees) {
        //     employee.displayDetails();
        //     System.out.println("------------------------");
        // }

        // System.out.println("Student Details:");
        // for (Student student : students) {
        //     student.displayDetails();
        //     System.out.println("------------------------");
        // }
    }
}

// Base class
class Person {
    String name;
    int age;
    String gender;

    // Constructor
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Display details method
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

// Derived class Employee
class Employee extends Person {
    String empId;

    // Constructor
    Employee(String name, int age, String gender, String empId) {
        super(name, age, gender); // Call the constructor of the base class
        this.empId = empId;
    }

    // Display details method, overriding base class method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the method of the base class
        System.out.println("Employee ID: " + empId);
    }
}

// Derived class Student
class Student extends Person {
    String studId;

    // Constructor
    Student(String name, int age, String gender, String studId) {
        super(name, age, gender); // Call the constructor of the base class
        this.studId = studId;
    }

    // Display details method, overriding base class method
    @Override
    void displayDetails() {
        super.displayDetails(); // Call the method of the base class
        System.out.println("Student ID: " + studId);
    }
}

// Output:
// Enter details for Employee 1
// Name: Rohit
// Age: 20
// Gender: M
// Employee ID: E01
// Name: Rohit
// Age: 20
// Gender: M
// Employee ID: E01
// ------------------------
// Enter details for Employee 2
// Name: Rahul
// Age: 22
// Gender: M
// Employee ID: E02
// Name: Rahul
// Age: 22
// Gender: M
// Employee ID: E02
// ------------------------
// Enter details for Employee 3
// Name: Rohita
// Age: 21
// Gender: F
// Employee ID: E03
// Name: Rohita
// Age: 21
// Gender: F
// Employee ID: E03
// ------------------------
// Enter details for Employee 4
// Name: Rishita
// Age: 19 
// Gender: F
// Employee ID: E04
// Name: Rishita
// Age: 19
// Gender: F
// Employee ID: E04
// ------------------------
// Enter details for Employee 5
// Name: Ramesh
// Age: 23
// Gender: M
// Employee ID: E05
// Name: Ramesh
// Age: 23
// Gender: M
// Employee ID: E05
// ------------------------
// Enter details for Student 1
// Name: Sahil
// Age: 18
// Gender: M
// Student ID: S01
// Name: Sahil
// Age: 18
// Gender: M
// Student ID: S01
// ------------------------
// Enter details for Student 2
// Name: Sanjana
// Age: 17
// Gender: F
// Student ID: S02
// Name: Sanjana
// Age: 17
// Gender: F
// Student ID: S02
// ------------------------
// Enter details for Student 3
// Name: Sanjeev
// Age: 18
// Gender: M
// Student ID: S03
// Name: Sanjeev
// Age: 18
// Gender: M
// Student ID: S03
// ------------------------
// Enter details for Student 4
// Name: Samyukta
// Age: 18
// Gender: F
// Student ID: S04
// Name: Samyukta
// Age: 18
// Gender: F
// Student ID: S04
// ------------------------
// Enter details for Student 5
// Name: Sameer
// Age: 17
// Gender: M
// Student ID: S05
// Name: Sameer
// Age: 17
// Gender: M
// Student ID: S05
// ------------------------
