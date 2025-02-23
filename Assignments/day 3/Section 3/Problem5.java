// 5. Write a program to print the Fibonacci sequence up to the number 21. 

class FibonacciSequence {
    public static void main(String[] args) {
        int a = 0, b = 1;
        System.out.print("Fibonacci sequence up to 21: " + a + " " + b + " ");
        
        int next = a + b;
        while (next <= 21) {
            System.out.print(next + " ");
            a = b;
            b = next;
            next = a + b;
        }
    }
}


// Output - Fibonacci sequence up to 21: 0 1 1 2 3 5 8 13 21