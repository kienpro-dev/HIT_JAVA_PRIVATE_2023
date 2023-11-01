# Buổi 3

## Giới thiệu OOP trong Java

- Lập trình hướng đối tượng (OOP) là phương pháp lập trình cho phép tạo ra các đối tượng (objects) thông qua các lớp (class)
  giúp code dễ phát triển và bảo trì trong tương lai, tập trung vào các thực thể giống như trong thực tế hơn.
  VD: nhà cửa, xe cộ, …

- Đối tượng (Object): bao gồm 2 thông tin: thuộc tính và phương thức.

* Thuộc tính (attribute): là các biến được sử dụng để lưu trữ những thông tin, đặc điểm của đối tượng. Họ tên, tuổi, địa chỉ, …
* Phương thức (method): chính là các hàm được sử dụng để thực hiện các hành động của đối tượng đó. Ăn, ngủ, đi chơi, …

- Lớp (Class): là nơi định nghĩa các thông tin trên của đối tượng, có thể hiểu như là kiểu dữ liệu do chúng ta tự định nghĩa

![alt text](https://4.bp.blogspot.com/-YDN3HuXGY1g/WUpxo02n6iI/AAAAAAAAAE0/-5hQn9VZVL4s9bYhyyobfcFZKWxxIIEzACLcBGAs/s1600/cars.jpg)

```java
    class Car {
        // Các thuộc tính (attributes)
        String name;
        int year;
        String description;

        // Các phương thức (methods)
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Year: " + year);
            System.out.println("Description: " + description);
        }
    }

    public class Buoi4 {
        public static void main(String[] args) {
            Car car = new Car();
        }
    }
```

## Package

- Hiểu đơn giản là package (gói) trong java là 1 folder chứa code, chứa các Class tương tự nhau

![alt text](https://xuanthulab.net/photo/package-4223.jpg)

```java
    package sample;

    public class Vehicle {
        //Code here

    }
```

## Phạm vi truy cập

![alt text](https://images.viblo.asia/82aaeb1f-5154-4dc5-9cf1-91b9b3fd8e9b.png)

```java
    public class Student {
        // Thuộc tính của đối tượng nên để phạm vi private
        private String name;
        private int age;

        // Phương thức của đối tượng nên để phạm vi public
        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }
```

## Constructor

- Hay còn được gọi là hàm tạo, sử dụng để khởi tạo 1 đối tượng của lớp đó thông qua từ khóa 'new' với các thuộc tính mà người dùng khai báo

```java
    public class Student {

        public Student() {

        }
    }
```

- Lưu ý:

* Hàm tạo phải có tên trùng tên class và để phạm vi truy cập public
* Hàm tạo sẽ được tự động gọi đến khi khởi tạo đối tượng qua từ khóa 'new'
* Có thể có nhiều hàm tạo
* Nếu không có hàm tạo thì chương trình sẽ tự động tạo ra hàm tạo không tham số

```java
    public class Student {
        private String name;
        private int age;

        public Student() {

        }

        public Student(String name2, int age2) {
            name = name2;
            age = age2;
        }
    }

    public class Buoi4 {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Nguyen Kien", 17);
        }
    }
```

## Getters, setters

- Được sử dụng để thao tác với các thuộc tính của đối tượng 1 cách gián tiếp, đảm bảo tính đóng gói của đối tượng

```java
    public class Student {
        private String name;
        private int age;

        public Student() {

        }

        public Student(String name2, int age2) {
            name = name2;
            age = age2;
        }

        public String getName() {
            return name;
        }

        public String getAge() {
            return age;
        }

        public void setName(String name2) {
            name = name2;
        }

        public void setAge(int age2) {
            age = age2;
        }

        public void display() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
    }

    public class Buoi4 {
        public static void main(String[] args) {
            Student s1 = new Student();
            Student s2 = new Student("Nguyen Kien", 17);

            s1.setName("Nguyen Van A");
            s1.setAge(10);

            s1.display();

            System.out.println("Name: " + s2.getName());
            System.out.println("Age: " + s2.getAge());
        }
    }
```


## Con trỏ ‘this’

- Trong Java, từ khóa "this" tham chiếu đến thể hiện của lớp đang thực thi, cho phép truy cập vào các thành viên (biến và phương thức) của thể hiện đó.


```java
public class Person {
    private String name;
    
    public Person(String name) {
        this.name = name; // Gán giá trị tham số name cho biến name của thể hiện đang được tạo
    }
    
    public void printName() {
        System.out.println("My name is " + this.name); // Sử dụng biến name của thể hiện hiện tại
    }


    public static void main(String[] args) {
        Person person = new Person("Alice");
        person.printName();
    }
}

```


## Bài tập và cách phân tích 1 sơ đồ lớp

- Bài 1: Thiết kế lớp Account có thông tin sau:

![alt text](https://codelearnstorage.s3.amazonaws.com/Media/Default/Users/TuanLQ7/Cpp_OOP/Main-3.png)

- Account là lớp dùng để mô tả thông tin về các tài khoản ngân hàng.
- id, name và balance lần lượt là các thuộc tính chỉ số tài khoản, tên chủ tài khoản và số dư trong tài khoản.
- Account(id: int, name: String) và Account(id: int, name: String, balance: int) là các phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính tương ứng.
- getId(), setName(), getName(), getBalance() là các setter, getter.
- deposit(amount: int) là phương thức dùng để gửi tiền vào tài khoản 1 lượng có giá trị là amount (balance += amount).
- withdraw(amount: int) là phương thức dùng để rút tiền từ tài khoản 1 lượng có giá trị là amount (balance -= amount). Nếu số dư trong tài khoản không đủ (balance < amount) thì không thực hiện rút tiền và hiển thị ra màn hình:
```
    That amount exceeds your current balance.​
```
- display() là phương thức dùng để hiển thị ra màn hình thông tin tài khoản. Ví dụ nếu id = 1000, name = "Tuan", balance = 2490 thì khi gọi phương thức display() màn hình sẽ hiển thị ra:
```
    Id: 1000
    Name: Tuan
    Balance: 2490​
```
- Bài 2: Thiết kế lớp Time có thông tin sau:

![alt text](https://scontent.fhan12-1.fna.fbcdn.net/v/t1.15752-9/371458392_842938117480608_7414262609246147306_n.png?_nc_cat=101&ccb=1-7&_nc_sid=8cd0a2&_nc_eui2=AeH0-EXgnbIc1mCFo30fejnTL5t_EHOdzvQvm38Qc53O9BMyUTzYsmtL0R9Y28dU0C4PDEq3v3RMJHWQJj66TOl_&_nc_ohc=_5U2Y21HcNUAX-qGlFR&_nc_ht=scontent.fhan12-1.fna&oh=03_AdSV9Kp-bM_3TG8rEJEzE6H7XEEjDmMeYF0UilV-JZcVGw&oe=6569AB5B)

- Time là lớp được dùng để lưu thông tin về giờ, phút, giây.
- hour, minute, second lần lượt là các thuộc tính chỉ giờ, phút, giây của lớp Time.
- Time(hour: int, minute: int, second: int) là phương thức khởi tạo có tham số dùng để khởi tạo giá trị cho các thuộc tính.
- setTime(hour: int, minute: int, second: int) là phương thức dùng để thay đổi giá trị của các thuộc tính hour, minute, second.
- nextSecond() là phương thức tăng thời gian của đối tượng lên 1 giây Ví dụ:
- previousSecond() là phương thức giảm thời gian của đối tượng đi 1 giây.
- display() là phương thức dùng để hiển thị ra màn hình thông tin về thời gian của đối tượng dưới định dạng "HH:mm:ss". 