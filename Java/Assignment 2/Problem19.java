/*  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator. */ 

// Code 

import java.util.Scanner;

class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        String result = (ch >= 'A' && ch <= 'Z') 
                            ? "Uppercase Letter" 
                            : (ch >= 'a' && ch <= 'z') 
                                ? "Lowercase Letter" 
                                : "Not a Letter";

        System.out.println("The character is: " + result);

        scanner.close();
    }
}

/* Output 
Enter a character: t
The character is: Lowercase Letter */