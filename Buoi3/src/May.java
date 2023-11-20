

import java.util.Scanner;

public class May {
    private  int maMay ;
    private String kieuMay ;
    private String tinhTrang ;

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    public May(){};
    public May(int maMay, String kieuMay, String tinhTrang) {
        this.maMay = maMay;
        this.kieuMay = kieuMay;
        this.tinhTrang = tinhTrang;
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Nhap vao ma may: ");
        maMay = Ip.nextInt();
        Ip.nextLine();
        System.out.printf("Nhap vao kieu may: ");
        kieuMay = Ip.nextLine() ;
        System.out.printf("Nhap vao tinh trang: ");
        tinhTrang= Ip.nextLine() ;
    }

    @Override
    public String toString() {
        return "May{" +
                "maMay=" + maMay +
                ", kieuMay='" + kieuMay + '\'' +
                ", tinhTrang='" + tinhTrang + '\'' +
                '}';
    }

    public void Out(){
        System.out.println(toString());
    }
}
