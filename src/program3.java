// Write a java program to define a base class termed person which stores information about a person such as name, age, gender. Derive two new classes employee and student and extend the base class methods in derived class to read and display the details that are specific to student and employee. Display the details of at lest 5 students and 5 employees.

import java.util.Scanner;

class Person {
    String name;
    int age;
    String gender;

    public void read() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name: ");
        name = input.next();
        System.out.println("Enter age:");
        age = input.nextInt();
        System.out.println("Enter gender:");
        gender = input.next();
    }

    public void display() {
        System.out.printf("Name: %s\n", name);
        System.out.printf("Age: %d\n", age);
        System.out.printf("Gender: %s\n", gender);
    }
}

class Employee extends Person {
    String designation;
    String empID;
    String department;
    int salary;

    public void read1() {
        read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter emp id: ");
        empID = input.next();
        System.out.println("Enter salary:");
        salary = input.nextInt();
        System.out.println("Enter designation:");
        input.nextLine(); // Consume the newline character
        designation = input.nextLine();
        System.out.println("Enter department:");
        department = input.nextLine();
    }

    public String getDesignation() {
        return designation;
    }

    public int getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    public void display1() {
        display();
        System.out.printf("Employee ID: %s\n", empID);
        System.out.printf("Designation: %s\n", designation);
        System.out.printf("Department: %s\n", department);
        System.out.printf("Salary: %d\n", salary);
    }
}

class Student extends Person {
    String USN;
    int semester;
    float cgpa;

    public void read1() {
        read();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter USN: ");
        USN = input.next();
        System.out.println("Enter semester:");
        semester = input.nextInt();
        System.out.println("Enter CGPA:");
        cgpa = input.nextFloat();
    }

    public void display1() {
        display();
        System.out.printf("USN: %s\n", USN);
        System.out.printf("Semester: %d\n", semester);
        System.out.printf("CGPA: %f\n", cgpa);
    }
}

public class prog3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of employees:");
        int n = sc.nextInt();
        Employee[] employees = new Employee[n];

        for (int i = 0; i < n; i++) {
            employees[i] = new Employee();
            System.out.println("~~~~~");
            System.out.println("Enter employee " + (i + 1) + " details:");
            employees[i].read1();
            System.out.println("~~~~~");
        }

        System.out.println("Details of all employees:\n");
        for (int i = 0; i < n; i++) {
            System.out.println("~~~~~");
            employees[i].display1();
            System.out.println("~~~~~");
        }

        System.out.println("Enter details to find the highest paid employee:");
        System.out.println("Enter the department:");
        String depart = sc.next();
        System.out.println("Enter the designation:");
        String designation = sc.next();

        int max = 0;
        int ind = 0;
        for (int i = 0; i < n; i++) {
            if (employees[i].getDepartment().equals(depart) &&
                    employees[i].getDesignation().equals(designation) &&
                    employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                ind = i;
            }
        }

        System.out.printf("Employee of designation %s and department %s having the highest salary is:\n", designation, depart);
        employees[ind].display1();

        System.out.println("Enter the details to find the highest paid manager:");
        max = 0;
        ind = 0;
        for (int i = 0; i < n; i++) {
            if (employees[i].getDesignation().equals("manager") &&
                    employees[i].getSalary() > max) {
                max = employees[i].getSalary();
                ind = i;
            }
        }

        System.out.printf("Employee of designation manager having the highest salary is:\n");
        employees[ind].display1();

        System.out.println("Enter the number of students:");
        int x = sc.nextInt();
        Student[] students = new Student[x];

        for (int i = 0; i < x; i++) {
            System.out.println("~~~~~");
            System.out.println("Enter student " + (i + 1) + " details:");
            students[i] = new Student();
            students[i].read1();
            System.out.println("~~~~~");
        }

        System.out.println("Displaying details of all students:\n");
        for (int i = 0; i < x; i++) {
            System.out.println("~~~~~");
            students[i].display1();
            System.out.println("~~~~~");
        }

        sc.close();
    }
}
