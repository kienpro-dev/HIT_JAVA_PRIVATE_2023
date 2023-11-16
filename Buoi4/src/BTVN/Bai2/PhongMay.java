package BTVN.Bai2;


import java.util.Scanner;

public class PhongMay {
	// Object's properties
	private String maPhong;
	private String tenPhong;
	private QuanLy x = new QuanLy();
	private May[] y;
	private int n;
	
	// Constructor
	public PhongMay() {
	}
	
	public PhongMay(String maPhong, String tenPhong, QuanLy x, May[] y, int n) {
		super();
		this.maPhong = maPhong;
		this.tenPhong = tenPhong;
		this.x = x;
		this.y = y;
		this.n = n;
	}

	// Getters and Setters
	public String getMaPhong() {
		return maPhong;
	}

	public void setMaPhong(String maPhong) {
		this.maPhong = maPhong;
	}

	public String getTenPhong() {
		return tenPhong;
	}

	public void setTenPhong(String tenPhong) {
		this.tenPhong = tenPhong;
	}

	public QuanLy getX() {
		return x;
	}

	public void setX(QuanLy x) {
		this.x = x;
	}

	public May[] getY() {
		return y;
	}

	public void setY(May[] y) {
		this.y = y;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	// Input method
    public void nhap(Scanner scanner) {
        System.out.print("Nhap ma phong: ");
        this.maPhong = scanner.nextLine();
        System.out.print("Nhap ten phong: ");
        this.tenPhong = scanner.nextLine();
        System.out.println("===Nhap thong tin Quan ly: ");
        this.x.nhap(scanner);
        
        System.out.print("Nhap so luong may: ");
        this.n = Integer.parseInt(scanner.nextLine());
        this.y = new May[n];
        
        for (int i = 0; i < n; i++) {
        	System.out.println("===Nhap thong tin may thu " + (i + 1));
        	this.y[i] = new May();
        	this.y[i].nhap(scanner);
        }
    }

	// Output method
    public void xuat() {
    	if (this.n < 1) {
    		System.out.println("404 - Phong may not found.");
    		return;
    	}
    	
    	System.out.println("\n\n\tTHONG TIN PHONG MAY");
    	System.out.println("Ma phong: " + maPhong + "\t\tTen phong: " + tenPhong);
    	this.x.xuat();
    	
    	System.out.printf("%-5s %-10s %-20s %-20s\n", 
    			"STT", "Ma may", "Kieu may", "Tinh trang");
    	for (int i = 0; i < n; i++) {
        	System.out.printf("%-5d ", (i + 1));
        	this.y[i].xuat();
        }
    }
    
    // Search by tinhTrang method
    public boolean timKiem(String tinhTrang) {
    	boolean found = false;
    	int count = 0;
    	for (int i = 0; i < this.n; i++) {
    		May may = this.y[i];
    		if (may.getTinhTrang().toUpperCase().contains(tinhTrang.toUpperCase())) {
    			if (!found) {
    				System.out.printf("%-5s %-10s %-20s %-20s\n", 
    						"STT", "Ma may", "Kieu may", "Tinh trang");
					found = true;
				}
    			System.out.printf("%-5d ", ++count);
    			may.xuat();
    		}
    	}
    	return found;
    }
    
    // Search by maMay method
    public boolean timKiem(int maMay) {
    	boolean found = false;
    	int count = 0;
    	for (int i = 0; i < this.n; i++) {
    		May may = this.y[i];
    		if (may.getMaMay() == maMay) {
    			if (!found) {
    				System.out.printf("%-5s %-10s %-20s %-20s\n", 
    						"STT", "Ma may", "Kieu may", "Tinh trang");
					found = true;
				}
    			System.out.printf("%-5d ", ++count);
    			may.xuat();
    		}
    	}
    	return found;
    }
}
