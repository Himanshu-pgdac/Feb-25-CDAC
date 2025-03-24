/* Q2. Student Marks and Grade Calculation with Exception Handling 
Design a Java program to calculate the total marks, average, and grade of a student, with 
proper exception handling for invalid inputs. Implement a class named Student with the 
following specifications: 
Class: Student 
Instance Variables 
●  name (String): Name of the student 
●  rollNo (int): Roll number of the student 
●  marks (double array of size 5): Marks obtained in 5 subjects 
●  average (double): Average marks 
●  grade (char): Grade based on average 
Constructor 
●  A parameterized constructor to initialize the name, rollNo, and marks. 
●  Throw an IllegalArgumentException if any mark is negative or greater than 100. 
Methods 
●  void calculateAverage(): Computes the average of marks. 
●  void calculateGrade(): Assigns grade based on the average as per the following 
criteria: 
○  A: average ≥ 90 
○  B: 80 ≤ average < 90 
○  C: 70 ≤ average < 80 
○  D: 60 ≤ average < 70 
○  F: average < 60 
●  void displayStudentInfo(): Displays the student’s name, roll number, marks, average, 
and grade. 
Main Program 
In the main() method: 
1.  Prompt the user to input student details and marks for 5 subjects. 
2.  Use a try-catch block to handle the following: 
○  InputMismatchException for non-numeric input 
○  IllegalArgumentException for invalid mark entries (e.g., < 0 or > 100) 
3.  Create a Student object, calculate average and grade, and display the full information. */

// Code


class Student {
    private String name;
    private int rollNo;
    private double[] marks;
    private double average;
    private char grade;

    public Student(String name, int rollNo, double[] marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = new double[5];

        for (int i = 0; i < 5; i++) {
            if (marks[i] < 0 || marks[i] > 100) {
                throw new IllegalArgumentException("Marks must be between 0 and 100.");
            }
            this.marks[i] = marks[i];
        }
    }

    public void calculateAverage() {
        double total = 0;
        for (double mark : marks) {
            total += mark;
        }
        average = total / marks.length;
    }

    public void calculateGrade() {
        if (average >= 90) {
            grade = 'A';
        } else if (average >= 80) {
            grade = 'B';
        } else if (average >= 70) {
            grade = 'C';
        } else if (average >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
    }

    public void displayStudentInfo() {
        System.out.println("\n--- Student Report ---");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNo);
        System.out.print("Marks: ");
        for (double mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println("\nAverage Marks: " + average);
        System.out.println("Grade: " + grade);
    }
}


import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Student Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Roll Number: ");
            int rollNo = scanner.nextInt();

            double[] marks = new double[5];
            System.out.println("Enter marks for 5 subjects (out of 100):");
            for (int i = 0; i < 5; i++) {
                System.out.print("Subject " + (i + 1) + ": ");
                marks[i] = scanner.nextDouble();
            }

            Student student = new Student(name, rollNo, marks);

            student.calculateAverage();
            student.calculateGrade();
            student.displayStudentInfo();
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid numeric values for roll number and marks.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            scanner.close(); 
        }
    }
}
