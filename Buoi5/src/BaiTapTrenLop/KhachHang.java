public class KhachHang {
    private String ten;
    private String sdt;
    private String diaChi;

    public KhachHang() {
    }

    public KhachHang(String ten, String sdt, String diaChi) {
        this.ten = ten;
        this.sdt = sdt;
        this.diaChi = diaChi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "KhachHang{" +
                "ten='" + ten + '\'' +
                ", sdt='" + sdt + '\'' +
                ", diaChi='" + diaChi + '\'' +
                '}';
    }
}
