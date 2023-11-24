public class Dog extends Animal{
    private int weight;

    public Dog(String name, int weight) {
        super(name);
        this.weight = weight;
    }

    @Override
    public void out() {
        System.out.println(weight + name);
    }

    public void out2() {
        System.out.println(weight + name);
    }
}
