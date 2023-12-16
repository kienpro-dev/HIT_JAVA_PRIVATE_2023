import java.util.*;

public class RunMain {
    List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
    @FunctionalInterface
    interface Max {
        abstract int max(int a, int b);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
//        Collections.sort(list, (a, b) -> b - a);
//        list.sort((a, b) -> a - b);
        System.out.println(list);
        list.stream().filter(x -> x % 2 == 0)
                .sorted((a , b) ->  b - a)
                .forEach(System.out::println);
        System.out.println(list);
//        Max x = (a, b) -> (a > b ? a : b);
//
//        System.out.println(x.max(10, 5));
//        int a = 0;
//        list.forEach(x -> {
//            if(x % 2 == 0) {
//                list.set(list.indexOf(x), 10);
//            }
//        });
//        System.out.println();
//        RunMain a = new RunMain();
//        a.test();

    }

    public void test() {
        list.forEach(x -> {
            if(x % 2 == 0) {
                list.set(list.indexOf(x), 10);
            }
            System.out.println(this.toString());
        });
    }

    @Override
    public String toString() {
        return "RunMain";
    }
}
