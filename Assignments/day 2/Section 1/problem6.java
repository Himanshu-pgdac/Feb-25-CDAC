/*

public class Main { 
    public static void main(String[] args) { 
        int x = y + 10; 
        System.out.println(x); 
    } 
} 

*/


/* Error : Main.java:3: error: cannot find symbol
        int x = y + 10;
                  ^
  symbol:   variable y
  location: class Main
1 error
*/


// correct code 

public class Main { 
    public static void main(String[] args) { 
        int y = 5;
        int x = y + 10; 
        System.out.println(x); 
    } 
}


/* Why must variables be declared? -  variables need to be declared so that the program knows what kind of data it will hold and where to store it in memory */