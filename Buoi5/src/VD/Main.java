import java.util.ArrayList;
import java.util.List;

public class Main {
    static List<SinhVien> a = new ArrayList<>();
    SinhVien[] s = new SinhVien[5];
    static{
        SinhVien x = new SinhVien(2, "Hi");
        a.add(new SinhVien(1, "Kien"));
        a.add(new SinhVien(2, "Tuan"));
        a.add(x);
    }

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
//        ArrayList<SinhVien> students = new ArrayList<>();
//
//        integers.add(5);
//        integers.add(4);
//
//        ArrayList<Integer> array2 = new ArrayList<Integer>();
//        array2.add(5);
//        array2.add(6);
//
//        integers.addAll(array2);
//        System.out.println(integers);
//
//        integers.forEach(i -> System.out.println(i));
//        Student a = new Student();
//        a.in();
        HoaDon x = new HoaDon();
        x.setTen("HOA DON BAN HANG");
        x.setKhachHang(new KhachHang("Kien", "0969992581", "Ha Noi"));
        ArrayList<SanPham> listSp = new ArrayList<>();
        listSp.add(new SanPham("Banh mi", 2, 15000));
        listSp.add(new SanPham("Xoi", 1, 20000));
        x.setListSp(listSp);
        x.setShip(30000);




        x.display();
    }
}
