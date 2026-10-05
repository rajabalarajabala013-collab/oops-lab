import java.util.Scanner;

abstract class Shape {

    int x;
    int y;

    abstract void printArea();
}

class Rectangle extends Shape {

    Rectangle(int length, int breadth) {
        x = length;
        y = breadth;
    }

    void printArea() {
        System.out.println("Area of Rectangle = " + (x * y));
    }
}

class Triangle extends Shape {

    Triangle(int base, int height) {
        x = base;
        y = height;
    }

    void printArea() {
        System.out.println("Area of Triangle = " + (0.5 * x * y));
    }
}

class Circle extends Shape {

    Circle(int radius) {
        x = radius;
    }

    void printArea() {
        System.out.println("Area of Circle = " + (3.14 * x * x));
    }
}

public class ShapeArea {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AREA OF DIFFERENT SHAPES =====");

        System.out.print("\nEnter length of rectangle: ");
        int length = sc.nextInt();

        System.out.print("Enter breadth of rectangle: ");
        int breadth = sc.nextInt();

        Rectangle rectangle = new Rectangle(length, breadth);
        rectangle.printArea();

        System.out.print("\nEnter base of triangle: ");
        int base = sc.nextInt();

        System.out.print("Enter height of triangle: ");
        int height = sc.nextInt();

        Triangle triangle = new Triangle(base, height);
        triangle.printArea();

        System.out.print("\nEnter radius of circle: ");
        int radius = sc.nextInt();

        Circle circle = new Circle(radius);
        circle.printArea();

        sc.close();
    }
}++++++++++++++