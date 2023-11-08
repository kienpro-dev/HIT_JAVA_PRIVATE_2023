# Buổi 5

## 1. Static và final

- Static: Trong Java, từ khóa "static" được sử dụng để khai báo một thành phần (biến hoặc phương thức) thuộc về lớp chứ không thuộc về các thể hiện cụ thể của lớp đó. Điều này có nghĩa là khi một biến hoặc phương thức được khai báo là static, chúng có thể được truy cập thông qua tên lớp mà không cần tạo ra một thể hiện của lớp đó.
    - Biến static (static variables)
    - Phương thức static (static methods)
    - Khối static (static blocks)
    - Lớp static (static class)

- Final: Khi một biến được khai báo là "final", giá trị của biến đó không thể thay đổi sau khi đã được gán một lần. Điều này có nghĩa là biến final chỉ có thể được gán giá trị một lần và sau đó không thể thay đổi nữa.


```java
public class MathUtils {
    public static final double PI = 3.14159;  // Biến static final - hằng số PI
    public static int counter = 0;           // Biến static đếm số lượng thể hiện đã được tạo
    
    public MathUtils() {
        counter++;
    }
    
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println(MathUtils.PI);     // Truy cập biến static final PI thông qua tên lớp
        System.out.println(MathUtils.add(5, 3));  // Gọi phương thức static add
        System.out.println(MathUtils.counter);    // Truy cập biến static counter
        
        MathUtils utils1 = new MathUtils();
        MathUtils utils2 = new MathUtils();
        System.out.println(MathUtils.counter);    // In ra số lượng thể hiện đã được tạo
    }
}

```

- Biến static: được sử dụng làm thuộc tính chung, để dùng chung dữ liệu cho tất cả objects (hoặc instances ) của lớp đó và điều đó giúp cho chương trình tiết kiệm bộ nhớ hơn

```java
public class Counter {
    private static int count = 0; 
 
    public Counter() {
         
    }
     
    public void visit() {
        count++;
        this.print();
    }
     
    public void print() {
        System.out.println("count = " + count);     
    }
 
    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.visit();
        Counter c2 = new Counter();
        c2.visit();
        Counter c3 = new Counter();
        c3.visit();
    }
}
```

- Đặc điểm phương thức static: 
    - Một phương thức static thuộc lớp chứ không phải đối tượng của lớp.
    - Một phương thức static có thể được gọi mà không cần tạo khởi tạo (instance) của một lớp.
    - Phương thức static có thể truy cập biến static và có thể thay đổi giá trị của nó.
    - Một phương thức static chỉ có thể gọi một phương thức static khác, không thể gọi được một phương thức non-static.
    - Một phương thức static không thể được sử dụng từ khóa this và super.
    - Người dùng không thể override (đè) phương thức static trong Java

- Khi nào cần dùng phương thức static:
    - Khi phương thức không phụ thuộc vào trạng thái của đối tượng, nghĩa là không cần sử dụng bất kỳ dữ liệu thành viên nào của đối tượng, mọi thứ được truyền như các tham số (parameter).
    - Các phương thức tiện ích là một trường hợp thường được sử dụng nhất trong Java vì chúng có thể được truy cập trực tiếp bằng tên lớp mà không cần tạo bất thể hiện nào. Lớp java.lang.Math là một ví dụ trường hợp sử dụng static method.

- Đặc điểm của khối static:
    - Khối static được dùng để khởi tạo hoặc thay đổi giá trị của các biến static.
    - Nó được thực thi trước phương thức main tại thời gian tải lớp.
    - Một class có thể có nhiều static blocks.

```java
public class Test {
     
    private static String subject;
     
    static {
        System.out.println("Khối static được gọi");
    }
     
    static {
        subject = "Khối static (static blocks)";
    }
     
    Test () {
        System.out.println("hàm main() được gọi");
        System.out.println("Subject = " + subject);
    }
     
    public static void main(String[] args) {
        Test ex1 = new Test();
    }
}

```

- Đặc điểm của lớp static: Một class được có thể được đặt là static chỉ khi nó là một nested class (tức nằm trong một lớp khác). Một nested static class có thể được truy cập mà không cần một object của outer class (lớp bên ngoài).

```java
public class Test1 {
    private String subject;
     
    Test1 (String subject) {
        this.subject = subject;
    }
     
    // nested static class
    static class Test2 {
        public static String WEBSITE = "hit.haui.com";
    }
     
    public void print() {
        System.out.println("Subject = " + subject);
        System.out.println("Website = " + Test2.WEBSITE);
    }
     
    public static void main(String[] args) {
        Test1 ex1 = new Test1("Core Java");
        ex1.print();
    }
```


## 2. Nạp chồng phương thức( Method Overloading)

- Nạp chồng phương thức cho phép bạn định nghĩa nhiều phương thức cùng tên trong cùng một lớp, nhưng có tham số khác nhau (kiểu tham số hoặc số lượng tham số).

```java
public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    
    public double add(double a, double b) {
        return a + b;
    }


    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(5, 3));       // Gọi phương thức int add(int a, int b)
        System.out.println(calculator.add(2.5, 3.5));   // Gọi phương thức double add(double a, double b)
    }
}
```

## 3. Quan hệ HAS-A (Sở hữu một...)

- Quan hệ HAS-A xuất hiện khi một đối tượng chứa một thể hiện của một lớp khác như một thành viên của nó (Nó tương tự như kết tập trong c++ nếu bạn nào đã học OOP C++).

``` java

public class Engine {
    private String type;
    
    public Engine(String type) {
        this.type = type;
    }
    
    public void start() {
        System.out.println("Engine started");
    }
}

public class Car {
    private String brand;
    private Engine engine; // Quan hệ HAS-A với động cơ

    public Car(String brand, String engineType) {
        this.brand = brand;
        this.engine = new Engine(engineType);
    }
    
    public void startCar() {
        System.out.println("Starting the " + brand + " car");
        engine.start(); // Gọi phương thức của đối tượng động cơ
    }
}

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Gasoline");
        car.startCar();
    }
}


```

## 4. Mảng đối tượng

- Mảng đối tượng trong java cho phép khởi tạo và lưu trữ 1 danh sáhc gồm nhiều đối tượng của 1 lớp.


``` java


public class Student {
    private String name;
    
    public Student(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
}

public class School {
    public static void main(String[] args) {
        Student[] students = new Student[3]; // Tạo mảng chứa các đối tượng Student
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        
        for (Student student : students) {
            System.out.println("Student name: " + student.getName());
        }
    }
}

