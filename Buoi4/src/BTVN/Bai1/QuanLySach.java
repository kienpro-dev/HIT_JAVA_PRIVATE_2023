package BTVN.Bai1;

import java.util.Scanner;

public class QuanLySach {
	private static Sach[] sachArray;
	private static int sachCount = 0;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhap so luong sach: ");
		int n = scanner.nextInt();
		sachArray = new Sach[n];

		int option;
		do {
			System.out.println("\n--- Quan Ly Sach ---");
			System.out.println("1. Nhap thong tin sach");
			System.out.println("2. In thong tin cac cuon sach");
			System.out.println("3. Tim kiem sach theo ten");
			System.out.println("4. Sap xep cac cuon sach theo ten tac gia");
			System.out.println("5. Thoat");
			System.out.print("Nhap lua chon: ");
			option = scanner.nextInt();
			scanner.nextLine();

			switch (option) {
				case 1:
					do {
						System.out.println("===Nhap thong tin cuon Sach thu " + (sachCount + 1));
						if (nhapThongTinSach(scanner)) {
							System.out.println("Them sach thanh cong!");
						} else {
							System.out.println("Them sach that bai!");
						}
					} while (sachCount < n);
					break;
				case 2:
					if (inThongTinSach()) {
						System.out.println("In thong tin sach thanh cong!");
					} else {
						System.out.println("404 - Sach not found.");
					}
					break;
				case 3:
					if (timKiemSachTheoTen(scanner)) {
						System.out.println("Tim kiem thanh cong!");
					} else {
						System.out.println("404 - Sach not found.");
					}
					break;
				case 4:
					if (sapXepSachTheoTenTG()) {
						System.out.println("Sap xep thanh cong!");
					} else {
						System.out.println("Sap xep that bai!");
					}
					break;
				case 5:
					System.out.println("Thoat chuong trinh.");
					break;
				default:
					System.out.println("Lua chon khong hop le. Vui long thu lai!");
			}
		} while (option != 5);

		scanner.close();
	}

	private static boolean nhapThongTinSach(Scanner scanner) {
		if (sachCount >= sachArray.length) {
			return false;
		}
		Sach book = new Sach();
		book.input(scanner);
		sachArray[sachCount++] = book;
		return true;
	}

	private static boolean inThongTinSach() {
		if (sachCount == 0) {
			return false;
		}
		System.out.printf("%-5s %-20s %-20s %-15s %-20s\n", 
				"ID", "Ten sach", "NXB", "The loai", "Tac gia");
		for (int i = 0; i < sachCount; i++) {
			sachArray[i].output();
		}
		return true;
	}

	private static boolean timKiemSachTheoTen(Scanner scanner) {
		System.out.print("Nhap ten sach can tim: ");
		String name = scanner.nextLine().toUpperCase();
		boolean found = false;
		for (Sach book : sachArray) {
			if (book != null && book.getTenSach().toUpperCase().contains(name)) {
				if (!found) {
					System.out.printf("%-5s %-20s %-20s %-15s %-20s\n", 
							"ID", "Ten sach", "NXB", "The loai", "Tac gia");
				}
				book.output();
				found = true;
			}
		}
		return found;
	}

	private static boolean sapXepSachTheoTenTG() {
		if (sachCount == 0) {
			return false;
		}
		for (int i = 0; i < sachCount - 1; i++) {
			for (int j = i + 1; j < sachCount; j++) {
				String tenTacGiaI = sachArray[i].getTacGia().getTenTacGia().toUpperCase();
				String tenTacGiaJ = sachArray[j].getTacGia().getTenTacGia().toUpperCase();
				if (tenTacGiaI.compareTo(tenTacGiaJ) > 0) {
					Sach temp = sachArray[i];
					sachArray[i] = sachArray[j];
					sachArray[j] = temp;
				}
			}
		}
		return true;
	}

}

