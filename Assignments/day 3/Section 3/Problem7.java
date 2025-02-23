// Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6). 


class SumOfDigits {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;
        
        while (number > 0) {
            sum += number % 10;
            number /= 10; 
        }
        
        System.out.println("Sum of digits: " + sum);
    }
}



// Output - Sum of digits: 30