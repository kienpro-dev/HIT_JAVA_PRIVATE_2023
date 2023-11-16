package BTVN.Bai1;

import java.util.Scanner;

public class Sach {
	// Class's properties
    private static int idCounter = 1;
    
    // Object's properties
    private final int id;
    private String tenSach;
    private String namXuatBan;
    private String theLoai;
    private TacGia tacGia;

    // Constructor
    public Sach() {
        this.id = idCounter++; // ID tu dong tang
        this.tacGia = new TacGia();
    }

    // Getters and Setters (ngoai tru Setter cho ID)
    public int getId() {
    	return id;
    }
    
    public String getTenSach() {
		return tenSach;
	}

	public void setTenSach(String tenSach) {
		this.tenSach = tenSach;
	}

	public String getNamXuatBan() {
		return namXuatBan;
	}

	public void setNamXuatBan(String namXuatBan) {
		this.namXuatBan = namXuatBan;
	}

	public String getTheLoai() {
		return theLoai;
	}

	public void setTheLoai(String theLoai) {
		this.theLoai = theLoai;
	}

	public TacGia getTacGia() {
		return tacGia;
	}

	public void setTacGia(TacGia tacGia) {
		this.tacGia = tacGia;
	}

    // Input method
    public void input(Scanner scanner) {
        System.out.print("Nhap ten sach: ");
        this.tenSach = scanner.nextLine();
        System.out.print("Nhap nam xuat ban: ");
        this.namXuatBan = scanner.nextLine();
        System.out.print("Nhap the loai: ");
        this.theLoai = scanner.nextLine();
        System.out.println("===Nhap thong tin Tac Gia");
        this.tacGia.input(scanner);
    }

	// Output method
    public void output() {
        System.out.printf("%-5d %-20s %-20s %-15s %-20s\n", 
        		id, tenSach, namXuatBan, theLoai, tacGia.getTenTacGia());
    }
}

