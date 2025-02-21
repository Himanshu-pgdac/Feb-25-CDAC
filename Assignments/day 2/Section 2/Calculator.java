/* Question 3: Calculator  
Write a program that acts as a simple calculator. It should accept two numbers and an operator 
(+, -, *, /) as input. Use a switch statement to perform the appropriate operation. Use nested if
else to check if division by zero is attempted and display an error message */





import java.util.Scanner;

class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result;
        
        
        switch (operator)
 
        {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            
            case '/':
                if (num2 == 0) 
                {
                    System.out.println("Error: Division by zero is not allowed.");
                } 
                else 
                {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator. Please enter +, -, *, or /.");
        }
        
        scanner.close();
}
}
