/* 17. Write a program to print the following pattern: 

***** 
 **** 
  *** 
   ** 
    *  */


// Code 


class Pyramid3 {
    public static void main(String[] args) {
        int rows = 5; 
        for (int i = rows; i >= 1; i--) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
