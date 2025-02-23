/* 23. Write a program to print the following pattern: 
11111 
22222 
33333 
44444 
55555 */



// Code 


class Rows {
    public static void main(String[] args) {
        int rows = 5; 
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(i); 
            }
            System.out.println(); 
        }
    }
}