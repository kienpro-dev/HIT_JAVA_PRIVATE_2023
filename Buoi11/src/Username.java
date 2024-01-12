public class Username {
    private String name;

    private int age;

    public Username(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
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
