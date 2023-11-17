// Write a java program to define a base class termed person which stores information about a person such as name, age, gender.
// Derive two new classes employee and student and extend the base class methods in derived class to read and display the details
// that are specific to student and employee. Display the details of at lest 5 students and 5 employees.

import java.util.Scanner;

class Person {
    int age;
    String name, gender;
    public void read() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name, age & gender of person:");
        name = sc.nextLine();
        age = sc.nextInt();
        gender = sc.nextLine();
    }
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}

class Student extends Person {
    int sem;
    String usn;
    float cgpa;
    public void read1() {
        Scanner sc = new Scanner(System.in);
        read();
        System.out.println("Enter USN, Semester and CGPA: ");
        usn = sc.nextLine();
        sem = sc.nextInt();
        cgpa = sc.nextFloat();
    }
    public void display1() {
        display();
        System.out.println("USN: " + usn);
        System.out.println("Semester: " + sem);
        System.out.println("CGPA: " + cgpa);
    }
}

public class inher {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        for (int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.println("Enter details for student " + (i + 1) + ":");
            students[i].read1();
        }
        System.out.println("Details of the students:");
        for (int i = 0; i < students.length; i++) {
            students[i].display1();
        }
    }
}
