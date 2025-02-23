// 9. Write a program to find and print the largest digit in the number 4825. 


class LargestDigitFinder {
    public static void main(String[] args) {
        int number = 4825;
        int largest = 0;
        
        while (number > 0) {
            int digit = number % 10; // Extract last digit
            if (digit > largest) {
                largest = digit; // Update largest if current digit is greater
            }
            number /= 10; // Remove last digit
        }
        
        System.out.println("Largest digit: " + largest);
    }
}



// Output - Largest digit: 8