public class SinhVien {

    private String name;

    private String msv;

    private int age;

    private String address;

    public SinhVien() {
    }

    public SinhVien(String name , String msv, int age, String address) {
      this.name = name;
      this.msv = msv;
      this.age = age;
      this.address = address;
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

    public String getMsv() {
      return msv;
    }

    public void setMsv(String msv) {
      this.msv = msv;
    }

    public int getAge() {
      return age;
    }

    public void setAge(int age) {
      this.age = age;
    }

    public String getAddress() {
      return address;
    }

    public void setAddress(String address) {
      this.address = address;
    }
  }