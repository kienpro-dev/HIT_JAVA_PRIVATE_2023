package BTVN.Bai1;

import java.util.Scanner;

public class Rectangle extends Shape {
    private Scanner sc = new Scanner(System.in);

    protected double width;
    protected double length;

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void draw() {
        for(int i = 0; i < width; i++) {
            for(int j = 0; j < length; j++) {
                if(!filled && i > 0 && i < width - 1 && j > 0 && j < length - 1) {
                    System.out.print("\t ");
                    continue;
                }
                System.out.print("\t*");
            }
            System.out.println();
        }
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Input width: ");
        width = sc.nextDouble();
        System.out.print("Input length: ");
        length = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10f %-10f %-10f %-10f", width, length, getArea(), getPerimeter());
    }
}
