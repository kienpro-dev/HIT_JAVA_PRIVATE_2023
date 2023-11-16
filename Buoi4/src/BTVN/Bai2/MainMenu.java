package BTVN.Bai2;

import java.util.Scanner;

public class MainMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PhongMay phongMay = new PhongMay();
        
        int option;
        do {
        	System.out.println("\n\t---Quan ly Phong May---");
            System.out.println("1 - Nhap thong tin phong may");
            System.out.println("2 - Xuat thong tin phong may");
            System.out.println("3 - Tim kiem may theo kieu may");
            System.out.println("4 - Tim kiem may theo ma may");
            System.out.println("5 - Thoat chuong tinh");
            System.out.print("Nhap lua chon cua ban: ");
            option = Integer.parseInt(scanner.nextLine());

            switch (option) {
                case 1:
                	phongMay.nhap(scanner);
                    break;
                case 2:
                	phongMay.xuat();
                    break;
                case 3:
                    System.out.print("Nhap kieu may can tim: ");
                    String model = scanner.nextLine();
                    if (phongMay.timKiem(model)) {
                    	System.out.println("Tim kiem thanh cong!");
                    } else {
                    	System.out.println("404 - May not found.");
                    }
                    break;
                case 4:
                    System.out.print("Nhap ma may can tim: ");
                    int maMay = Integer.parseInt(scanner.nextLine());
                    if (phongMay.timKiem(maMay)) {
                    	System.out.println("Tim kiem thanh cong!");
                    } else {
                    	System.out.println("404 - May not found.");
                    }
                    break;
                case 5:
                	System.out.println("Ket thuc chuong trinh.");
                    break;
                default:
                	System.out.println("Lua chon khong hop le. Vui long nhap lai!");
            }
        } while (option != 5);
        
        scanner.close();
    }
}
