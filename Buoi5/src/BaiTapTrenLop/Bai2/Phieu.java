package BaiTapTrenLop.Bai2;

import java.util.ArrayList;
import java.util.Arrays;

public class Phieu {
    private static final int TIEN_COC = 1000000;

    private String maPhieu;
    private String ngayDat;
    private String ngayDen;
    private KhachHang khachHang;
    private ArrayList<Phong> dsphong;

    public Phieu() {
    }

    public Phieu(String maPhieu, String ngayDat, String ngayDen, KhachHang khachHang, ArrayList<Phong> dsphong) {
        this.maPhieu = maPhieu;
        this.ngayDat = ngayDat;
        this.ngayDen = ngayDen;
        this.khachHang = khachHang;
        this.dsphong = dsphong;
    }

    public String getMaPhieu() {
        return maPhieu;
    }

    public void setMaPhieu(String maPhieu) {
        this.maPhieu = maPhieu;
    }

    public String getNgayDat() {
        return ngayDat;
    }

    public void setNgayDat(String ngayDat) {
        this.ngayDat = ngayDat;
    }

    public String getNgayDen() {
        return ngayDen;
    }

    public void setNgayDen(String ngayDen) {
        this.ngayDen = ngayDen;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public ArrayList<Phong> getDsphong() {
        return dsphong;
    }

    public void setDsphong(ArrayList<Phong> dsphong) {
        this.dsphong = dsphong;
    }

    public int getTienCoc() {
        return TIEN_COC * dsphong.size();
    }

    public int tongSoNguoiO() {
        int sum = 0;
        for (Phong p : dsphong) {
            sum += p.getSoNguoiSeO();
        }
        return sum;
    }

    public void display() {
        System.out.println("Ma phieu: " + maPhieu + ", Ngay dat: " + ngayDat + ", Ngay den: " + ngayDen);
        System.out.println(khachHang);
        System.out.println("Danh sach phong:");
        dsphong.forEach(p -> System.out.println(p));
        System.out.println("So tien dat truoc: " + getTienCoc());
        System.out.println("Tong so nguoi o: " + tongSoNguoiO());
    }

    public static void main(String[] args) {
        KhachHang k = new KhachHang("KH005", "Tran Thanh Ha", "Cong ty SIMCO", new CMND("151174189", "Thai Binh"));
        ArrayList<Phong> dsphong = new ArrayList<>(Arrays.asList(
                new Phong("PO5", "Phong doi", "Sang", 2),
                new Phong("P07", "Phong 4 nguoi", "Thuong", 3)
        ));
        Phieu p = new Phieu("PH01", "01/02/2007", "15/02/2007", k, dsphong);
        p.display();
    }
}
