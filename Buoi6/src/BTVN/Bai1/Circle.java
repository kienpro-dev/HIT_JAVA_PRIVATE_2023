package BTVN.Bai1;

import java.util.Scanner;

public class Circle extends Shape {
    private Scanner sc = new Scanner(System.in);

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void input() {
        super.input();
        System.out.print("Input radius: ");
        radius = sc.nextDouble();
        sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString() + String.format("%-10f %-10f %-10f", radius, getArea(), getPerimeter());
    }
}
