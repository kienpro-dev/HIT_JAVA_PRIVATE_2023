import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        ArrayList<Object> a = new ArrayList<>();
//        a.add(1);
//        a.add(2);
//        IntegerService s = new NumberServiceImpl(a);
//        s.nhapSo(6);
//        s.nhapSo(5);
//        s.hienThiList();
//
//        System.out.println("\n" + s.timSo(7));
//
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.forEach(System.out::println);
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.addFirst(5);
        list.add(5);



        Dog a = new Dog("Test", 5);
        Animal b = (Animal) a;
        b.out();
    }
}
