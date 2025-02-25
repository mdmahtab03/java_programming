import java.util.Scanner;

class AreaOfShaps {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int choice;
        
        System.out.println("Choose a shape to calculate area:");
        System.out.println("1. Rectangle");
        System.out.println("2. Triangle");
        System.out.println("3. Square");
        System.out.print("Enter your choice (1/2/3): ");
        choice = input.nextInt();
        
        if (choice == 1) {
            double length, width, area;
            System.out.print("Enter length of rectangle: ");
            length = input.nextDouble();
            System.out.print("Enter width of rectangle: ");
            width = input.nextDouble();
            area = length * width;
            System.out.println("Area of rectangle: " + area);
        } else if (choice == 2) {
            double base, height, area;
            System.out.print("Enter base of triangle: ");
            base = input.nextDouble();
            System.out.print("Enter height of triangle: ");
            height = input.nextDouble();
            area = 0.5 * base * height;
            System.out.println("Area of triangle: " + area);
        } else if (choice == 3) {
            double side, area;
            System.out.print("Enter side of square: ");
            side = input.nextDouble();
            area = side * side;
            System.out.println("Area of square: " + area);
        } else {
            System.out.println("Invalid choice");
        }
    }
}
