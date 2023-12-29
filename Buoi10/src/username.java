public class username {
    private String name;

    private int age;

    public username(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "username{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
