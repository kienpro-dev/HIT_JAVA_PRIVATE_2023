package BTVN.Bai2;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class HoaDon {
    private String maHD;
    private String htThanhToan;
    private String ngayLap;
    private NguoiBan nguoiBan;
    private NguoiMua nguoiMua;
    private List<HangHoa> dshh;

    public HoaDon() {
        nguoiBan = new NguoiBan();
        nguoiMua = new NguoiMua();
        dshh = new ArrayList<>();

    }

    public HoaDon(String maHD, String htThanhToan, String ngayLap, NguoiBan nguoiBan, NguoiMua nguoiMua, List<HangHoa> dshh) {
        this.maHD = maHD;
        this.htThanhToan = htThanhToan;
        this.ngayLap = ngayLap;
        this.nguoiBan = nguoiBan;
        this.nguoiMua = nguoiMua;
        this.dshh = dshh;
    }

    public String getMaHD() {
        return maHD;
    }

    public void setMaHD(String maHD) {
        this.maHD = maHD;
    }

    public String getHtThanhToan() {
        return htThanhToan;
    }

    public void setHtThanhToan(String htThanhToan) {
        this.htThanhToan = htThanhToan;
    }

    public String getNgayLap() {
        return ngayLap;
    }

    public void setNgayLap(String ngayLap) {
        this.ngayLap = ngayLap;
    }

    public NguoiBan getNguoiBan() {
        return nguoiBan;
    }

    public void setNguoiBan(NguoiBan nguoiBan) {
        this.nguoiBan = nguoiBan;
    }

    public NguoiMua getNguoiMua() {
        return nguoiMua;
    }

    public void setNguoiMua(NguoiMua nguoiMua) {
        this.nguoiMua = nguoiMua;
    }

    public List<HangHoa> getDshh() {
        return dshh;
    }

    public void setDshh(List<HangHoa> dshh) {
        this.dshh = dshh;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ma hoa don: ");
        this.maHD = sc.nextLine();
        System.out.println("Thong tin nguoi ban: ");
        this.nguoiBan.nhap();
        System.out.println("Thong tin nguoi mua: ");
        this.nguoiMua.nhap();
        System.out.print("So luong hang hoa: ");
        int sl = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < sl; i++) {
            HangHoa hangHoa = new HangHoa();
            System.out.println("San pham thu " + (i + 1));
            hangHoa.nhap();
            this.dshh.add(hangHoa);
        }
        System.out.print("Hinh thuc thanh toan: ");
        this.htThanhToan = sc.nextLine();


        LocalDateTime currentDateTime = LocalDateTime.now();

        // Định dạng ngày giờ theo ý muốn
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.ngayLap = currentDateTime.format(formatter);

    }

    public void xuat() {
        System.out.println("==========HOA DON BAN HANG===========");
        System.out.println("Ngay lap: " + this.ngayLap);
        System.out.println("=============================================================");
        System.out.println("Ten nguoi ban: " + this.nguoiBan.getHoTen());
        System.out.println("Ma so thue: " + this.nguoiBan.getMaSoThue());
        System.out.println("Dia chi: " + this.nguoiBan.getDiaChi());
        System.out.println("So dien thoai: " + this.nguoiBan.getDienThoai());
        System.out.println("=============================================================");
        System.out.println("Ten nguoi mua: " + this.nguoiMua.getHoTen());
        System.out.println("Ma so thue: " + this.nguoiMua.getMaSoThue());
        System.out.println("Dia chi: " + this.nguoiMua.getDiaChi());
        System.out.println("So tai khoan: " + this.nguoiMua.getSoTK());
        System.out.println("Hinh thuc thanh toan: " + this.htThanhToan);
        System.out.println("=============================================================");
        System.out.printf("%-30s %-20s %-15s %-20s %-25s\n", "Ten hang", "Don vi tinh", "So luong", "Don gia", "Thanh tien");
        this.dshh = sapXepTheoGia(dshh);
        int tongTien=0;
        for (HangHoa hangHoa : this.dshh) {
            hangHoa.xuat();
            tongTien+=hangHoa.thanhTien();
        }
        System.out.println("Tong tien can thanh toan: "+tongTien);


    }

    public List<HangHoa> sapXepTheoGia(List<HangHoa> dshh) {
        for (int i = 0; i < dshh.size() - 1; i++) {
            for (int j = i + 1; j < dshh.size(); j++) {
                if (dshh.get(i).getDonGia() < dshh.get(j).getDonGia()) {
                    HangHoa temp = dshh.get(i);
                    dshh.set(i, dshh.get(j));
                    dshh.set(j, temp);
                }
            }
        }
        return dshh;
    }

    public HangHoa soLuongLonNhat(List<HangHoa> dshh) {
        if (dshh.isEmpty()) return null;
        HangHoa h=dshh.get(0);
        for(int i=0;i<dshh.size()-1;i++){
            if(dshh.get(i).getSl()>h.getSl())
                h=dshh.get(i);
        }
        return h;
    }

}
