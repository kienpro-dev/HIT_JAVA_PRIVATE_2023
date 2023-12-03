package BTVN.Bai1;

import java.util.Scanner;

public abstract class Shape {
    private Scanner sc = new Scanner(System.in);

    protected String color;
    protected boolean filled;

    public Shape() {
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public void input() {
        System.out.print("Input color: ");
        color = sc.nextLine();
        System.out.print("Is filled? (0/1): ");
        int f = sc.nextInt();
        filled = f == 1;
        sc.nextLine();
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10s", color, filled);
    }
}
