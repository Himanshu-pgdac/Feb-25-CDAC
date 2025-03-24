/* Q2. Student Marks and Average 
Create a class Student with the following members: 
●  Name of the student 
●  Marks in three subjects 
●  A method to assign initial values 
●  A method to compute the total and average marks 
●  A method to display the student’s name and total marks 
Write a main() method to demonstrate the functionality of the class. */

// Code


class Student {
    private String name;
    private int marks1, marks2, marks3;

    public void setDetails(String name, int marks1, int marks2, int marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    public int getTotalMarks() {
        return marks1 + marks2 + marks3;
    }

    public double getAverageMarks() {
        return getTotalMarks() / 3.0;
    }

    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + getTotalMarks());
        System.out.println("Average Marks: " + getAverageMarks());
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Student student1 = new Student();
        
        student1.setDetails("Alice", 85, 90, 88);

        student1.displayDetails();
    }
}

/*Output
 Student Name: Alice
Total Marks: 263
Average Marks: 87.66666666666667
 */