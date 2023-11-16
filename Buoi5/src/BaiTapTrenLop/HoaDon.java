import java.util.ArrayList;
import java.util.List;

public class HoaDon {
    private String ten;
    private KhachHang khachHang;
    private ArrayList<SanPham> listSp;
    private int ship;

    public HoaDon() {
    }

    public HoaDon(String ten, KhachHang khachHang, ArrayList<SanPham> listSp) {
        this.ten = ten;
        this.khachHang = khachHang;
        this.listSp = listSp;
    }

    public int getShip() {
        return ship;
    }

    public void setShip(int ship) {
        this.ship = ship;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public ArrayList<SanPham> getListSp() {
        return listSp;
    }

    public void setListSp(ArrayList<SanPham> listSp) {
        this.listSp = listSp;
    }

    public int tongCong() {
        int tongGia = 0;
        for(SanPham sp : listSp) {
            tongGia += (sp.getGia() * sp.getSl());
        }
        return tongGia + ship;
    }

    public void display() {
        System.out.println(ten);
        System.out.println(khachHang);
        listSp.forEach(sp -> System.out.println(sp));
        System.out.println(ship);
        System.out.println(tongCong());
    }
}
