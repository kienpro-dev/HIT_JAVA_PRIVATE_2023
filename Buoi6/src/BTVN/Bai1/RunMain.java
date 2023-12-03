package BTVN.Bai1;

import java.util.Scanner;

public class RunMain {
    private static Scanner sc = new Scanner(System.in);

    private static Shape shape;

    public static void main(String[] args) {
        while (true) {
            System.out.println("1. Input Shape");
            System.out.println("2. Output Shape");
            System.out.println("3. Exit");
            System.out.print("Choose: ");
            int n = sc.nextInt();
            sc.nextLine();

            switch (n) {
                case 1:
                    inputShape();
                    break;
                case 2:
                    outputShape();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Not found");
                    break;
            }
        }
    }

    private static void outputShape() {
        System.out.printf("%-10s %-10s\n", "Area", "Perimeter");
        System.out.printf("%-10f %-10f\n", shape.getArea(), shape.getPerimeter());

        if (shape instanceof Rectangle) {
            Rectangle s = (Rectangle) shape;
            s.draw();
        } else if (shape instanceof Square) {
            Square s = (Square) shape;
            s.draw();
        }

    }

    public static void inputShape() {
        System.out.println("1. Circle");
        System.out.println("2. Square");
        System.out.println("3. Rectangle");
        System.out.print("Choose: ");
        int n = sc.nextInt();
        sc.nextLine();

        switch (n) {
            case 1:
                shape = new Circle();
                shape.input();
                break;
            case 2:
                System.out.print("Input color: ");
                String color = sc.nextLine();
                System.out.print("Is filled? (0/1): ");
                int f = sc.nextInt();
                sc.nextLine();
                System.out.print("Input side: ");
                double s = sc.nextDouble();
                sc.nextLine();
                shape = new Square(s, color, f == 1);
                break;
            case 3:
                shape = new Rectangle();
                shape.input();
                break;
            default:
                System.out.println("Not found");
                break;
        }
    }
}
