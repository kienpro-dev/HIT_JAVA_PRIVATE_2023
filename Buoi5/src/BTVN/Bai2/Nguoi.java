package BTVN.Bai2;

import java.util.Scanner;

public class Nguoi {
    private String hoTen;
    private String maSoThue;
    private String diaChi;
    private String soTK;

    public Nguoi() {

    }

    public Nguoi(String hoTen, String maSoThue, String diaChi, String soTK) {
        this.hoTen = hoTen;
        this.maSoThue = maSoThue;
        this.diaChi = diaChi;
        this.soTK = soTK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public String getMaSoThue() {
        return maSoThue;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getSoTK() {
        return soTK;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setMaSoThue(String maSoThue) {
        this.maSoThue = maSoThue;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setSoTK(String soTK) {
        this.soTK = soTK;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ten: ");
        this.hoTen = sc.nextLine();
        System.out.print("Ma so thue: ");
        this.maSoThue = sc.nextLine();
        System.out.print("Dia chi: ");
        this.diaChi = sc.nextLine();
        System.out.print("So tai khoan: ");
        this.soTK = sc.nextLine();
    }

    public void tieuDe(){
        System.out.printf("%-30s %-20s %-30s %-30s\n", "Ho ten", "Ma so thue", "Dia chi", "So tai khoan");
    }
    public void xuat() {
        System.out.printf("%-30s %-20s %-30s %-30s\n", this.getHoTen(), this.getMaSoThue(), this.getDiaChi(), this.getSoTK());
    }
}
