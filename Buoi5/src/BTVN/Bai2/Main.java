package BTVN.Bai2;

public class Main {
    public static void main(String[] args) {
        HoaDon hoaDon = new HoaDon();
        hoaDon.nhap();
        hoaDon.xuat();
        System.out.println("======================================\n" +
                "SAN PHAM CO SO LUONG LON NHAT");
        HangHoa hangHoa=hoaDon.soLuongLonNhat(hoaDon.getDshh());
        hangHoa.tieuDe();
        hangHoa.xuat();
    }
}
