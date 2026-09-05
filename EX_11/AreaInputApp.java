import java.util.Scanner;

abstract class Shape {
    abstract void calculateArea();
}

class Circle extends Shape {
    double r;
    Circle(double r) { this.r = r; }
    void calculateArea() { System.out.println("Area of Circle: " + (Math.PI * r * r)); }
}

class Rectangle extends Shape {
    double l, w;
    Rectangle(double l, double w) { this.l = l; this.w = w; }
    void calculateArea() { System.out.println("Area of Rectangle: " + (l * w)); }
}

class Triangle extends Shape {
    double b, h;
    Triangle(double b, double h) { this.b = b; this.h = h; }
    void calculateArea() { System.out.println("Area of Triangle: " + (0.5 * b * h)); }
}

public class AreaInputApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 1; // Loop control variable

        while (cont == 1) {
            System.out.println("\nArea Calculator");
            System.out.println("Choose Shape: 1.Circle 2.Rectangle 3.Triangle");
            int choice = sc.nextInt();

            Shape s = null; 
            switch(choice) {
                case 1:
                    System.out.print("Enter Radius: ");
                    s = new Circle(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter Length & Width: ");
                    s = new Rectangle(sc.nextDouble(), sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Enter Base & Height: ");
                    s = new Triangle(sc.nextDouble(), sc.nextDouble());
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

            // Execute only if a valid shape was created
            if (s != null) {
                s.calculateArea();
            }

            System.out.print("\nPress 1 to continue, any other number to terminate: ");
            cont = sc.nextInt();
        }

        System.out.println("Game Over!");
            }
}