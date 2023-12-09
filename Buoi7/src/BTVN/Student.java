package BTVN;

import java.util.List;

public class Student extends Person {
    private int age;
    private String grade;
    private List<Course> courses;

    public Student() {

    }

    public Student(int age, String grade) {
        this.age = age;
        this.grade = grade;
    }

    public Student(String id, String name, int age, String grade) {
        super(id, name);
        this.age = age;
        this.grade = grade;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public void enrol(Course course) {
        courses.add(course);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.printf("Age: %d\n", age);
        System.out.printf("Grade: %s\n", grade);
    }
}
