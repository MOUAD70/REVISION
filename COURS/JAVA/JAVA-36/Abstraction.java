public class Abstraction {
    public static void main(String[] args) {
        Circle circle = new Circle(5);         // radius = 5
        Triangle triangle = new Triangle(4, 3); // base = 4, height = 3
        Rectangle rectangle = new Rectangle(6, 2); // length = 6, width = 2

        circle.display();
        System.out.println("Area of Circle: " + circle.area());

        triangle.display();
        System.out.println("Area of Triangle: " + triangle.area());

        rectangle.display();
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

// Abstract class with abstract method area() and concrete method display()
abstract class Shape {
    abstract double area(); // ABSTRACT method to be implemented by subclasses

    void display() {
        System.out.println("This is a shape."); // CONCRETE method
    }
}

// Circle class with radius and area calculation
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Triangle class with base and height
class Triangle extends Shape {
    double base, height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double area() {
        return 0.5 * base * height;
    }
}

// Rectangle class with length and width
class Rectangle extends Shape {
    double length, width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double area() {
        return length * width;
    }
}
