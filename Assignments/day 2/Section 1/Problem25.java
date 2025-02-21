/*

public class Switch { 
    public static void main(String[] args) { 
        double score = 85.0; 
        switch(score) { 
            case 100: 
                System.out.println("Perfect score!"); 
                break; 
            case 85: 
                System.out.println("Great job!"); 
                break; 
            default: 
                System.out.println("Keep trying!"); 
        } 
    } 
}

*/




/* Error - Switch.java:4: error: incompatible types: possible lossy conversion from double to int
        switch(score) {
              ^
1 error  */





// Correct code 


public class SwitchExample { 
    public static void main(String[] args) { 
        double score = 85.0; 

        if (score == 100) {
            System.out.println("Perfect score!");
        } else if (score == 85.0) {
            System.out.println("Great job!");
        } else {
            System.out.println("Keep trying!");
        }
    } 
}
