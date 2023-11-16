package BTVN.Bai1;

import java.util.Scanner;

public class TacGia {
	// Object's properties
	private String tenTacGia;
	private String namSinh;

	// Constructor
	public TacGia() {
	}

	public TacGia(String tenTacGia, String namSinh) {
		this.tenTacGia = tenTacGia;
		this.namSinh = namSinh;
	}

	// Getters and Setters
	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public String getNamSinh() {
		return namSinh;
	}

	public void setNamSinh(String namSinh) {
		this.namSinh = namSinh;
	}

	// Input method
	public void input(Scanner scanner) {
		System.out.print("Nhap ten tac gia: ");
		this.tenTacGia = scanner.nextLine();
		System.out.print("Nhap nam sinh: ");
		this.namSinh = scanner.nextLine();
	}

	// Output method
	public void output() {
		System.out.printf("%-20s %-15s\n", tenTacGia, namSinh);
	}
}

