import java.util.Scanner;

// Interface defining methods for calculating area and perimeter
interface Shape {
    double area();
    double perimeter();
}

// Circle class implementing Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }
}

// Rectangle class implementing Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }
}

// Main class for menu-driven program
public class c3prog6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
            System.out.println("Aslam Ismail\n23MCA022\n06-04-24");
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Calculate Area and Perimeter of Circle");
            System.out.println("2. Calculate Area and Perimeter of Rectangle");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter radius of circle: ");
                    double radius = scanner.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("Area of circle: " + circle.area());
                    System.out.println("Perimeter of circle: " + circle.perimeter());
                    break;
                case 2:
                    System.out.print("Enter length of rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter width of rectangle: ");
                    double width = scanner.nextDouble();
                    Rectangle rectangle = new Rectangle(length, width);
                    System.out.println("Area of rectangle: " + rectangle.area());
                    System.out.println("Perimeter of rectangle: " + rectangle.perimeter());
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 3);
        
        scanner.close();
    }
}

