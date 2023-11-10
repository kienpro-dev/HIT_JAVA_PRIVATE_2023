public class SinhVien {
    private static String gvcn = "abc";
    private static int count = 0;

    private int id;

    private String name;

    private Date nhapHoc;

    private Date raTruong;

    public SinhVien() {
        count++;
        this.id = count;
    }

    public SinhVien(String name) {
        this.id = ++count;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Sinh vien: ID =  " + this.id + " , Name = " + this.name;
    }

    public int tong(int a, int b) {
        return a + b;
    }

    public int tong(int a, int b, int c) {
        return a + b + c;
    }

    public double tong(double a, double b, double c) {
        return a + b + c;
    }


}
