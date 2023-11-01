package objects;

public class SinhVien {
    private final String MSV = "0";
    private final String TEN = "NO_NAME";

    private String msv;
    private String ten;

    public SinhVien() {
        this.msv = MSV;
        this.ten = TEN;
    }

    public SinhVien(String msv, String ten) {
        this.msv = msv;
        this.ten = ten;
    }

    public SinhVien(SinhVien a) {
        this.msv = a.msv;
        this.ten = a.ten;
    }

    public String getMsv() {
        return this.msv;
    }

    public String getTen() {
        return this.ten;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

//    public SinhVien setMsv(String msv) {
//        this.msv = msv;
//        return this;
//    }

    public void display() {
        System.out.println("MSV: " + msv);
        System.out.println("Ten: " + ten);

    }

    public void input() {

    }

    public double tinhDiem() {
        return 10;
    }


}
