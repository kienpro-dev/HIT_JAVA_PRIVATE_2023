package BaiTapTrenLop.Bai2;

public class KhachHang {
    private String maKH;
    private String tenKH;
    private String diaChi;
    private CMND cmnd;

    public KhachHang() {

    }

    public KhachHang(String maKH, String tenKH, String diaChi, CMND cmnd) {
        this.maKH = maKH;
        this.tenKH = tenKH;
        this.diaChi = diaChi;
        this.cmnd = cmnd;
    }

    public String getMaKH() {
        return maKH;
    }

    public void setMaKH(String maKH) {
        this.maKH = maKH;
    }

    public String getTenKH() {
        return tenKH;
    }

    public void setTenKH(String tenKH) {
        this.tenKH = tenKH;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public CMND getCmnd() {
        return cmnd;
    }

    public void setCmnd(CMND cmnd) {
        this.cmnd = cmnd;
    }

    @Override
    public String toString() {
        return "Ma KH: " + maKH + ", Ten KH: " + tenKH + ", Dia chi: " + diaChi + "\n" + cmnd.toString();
    }
}
