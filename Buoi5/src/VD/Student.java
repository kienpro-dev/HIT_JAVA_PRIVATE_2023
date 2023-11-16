// Lớp Student kế thừa lớp Person thông qua từ khóa extends
public class Student extends Person {
    private double gpa;

    // Khi khai báo constructor lớp con cần truyền đầy đủ tham số cả cha lẫn con
    public Student(String name, int age, String address, double gpa) {
        // thông qua từ khóa super gọi đến constructor lớp cha
        super(name, age, address);
        this.gpa = gpa;
    }

    public Student() {

    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void in() {
        super.in();
        System.out.println("Student");
    }


}