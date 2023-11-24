package BTVN.Bai1;

import java.util.Scanner;

public class Student extends Person{
    private int id;

    private String nameClass;

    private float gpa;

    public final float criteria = 2;

    public Student(){

    }

    public Student(String name, int age, Address address, int id, String nameClass, float gpa) {
        super(name, age, address);
        this.id = id;
        this.nameClass = nameClass;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameClass() {
        return nameClass;
    }

    public void setNameClass(String nameClass) {
        this.nameClass = nameClass;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }


    public boolean checkFall() {
        return getGpa() < criteria;
    }

    @Override
    public void input(){
        super.input();
        Scanner sc = new Scanner(System.in);
        System.out.print("Input id:");
        setId(sc.nextInt());
        sc.nextLine();
        if(!(getId() == 555)){
            System.out.print("Input nameClass of student:");
            setNameClass(sc.nextLine());
            System.out.print("Input gpa:");
            setGpa(sc.nextFloat());
        }
    }

    @Override
    public void output(){
        super.output();
        System.out.printf("%20d%20s%20f%20s%n", getId(), getNameClass(), getGpa(), checkFall() ? "FALL" : "PASS");
    }

    public static void title(){
        Person.title();
        System.out.printf("%20s%20s%20s%20s%n", "Id", "Name Class", "Gpa", "increase class");
    }
}
