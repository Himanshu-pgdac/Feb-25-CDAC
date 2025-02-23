// 4. Write a program to reverse the digits of the number 1234. The output should be 4321. 

class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234, reversed = 0;
        while (number != 0) {
            int digit = number % 10; // Extract the last digit
            reversed = reversed * 10 + digit; // Build the reversed number
            number = number / 10; // Remove the last digit from the original number
        }
        System.out.println("Reversed number: " + reversed);
    }
}



// Output - Reversed number: 4321

