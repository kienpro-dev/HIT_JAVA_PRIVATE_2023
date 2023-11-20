package BaiTapTrenLop.Bai2;

public class CMND {
    private String so;
    private String capTai;

    public CMND() {
    }

    public CMND(String so, String capTai) {
        this.so = so;
        this.capTai = capTai;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public String getCapTai() {
        return capTai;
    }

    public void setCapTai(String capTai) {
        this.capTai = capTai;
    }

    @Override
    public String toString() {
        return "So CMND: " + so + ", Cap tai: " + capTai;
    }
}
