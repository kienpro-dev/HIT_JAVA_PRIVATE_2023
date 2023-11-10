public class RunMain {
    private static String subject = "Default";

    private static SinhVien[] list = new SinhVien[2];

    static {
        list[0] = new SinhVien("Kien");
        list[1] = new SinhVien("Tuan");
    }

    public static void main(String[] args) {
        RunMain ex1 = new RunMain();
        SinhVien a = new SinhVien();
        SinhVien b = new SinhVien();
        System.out.println(a);
    }
}
