

import java.util.Scanner;

public class QuanLy {
    private String maQl ;
    private String tenQl ;

    public String getMaQl() {
        return maQl;
    }

    public void setMaQl(String maQl) {
        this.maQl = maQl;
    }

    public String getTenQl() {
        return tenQl;
    }

    public void setTenQl(String tenQl) {
        this.tenQl = tenQl;
    }
    Scanner Ip = new Scanner(System.in) ;
    public QuanLy(){}
    public QuanLy(String maQl, String tenQl) {
        this.maQl = maQl;
        this.tenQl = tenQl;
    }

    public void Input(){
        System.out.printf("Nhap vao ma quan ly: ");
        maQl = Ip.nextLine() ;
        System.out.printf("Nhap vao ten quan ly: ");
        tenQl = Ip.nextLine() ;
    }

    @Override
    public String toString() {
        return "QuanLy{" +
                "maQl='" + maQl + '\'' +
                ", tenQl='" + tenQl + '\'' +
                '}';
    }
    public void Out(){
        System.out.println(toString());
    }
}