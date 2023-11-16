public class SinhVien {
    private int id;
    private String name;

    public SinhVien(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
