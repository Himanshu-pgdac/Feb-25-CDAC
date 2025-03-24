/* Q1. Electricity Bill Calculation with Exception Handling 
Design a Java program to calculate the electricity bill for a customer, including exception 
handling for invalid input values. Implement a class named ElectricityBill with the following 
specifications: 
Class: ElectricityBill 
Instance Variables 
●  customerName (String): Name of the customer 
●  unitsConsumed (double): Number of electricity units consumed 
●  billAmount (double): The calculated bill amount 
Constructor 
●  A parameterized constructor to initialize the customerName and unitsConsumed 
fields. 
●  Throw an IllegalArgumentException if unitsConsumed is negative. 
Method 
●  void calculateBillAmount(): This method calculates the electricity bill based on the 
following rules: 
○  First 100 units: Rs. 5 per unit 
○  Next 200 units (101–300): Rs. 7 per unit 
○  Above 300 units: Rs. 10 per unit 
Main Program 
In the main() method: 
1.  Prompt the user to enter the customer’s name and units consumed. 
2.  Use try-catch blocks to handle the following scenarios: 
○  Catch InputMismatchException if the user enters non-numeric data for units. 
○  Catch IllegalArgumentException if a negative value is entered for units. 
3.  If the input is valid, create an object of the ElectricityBill class, compute the bill using 
calculateBillAmount(), and print the customer’s name, units consumed, and the total 
bill amount.*/

// Code 

class ElectricityBill {
    private String customerName;
    private double unitsConsumed;
    private double billAmount;

    public ElectricityBill(String customerName, double unitsConsumed) {
        if (unitsConsumed < 0) {
            throw new IllegalArgumentException("Units consumed cannot be negative.");
        }
        this.customerName = customerName;
        this.unitsConsumed = unitsConsumed;
        this.billAmount = 0;
    }

    // Method to calculate the bill amount
    public void calculateBillAmount() {
        if (unitsConsumed <= 100) {
            billAmount = unitsConsumed * 5;
        } else if (unitsConsumed <= 300) {
            billAmount = (100 * 5) + ((unitsConsumed - 100) * 7);
        } else {
            billAmount = (100 * 5) + (200 * 7) + ((unitsConsumed - 300) * 10);
        }
    }

    public void displayBill() {
        System.out.println("\n Electricity Bill ");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Units Consumed: " + unitsConsumed);
        System.out.println("Total Bill Amount: Rs. " + billAmount);
    }
}

import java.util.InputMismatchException;
import java.util.Scanner;

public class ElectricityBillDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter Customer Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter Units Consumed: ");
            double units = scanner.nextDouble();

            ElectricityBill bill = new ElectricityBill(name, units);

            bill.calculateBillAmount();
            bill.displayBill();
        } 
        catch (InputMismatchException e) {
            System.out.println("Error: Please enter a valid numeric value for units consumed.");
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        finally {
            scanner.close(); 
        }
    }
}

/* Output 
Enter Customer Name: John Doe
Enter Units Consumed: 250

 Electricity Bill 
Customer Name: John Doe
Units Consumed: 250.0
Total Bill Amount: Rs. 1700.0
*/
