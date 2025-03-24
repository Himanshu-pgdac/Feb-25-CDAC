/* Q5. BMI Calculator 
Design a Java program to implement a BMI (Body Mass Index) calculator. The program should 
consist of a class named BMICalculator with the following specifications: 
Class: BMICalculator 
Fields 
●  height (double): To store the height of the person in meters. 
●  weight (double): To store the weight of the person in kilograms. 
Constructors 
●  A parameterized constructor to initialize the height and weight fields. 
Methods 
●  Getter and Setter methods for both height and weight. 
●  double calculateBMI(): This method calculates and returns the BMI using the formula: 
BMI=weight(height×height)\text{BMI} = \frac{\text{weight}}{(\text{height} \times 
\text{height})}BMI=(height×height)weight 
Main Program : Write a separate class containing the main() method to 
1.  Create an object of the BMICalculator class. 
2.  Prompt the user to enter their height and weight. 
3.  Use setter methods to assign these values to the object. 
4.  Call the calculateBMI() method to compute the BMI. 
5.  Print the calculated BMI to the console.  */

// Code

// BMICalculator.java
class BMICalculator {
    private double height; 
    private double weight; 

    public BMICalculator(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double calculateBMI() {
        return weight / (height * height);
    }

    public String categorizeBMI(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }
}

import java.util.Scanner;

public class BMICalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your height in meters: ");
        double height = scanner.nextDouble();
        System.out.print("Enter your weight in kilograms: ");
        double weight = scanner.nextDouble();

        BMICalculator bmiCalculator = new BMICalculator(height, weight);

        double bmi = bmiCalculator.calculateBMI();

        String category = bmiCalculator.categorizeBMI(bmi);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("Category: " + category);

        scanner.close();
    }
}
