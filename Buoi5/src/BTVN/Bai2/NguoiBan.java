package BTVN.Bai2;

import java.util.Scanner;

public class NguoiBan extends Nguoi{
    private String dienThoai;

    public NguoiBan(){

    }

    public NguoiBan(String hoTen, String maSoThue, String diaChi, String soTK, String dienThoai) {
        super(hoTen, maSoThue, diaChi, soTK);
        this.dienThoai = dienThoai;
    }

    public String getDienThoai() {
        return dienThoai;
    }

    public void setDienThoai(String dienThoai) {
        this.dienThoai = dienThoai;
    }

    @Override
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("So dien thoai: ");
        this.dienThoai= sc.nextLine();
    }

    public void tieuDe(){
        System.out.printf("%-30s %-20s %-30s %-30s %-20s\n", "Ho ten", "Ma so thue", "Dia chi", "So tai khoan","So dien thoai");
    }
    public void xuat() {
        System.out.printf("%-30s %-20s %-30s %-30s %-20s\n", this.getHoTen(), this.getMaSoThue(), this.getDiaChi(), this.getSoTK(),this.getDienThoai());
    }
}
