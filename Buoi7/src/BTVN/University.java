package BTVN;

import java.util.List;
import java.util.Scanner;

public class University {
    private List<Student> students;
    private List<Course> courses;

    public University() {
    }

    public University(List<Student> students, List<Course> courses) {
        this.students = students;
        this.courses = courses;
    }

    public void getStudents() {
        for (Student s : students) {
            s.displayInfo();
        }
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void getCourses() {
        for (Course c : courses) {
            c.displayInfo();
        }
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void removeStudent(Student s) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId().equals(s.getId())) {
                students.remove(i);
            }
        }
    }

    public void addCourse(Course c) {
        courses.add(c);
    }

    public void removeCourse(Course c) {
        for (int i = 0; i < courses.size(); i++) {
            if (courses.get(i).getCourseId().equals(c.getCourseId())) {
                courses.remove(i);
            }
        }
    }

    public Student findStudent(String id) {
        for (Student s : students) {
            if(s.getId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public Course findCourse(String id) {
        for (Course s : courses) {
            if(s.getCourseId().equals(id)) {
                return s;
            }
        }
        return null;
    }

    public void enrollStudentInCourse() {
        Scanner sc = new Scanner(System.in);
        String studentId = sc.nextLine();
        String courseId = sc.nextLine();
        Student s = findStudent(studentId);
        Course c = findCourse(courseId);
        c.enrolStudent(s);
    }
}
