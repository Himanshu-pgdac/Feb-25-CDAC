/*Q3. Box Area and Volume 
Write a class Box with three member variables: height, width, and breadth. Include appropriate 
constructors to initialize these variables. Also, implement two methods: 
●  getVolume() to return the volume of the box 
●  getArea() to return the surface area of the box 
Create two instances of the Box class and display their volumes and surface areas. */

// Code

class Box {
    private double height, width, breadth;

    public Box(double height, double width, double breadth) {
        this.height = height;
        this.width = width;
        this.breadth = breadth;
    }

    public double getVolume() {
        return height * width * breadth;
    }

    public double getArea() {
        return 2 * (height * width + width * breadth + height * breadth);
    }
}

public class BoxDemo {
    public static void main(String[] args) {
        Box box1 = new Box(10, 12, 15);
        Box box2 = new Box(8, 10, 12);

        System.out.println("Box 1 - Volume: " + box1.getVolume() + ", Surface Area: " + box1.getArea());
        System.out.println("Box 2 - Volume: " + box2.getVolume() + ", Surface Area: " + box2.getArea());
    }
}


/* Output - 
Box 1 - Volume: 1800.0, Surface Area: 900.0
Box 2 - Volume: 960.0, Surface Area: 592.0
  
 */