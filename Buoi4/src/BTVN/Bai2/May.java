package BTVN.Bai2;


import java.util.Scanner;

public class May {
	// Object's properties
	private int maMay;
	private String kieuMay;
	private String tinhTrang;
	
	// Constructor
	public May() {
	}
	
	public May(int maMay, String kieuMay, String tinhTrang) {
		super();
		this.maMay = maMay;
		this.kieuMay = kieuMay;
		this.tinhTrang = tinhTrang;
	}

	// Getters and Setters
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
	
	// Input method
    public void nhap(Scanner scanner) {
        System.out.print("Nhap ma may: ");
        this.maMay = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhap kieu may: ");
        this.kieuMay = scanner.nextLine();
        System.out.print("Nhap tinh trang: ");
        this.tinhTrang = scanner.nextLine();
    }

	// Output method
    public void xuat() {
        System.out.printf("%-10s %-20s %-20s\n", maMay, kieuMay, tinhTrang);
    }

}
