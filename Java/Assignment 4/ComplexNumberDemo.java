/* Q4. Complex Number Operations 
Create a class to represent complex numbers. Include the following constructors: 
1.  A default constructor that sets both real and imaginary parts to 0 
2.  A constructor that initializes the real part only 
3.  A constructor that initializes both real and imaginary parts 
Also, write member functions to: 
●  Add two complex numbers 
●  Multiply two complex numbers 
In the main() method: 
●  Create two complex numbers: 3 + 2i and 4 - 2i 
●  Display their sum and product */

// Code

class ComplexNumber {
    private double real;
    private double imaginary;

    public ComplexNumber() {
        this.real = 0;
        this.imaginary = 0;
    }

    public ComplexNumber(double real) {
        this.real = real;
        this.imaginary = 0;
    }

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public ComplexNumber add(ComplexNumber other) {
        return new ComplexNumber(this.real + other.real, this.imaginary + other.imaginary);
    }

    public ComplexNumber multiply(ComplexNumber other) {
        double newReal = (this.real * other.real) - (this.imaginary * other.imaginary);
        double newImaginary = (this.real * other.imaginary) + (this.imaginary * other.real);
        return new ComplexNumber(newReal, newImaginary);
    }

    public void display() {
        System.out.println(real + " + " + imaginary + "i");
    }
}

public class ComplexNumberDemo {
    public static void main(String[] args) {
        ComplexNumber c1 = new ComplexNumber(3, 2);
        ComplexNumber c2 = new ComplexNumber(4, -2);

        ComplexNumber sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();

        ComplexNumber product = c1.multiply(c2);
        System.out.print("Product: ");
        product.display();
    }
}


/* Output
Sum: 7 + 0.0i
Product: 14 + 2.0i
 
 */