import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Supplier;
import java.util.regex.Pattern;
import java.util.stream.*;

public class StreamAPI {
  //sử dung tính chất đa hình vì classs ArrayList implement từ interface List
  List<Integer> numbers = Arrays.asList(4, 1, 5, 6, 7, 9);


  public void withoutStream() {
    long count = 0;
    for (Integer num : numbers) {
      if (num % 2 == 0) count++;
    }
    System.out.printf("Số phần tử chẵn trong list : %d", count);
  }

  public void withStream() {
    long count = numbers.stream().filter(item -> item % 2 == 0).count();
    System.out.printf("Số phần tử chẵn trong list : %d", count);
  }

  private static List<SinhVien> students = new ArrayList<>();

  //Sử dụng khối Static : Để khởi tạo thành viên dữ liệu static
  static {
    students.add(new SinhVien("Nguyen Van A", "1", 20, "Thanh Hoa"));
    students.add(new SinhVien("Nguyen Thi B", "2", 16, "Ha noi"));
    students.add(new SinhVien("Le Thi C", "3", 18, "Hai Phong"));
    students.add(new SinhVien("Trinh Van B", "4", 21, "Bac Giang"));
    students.add(new SinhVien("Tran Thi D", "5", 22, "Dong Nai"));
  }

  //Create stream with other structure

  //Tạo Stream từ Arrays
  public static void streamFromArray() {
    String[] languages = {"Java", "C#", "JavaScript"};

    //Lấy ra stream sử dụng Arrays.stream
    Stream<String> testStream1 = Arrays.stream(languages);
    testStream1.forEach(x -> System.out.print(x + " "));
  }

  //Tạo Stream từ Collections : ArrayList
  public static void streamFromCollection() {
    ArrayList<String> items = new ArrayList<>();
    items.add("Java");
    items.add("C++");
    items.add("PHP");
    items.stream().forEach(item -> System.out.print(item + " "));
  }

  //Tạo Stream sử dụng Stream.generate()
  public static void streamUsingGenerate() {
    Stream<String> stream = Stream.generate(() -> "Hello").limit(3);
    String[] arrays = stream.toArray(String[]::new);
    System.out.println(Arrays.toString(arrays));
  }

  //Tạo Stream từ APIS như Regex
  public static void streamUsingRegex() {
    String str = "Welcome,to,VietNam";
    Pattern.compile(",").splitAsStream(str).forEach(System.out::print);
  }

  //Lấy ra collections sử dụng stream.collect(Collections.toList());
  public static void getCollectionUsingStreamCollection() {
    Stream<String> stream = Stream.of("Java", "C++", "PHP");
    ArrayList<String> items = (ArrayList<String>) stream.collect(Collectors.toList());
    System.out.println(items);
  }

  //Lấy ra arrays sử dụng stream.toArray(EntryType[]::new)
  public static void getArraysStreamCollection() {
    Stream<String> stream = Stream.of("Java", "C++", "PHP");
    String[] languaes = stream.toArray(String[]::new);
    System.out.println(Arrays.toString(languaes));
  }

  public static void main(String[] args) {

    //StreamAPI.SinhVien has age >= 20 and limit 2 student
    int limit = 2, counter = 0;
    List<SinhVien> test = new ArrayList<>();

    for (SinhVien st :
        students) {
      if (st.getAge() >= 20) {
        counter++;
        test.add(st);
        if (counter == limit) {
          break;
        }
      }
    }
    test.forEach(s -> {
      System.out.println(s.getName() + "  " + s.getMsv() + "  " + s.getAge() + "  " + s.getAddress());
    });


    //Su dung stream api
    students.stream().
        filter(b -> b.getAge() >= 20).
        limit(2).
        collect(Collectors.toList()).
        forEach(s -> {
          System.out.println(s.getName() + "  " + s.getMsv() + "  " + s.getAge() + "  " + s.getAddress());
        });


    //Sử dụng Stream cho những kiểu primitive
    IntStream.range(1, 5).forEach(item -> System.out.print(item + " "));//1 2 3 4

    IntStream.of(1, 2, 3).forEach(item -> System.out.print(item + " "));// 1 2 3

    DoubleStream.of(1, 2, 3).forEach(item -> System.out.print(item + " "));//1.0 2.0 3.0

    LongStream.range(1, 4).forEach(item -> System.out.print(item + " "));//1 2 3

//    getArraysStreamCollection();
//    exampleStreamMap();
//    streamSortedExample();
//    findMinMax();
//    testReduceMethod();
//
//
    //Sự khác biệt giữa parallelStream (luồng song song) và single stream (luồng tuần tự )
    List<String> strings = Arrays.asList("20", "years old", "...");

    String streamString = strings.stream().reduce(" I'm-", String::concat);

    String parallelString = strings.parallelStream().reduce(" I'm-", String::concat);
    System.out.println("Stream: " + streamString + "\nParallelStream: " + parallelString);


    //Lỗi khi chạy lại 2 luồng stream giống nhau
    Stream<String> stream = Stream.of("Java", "C#", "C++", "PHP", "Javascript") //
        .filter(s -> s.startsWith("J"));

    stream.anyMatch(s -> true); // ok
    stream.noneMatch(s -> true); // exception

    //cách giải quyết lỗi
    Supplier<Stream<String>> streamSupplier = () -> Stream.of("C#", "Javascript") //
        .filter(s -> s.startsWith("J"));

    streamSupplier.get().anyMatch(s -> true);//ok
    streamSupplier.get().anyMatch(s -> true);//ok
  }

  // Ví dụ sử dụng để lọc các số chia hết cho 2
  public static void useFilter() {
    ArrayList<Integer> numbers = (ArrayList<Integer>) Arrays.asList(1, 3, 2, 4, 5);
    numbers.stream().filter(number -> number % 2 == 0).
        forEach(item -> System.out.print(item + " "));//2 4
  }

  //Ví dụ về Stream limmit() và skip()
  public static void exampleStream() {
    ArrayList<String> strings = (ArrayList<String>) Arrays.asList("JAVA", "C#", "C++", "PHP");
    strings.stream()
        .skip(1)//Bỏ qua phần tử đầu tiên JAVA
        .limit(2)//Chỉ lấy 2 phần tử sau phần tử bỏ qua.
        .forEach(item -> System.out.print(item + " "));//C# , C++
  }

  public static void exampleStreamMap() {
    List<String> strings = Arrays.asList("java", "c#", "c++", "php");
    strings.stream()
        .map(item -> item = item.toUpperCase(Locale.ROOT))
        .forEach(item -> System.out.print(item + " "));//JAVA C# C++ PHP
  }


  public static int compare(int a, int b) {
    return b - a;
  }

  // Sử dụng stream sorter
  public static void streamSortedExample() {
    List<Integer> numbers = Arrays.asList(1, 2, 4, 3);
    long cnt = numbers.stream()
        .filter(n -> n > 1)
        .count();//đếm số phần tử lớn hơn 1
    System.out.println(cnt);


    //Mặc định là sắp xếp tăng dần
    numbers.stream()
        .sorted()
        .forEach(item -> System.out.print(item + " "));// 1 2 3 4
    System.out.println();
    //Sắp xếp giảm dần
    numbers.stream()
        .sorted((a, b) -> b - a)
        .forEach(item -> System.out.print(item + " "));//4 3 2 1

    //sorted((a-b) -> b - a) tương đương với 2 vòng for sắp xếp và điều kiện sắp xếp như hàm compare định nghĩa ở trên

//cách sắp xếp như bình thường
    for (int i = 0; i < numbers.size() - 1; i++) {
      for (int j = i; j < numbers.size(); j++) {
        if (compare(numbers.get(i), numbers.get(j)) > 0) {
          int item = numbers.get(i);
          numbers.set(i, numbers.get(j));
          numbers.set(j, item);
        }
      }
    }
    System.out.println(numbers);
    //Sap xep mang String
    List<String> strings = Arrays.asList("java", "c#", "c++", "php");
    strings.stream()
        .sorted()
        .forEach(item -> System.out.print(item + " "));

    strings.stream()
        .sorted((s1, s2) -> s2.compareTo(s1))//Dựa trên nguyên tắc hàm compare
        .forEach(item -> System.out.print(item + " "));//JAVA C# C++ PHP
    /*  -1 : s1 < s2
        0 : s1 == s2
       +1 : s1 > s2
    */
  }

  //Test phương thức any Match , allMatch và noneMatch
  public static void test3Method() {

    List<String> strings = Arrays.asList("java", "c#", "c++", "php");
    boolean result1 = strings.stream().anyMatch(s -> s.equals("java"));
    boolean result2 = strings.stream().allMatch(s -> s.equals("java"));
    boolean result3 = strings.stream().noneMatch(s -> s.equals("java"));
    System.out.println(result1);//true
    System.out.println(result2);//false
    System.out.println(result3);//false

  }

  //Map : ánh xạ thành viên dữ liệu
  public static void testMethodMap() {
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4);
    //map(i -> i*2) : ánh xạ các phần tử của list , tương ứng mỗi một phần tử sẽ tăng lên 2 lần
    numbers.stream().map(i -> i * 2).forEach(i -> System.out.print(i + " "));//2 4 6 8
  }

  public static void testMethodIterate() {
    //iterate : là một phương thức cho phép ta có thể lặp lại các phần tử trong luồng cho đến khi gặp điều kiện chỉ định
    /*
      Cú pháp : static <T> Stream <T> iterate(T seed , Predicate<T> hasNext , UnaryOperator<T> next)
       seed : Phần tử đầu tiên
       hasNext : điều kiện dừng
       next : phần tử tiếp theo sau phần tử trước được sinh ra
     */
    Stream<Integer> stream = Stream.iterate(1, i -> i <= 20, i -> i * 2);
    Stream<Integer> nums = Stream.iterate(0, count -> count + 1).limit(6);
    nums.forEach(System.out::println);
  }

  //Sử dụng collect()
//Phương thức collect() giups thu thập kết quả Stream sang 1 Collection khác
  public static void coverStreamToList() {
    Stream<String> stream = Stream.of("Java", "C++", "PHP", "Java Script");
    List<String> languages = stream.collect(Collectors.toList());
    System.out.println(languages);
  }

  //Phương thức reduce()
  public static void testReduceMethod() {

    Integer result = IntStream.of(1, 2, 3, 4).reduce((a, b) -> a + b).getAsInt();
    System.out.println(result);//10

    Integer result1 = IntStream.of(1, 2, 3, 4).reduce(1, (a, b) -> a + b);
    System.out.println(result1);//11

  }
}