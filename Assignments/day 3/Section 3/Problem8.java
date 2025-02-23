// 8. Write a program to count down from 10 to 0, printing each number. 



class Countdown {
    public static void main(String[] args) {
        int number = 10; // Start countdown from 10
        
        while (number >= 0) { // Loop until 0
            System.out.println(number);
            number--; // Decrease number by 1
        }
    }
}




/* Output -  
10
9
8
7
6
5
4
3
2
1
0  */