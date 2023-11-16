package BTVN.Bai2;


import java.util.Scanner;

public class QuanLy {
	// Object's properties
	private String maQL;
	private String tenQL;
	
	// Constructor
	public QuanLy() {
	}
	
	public QuanLy(String maQL, String tenQL) {
		super();
		this.maQL = maQL;
		this.tenQL = tenQL;
	}

	// Getters and Setters
	public String getMaQL() {
		return maQL;
	}

	public void setMaQL(String maQL) {
		this.maQL = maQL;
	}

	public String getTenQL() {
		return tenQL;
	}

	public void setTenQL(String tenQL) {
		this.tenQL = tenQL;
	}
	
	// Input method
    public void nhap(Scanner scanner) {
        System.out.print("Nhap ma quan ly: ");
        this.maQL = scanner.nextLine();
        System.out.print("Nhap ten quan ly: ");
        this.tenQL = scanner.nextLine();
    }

	// Output method
    public void xuat() {
    	System.out.println("Ma quan ly: " + maQL + "\t\tTen quan ly: " + tenQL);
    }

}
