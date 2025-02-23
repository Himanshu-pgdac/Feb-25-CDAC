public class ConditionalLoopOutput { 
    public static void main(String[] args) { 
        int num = 1; 
        for (int i = 1; i <= 4; i++) { 
            if (i % 2 == 0) { 
                num += i; 
            } else { 
                num -= i; 
            } 
        } 
        System.out.println(num); 
    } 
} 

// Guess the output of this loop

// Output - 3




/* Dry Run - 

Initialization: num = 1

First Iteration (i = 1):
i is (1 % 2 != 0), so num -= 1 → num = 1 - 1 = 0

Second Iteration (i = 2):
i is (2 % 2 == 0), so num += 2 → num = 0 + 2 = 2

Third Iteration (i = 3):
i is (3 % 2 != 0), so num -= 3 → num = 2 - 3 = -1

Fourth Iteration (i = 4):
i is (4 % 2 == 0), so num += 4 → num = -1 + 4 = 3


*/
