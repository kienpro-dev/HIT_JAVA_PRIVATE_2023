import objects.SinhVien;

public class RunMain {
    public static void main(String[] args) {
        SinhVien a = new SinhVien("1", "Kien");
        SinhVien b = a;
        a.setMsv("2");
        System.out.println(b.getMsv());
        System.out.println(a.getMsv());
    }
}
