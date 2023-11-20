package BaiTapTrenLop.Bai2;

public class Phong {
    private String maPhong;
    private String loaiPhong;
    private String hang;
    private int soNguoiSeO;

    public Phong() {
    }

    public Phong(String maPhong, String loaiPhong, String hang, int soNguoiSeO) {
        this.maPhong = maPhong;
        this.loaiPhong = loaiPhong;
        this.hang = hang;
        this.soNguoiSeO = soNguoiSeO;
    }

    public String getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(String maPhong) {
        this.maPhong = maPhong;
    }

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public int getSoNguoiSeO() {
        return soNguoiSeO;
    }

    public void setSoNguoiSeO(int soNguoiSeO) {
        this.soNguoiSeO = soNguoiSeO;
    }

    @Override
    public String toString() {
        return "Ma phong: " + maPhong + ", Loai phong: " + loaiPhong + ", Hang: " + hang + ", So nguoi se o: " + soNguoiSeO;
    }
}
