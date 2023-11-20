
import java.util.ArrayList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args){
        Scanner Ip = new Scanner(System.in) ;
        int n = 4 ;
        ArrayList<May> mays = new ArrayList<>() ;
        mays.add(new May(1 , "ASUS" , "98%")) ;
        mays.add(new May(2 , "LENOVO" , "99%")) ;
        mays.add(new May(3 , "MACBOOK" , "97%")) ;
        mays.add(new May(4 , "GIGABYTES" ,  "99%")) ;
        Phong phong = new Phong("1" , "Phong LAB" , new QuanLy("1" , "ROAN VAN QUYEN") , mays , n) ;
        do{
            System.out.printf("MOI BAN NHAP LUA CHON: ");
            int choose = Ip.nextInt() ;
            if(choose == 1){
                System.out.println("---------------------------------------NHAP VAO THONG TIN PHONG MAY------------------------------------");
                phong.Input();
            }
            if(choose == 2){
                System.out.println("----------------------------------------XUAT RA THONG TIN PHONG MAY-------------------------------------");
                phong.Out() ;
            }
            if(choose == 3){
                System.out.printf("NHAP VAO THONG TIN TINH TRANG MAY MUON KIEM TRA: ");
                Ip.nextLine();
                String status = Ip.nextLine() ;
                phong.searchByStatus(status);
            }
            if(choose == 4){
                System.out.printf("NHAP VAO MA MAY BAN MUON TIM KIEM: ");
                int id = Ip.nextInt() ;
                phong.searchByID(id);
            }

        }while(true) ;
    }
}