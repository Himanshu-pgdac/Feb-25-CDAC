/*   Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator.  */

// Code
 

import java.util.Scanner;

class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().toLowerCase().charAt(0);
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') 
                        ? "Vowel" 
                        : ((ch >= 'a' && ch <= 'z') ? "Consonant" : "Not a valid alphabet");

        System.out.println("The character is: " + result);

        scanner.close();
    }
}

/* Output
Enter a character: a
The character is: Vowel

Enter a character: t
The character is: Consonant  */