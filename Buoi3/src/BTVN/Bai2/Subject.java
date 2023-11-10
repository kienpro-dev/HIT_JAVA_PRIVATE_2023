package BTVN.Bai2;

public class Subject {

    private String id;

    private String subjectName;

    private int studentCount;

    private String timeStart;

    private String timeEnd;

    public Subject(String id, String subjectName, int studentCount, String timeStart, String timeEnd) {
        this.id = id;
        this.subjectName = subjectName;
        this.studentCount = studentCount;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
    }

    public Subject() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        this.studentCount = studentCount;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }

    public void setSubject(Subject s) {
        id = s.getId();
        subjectName = s.getSubjectName();
        studentCount = s.getStudentCount();
        timeStart = s.getTimeStart();
        timeEnd = s.getTimeEnd();
    }

    public void display() {
        System.out.printf("%-8s %-25s %-15d %-25s\n", id, subjectName, studentCount, timeStart + " - " + timeEnd);
    }

    public boolean compareByTimeEnd(Subject subject) {
        String[] splitTime1 = timeEnd.split(":");
        String[] splitTime2 = subject.getTimeEnd().split(":");

        int time1 = Integer.parseInt(splitTime1[0]) * 60 + Integer.parseInt(splitTime1[1]);
        int time2 = Integer.parseInt(splitTime2[0]) * 60 + Integer.parseInt(splitTime2[1]);
        return time1 < time2;
    }
}