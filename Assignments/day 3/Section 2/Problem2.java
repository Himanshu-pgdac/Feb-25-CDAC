public class DecrementingLoop { 
    public static void main(String[] args) { 
        int total = 0; 
        for (int i = 5; i > 0; i--) { 
            total += i; 
            if (i == 3) continue; 
            total -= 1; 
        } 
        System.out.println(total); 
    } 
} 

// Guess the output of this loop.




// output - 11 




/* Dry Run - 


Initialization: 

total = 0
Loop starts with i = 5:
total += 5 - total = 5
total -= 1 - total = 4

Next iteration (i = 4): 
total += 4 - total = 8
total -= 1 - total = 7

Next iteration (i = 3):
total += 3 - total = 10
i == 3, continue; is executed (skipping total -= 1)

Next iteration (i = 2):
total += 2 - total = 12
total -= 1 - total = 11

Next iteration (i = 1):
total += 1 - total = 12
total -= 1 - total = 11
Loop ends, print total:

Output: 11 */








