package BTVN.Bai1;

import java.util.Scanner;

public class Square extends Rectangle {
    private Scanner sc = new Scanner(System.in);

    public Square() {

    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(color, filled, side, side);
    }

    public double getSide() {
        return super.length > super.width ? super.width : super.length;
    }

    public void setSide(double side) {
        new Square(side);
    }

    public void setWidth(double side) {
        super.setWidth(side);
    }

    public void setLength(double side) {
        super.setLength(side);
    }

    public void draw() {
        for(int i = 0; i < super.width; i++) {
            for(int j = 0; j < super.length; j++) {
                if(!filled && i > 0 && i < super.width - 1 && j > 0 && j < super.length - 1) {
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
        return getSide() * getSide();
    }

    @Override
    public double getPerimeter() {
        return 4 * getSide();
    }

    @Override
    public String toString() {
        return String.format("%-15s %-10s %-10f %-10f %-10f %-10f %-10f", color, filled, getSide(), getArea(), getPerimeter());
    }
}
