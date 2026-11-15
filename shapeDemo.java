import java.util.Scanner;
class Shape {
    double calculateArea() {
        return 0;
    }
void display() {
        System.out.println("Area of shape: " + calculateArea());
    }
}
class Circle extends Shape {
    private double radius;
  Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    void display() {
        System.out.printf("Area of Circle: %.2f%n", calculateArea());
    }
}
class Rectangle extends Shape {
    private double length;
    private double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    @Override
    void display() {
        System.out.printf("Area of Rectangle: %.2f%n", calculateArea());
    }
}
class Triangle extends Shape {
    private double base;
    private double height;

    Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5 * base * height;
    }

    @Override
    void display() {
        System.out.printf("Area of Triangle: %.2f%n", calculateArea());
    }
}

public class shapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius of circle: ");
        double radius = sc.nextDouble();
        System.out.print("Enter length of rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of rectangle: ");
        double width = sc.nextDouble();
        System.out.print("Enter base of triangle: ");
        double base = sc.nextDouble();
         System.out.print("Enter height of triangle: ");
        double height = sc.nextDouble();

        Shape s1 = new Circle(radius);
        Shape s2 = new Rectangle(length, width);
        Shape s3 = new Triangle(base, height);

        s1.display();
        s2.display();
        s3.display();
        sc.close();
    }
}

