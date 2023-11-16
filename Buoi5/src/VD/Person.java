public class Person {
     private String name;
     private int age;
     private String address;
//    protected String name;

    public Person() {
    }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void in() {
        System.out.println("Person");
    }
}

