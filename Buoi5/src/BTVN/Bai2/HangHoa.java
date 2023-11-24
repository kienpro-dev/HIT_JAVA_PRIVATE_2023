package BTVN.Bai2;

import java.util.List;
import java.util.Scanner;

public class HangHoa {
    private String tenHang;
    private String dvTinh;
    private int sl;
    private int donGia;

    public HangHoa(){

    }

    public HangHoa(String tenHang, String dvTinh, int sl, int donGia) {
        this.tenHang = tenHang;
        this.dvTinh = dvTinh;
        this.sl = sl;
        this.donGia = donGia;
    }

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public String getDvTinh() {
        return dvTinh;
    }

    public void setDvTinh(String dvTinh) {
        this.dvTinh = dvTinh;
    }

    public int getSl() {
        return sl;
    }

    public void setSl(int sl) {
        this.sl = sl;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public void nhap(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Ten hang: ");
        this.tenHang=sc.nextLine();
        System.out.print("Don vi tinh: ");
        this.dvTinh=sc.nextLine();
        System.out.print("So luong: ");
        this.sl=sc.nextInt();
        System.out.print("Don gia: ");
        this.donGia=sc.nextInt();
        sc.nextLine();
    }
    public int thanhTien(){
        return this.donGia*this.sl ;
    }

    public void tieuDe(){
        System.out.printf("%-30s %-20s %-15s %-20s %-25s\n", "Ten hang", "Don vi tinh", "So luong", "Don gia", "Thanh tien");
    }
    public void xuat(){
        System.out.printf("%-30s %-20s %-15s %-20s %-25s\n", this.tenHang, this.dvTinh, this.sl, this.donGia, this.thanhTien());
    }

}
