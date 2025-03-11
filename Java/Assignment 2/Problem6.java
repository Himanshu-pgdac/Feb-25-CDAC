/* Q6:  Write a program to find the  largest of three numbers  using only the  ternary operator 
(  ? :  )  . */


import java.util.Scanner;

class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();

        int largest = (num1 > num2) 
                        ? (num1 > num3 ? num1 : num3) 
                        : (num2 > num3 ? num2 : num3);

        System.out.println("The largest number is: " + largest);

        scanner.close();
    }
}


/* 	Output 
Enter first number: 5
Enter second number: 7
Enter third number: 4
The largest number is: 7    */