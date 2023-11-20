

import java.util.ArrayList;
import java.util.Scanner;

public class Phong {
    private String maPhong ;
    private String tenPhong ;
    private QuanLy quanLy ;
    private ArrayList<May> mays  = new ArrayList<May>();
    private int n ;
    public Phong(){} ;
    public Phong(String maPhong, String tenPhong, QuanLy quanLy, ArrayList<May> mays, int n) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.quanLy = quanLy;
        this.mays = mays;
        this.n = n;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "maPhong='" + maPhong + '\'' +
                ", tenPhong='" + tenPhong + '\'' +
                ", quanLy=" + quanLy.toString() +
                ", soLuongMay=" + n +
                '}';
    }
    Scanner Ip = new Scanner(System.in) ;
    public void Input(){
        System.out.printf("Nhap vao ma phong: ");
        maPhong = Ip.nextLine() ;
        System.out.printf("Nhap vao ten phong: ");
        tenPhong = Ip.nextLine() ;
        quanLy.Input();
        System.out.printf("Nhap vao so luong may: ");
        int n = Ip.nextInt() ;
        mays.clear();
        for(int i = 0 ; i < n ; i++){
            System.out.println("NHAP VAO THONG TIN MAY THU " + (i+1));
            May one = new May() ;
            one.Input();
            mays.add(one) ;
        }
    }
    public void Out(){
        System.out.println(toString());
        for(May may :mays){
            may.Out() ;
        }
    }
    public void searchByStatus(String status){
        for(May may:mays){
            if(may.getTinhTrang().equals(status)){
                may.Out() ;
            }
        }
    }
    public void searchByID(int id){
        for(May may:mays){
            if(may.getMaMay() == id){
                may.Out() ;
            }
        }
    }
}