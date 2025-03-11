/* Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  */ 

// Code 


import java.util.Scanner;

class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        System.out.println("Number is within the range: " + (num >= 20 && num <= 50));
        scanner.close();
    }
}

/* Output 
Enter a number: 35
Number is within the range: true  */

