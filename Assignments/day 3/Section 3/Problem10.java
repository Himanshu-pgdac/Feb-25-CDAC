// 10. Write a program to print all even numbers between 1 and 50. 


class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Even numbers between 1 and 50:");
        
        for (int i = 2; i <= 50; i=i+2) { // Start from 2, increment by 2
            System.out.print(i + " "); // Print even number
        }
    }
}




/* Output - Even numbers between 1 and 50:
2 4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 */
