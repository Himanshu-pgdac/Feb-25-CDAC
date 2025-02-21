/*
public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
 
 
                break; 
            case 5: 
                System.out.println("This is another case 5"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
} */ 





/* Error - Main.java:9: error: duplicate case label
            case 5: 
                 ^
1 error */




// correct code 


public class Switch { 
    public static void main(String[] args) { 
        int number = 5; 
        switch(number) { 
            case 5: 
                System.out.println("Number is 5"); 
                break; 
            case 10: 
                System.out.println("Number is 10"); 
                break; 
            default: 
                System.out.println("This is the default case"); 
        } 
    } 
}

