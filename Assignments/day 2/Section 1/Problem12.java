/*

public class Main { 
    public static void main(String[] args) { 
        while (true) { 
            System.out.println("Infinite Loop"); 
        } 
    } 
}

*/


/* Error - runtime issue due to an infinite loop.


// correct code 



public class Main { 
    public static void main(String[] args) { 
        int count = 0;
        while (count < 5) {
            System.out.println("Iteration: " + count);
            count++;
}
} 
}


/* How can you avoid infinite loops?  - Just give any condition or break statement. */