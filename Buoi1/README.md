# Buổi 1

## Tổng quan về ngôn ngữ Java

- Java là ngôn ngữ lập trình hướng đối tượng, cú pháp minh bạch rõ ràng, dễ tiếp cận đối với những ai bắt đầu học lập trình.
- Java hỗ trợ đa nền tảng, được sử dụng rộng rãi để phát triển ứng dụng mobile, ứng dụng web, server ...
- Với cộng đồng sử dụng lớn nên Java hỗ trợ nhiều thư viện, framework và công cụ tối ưu trong quá trình học tập và làm việc.

## Cấu trúc chương trình Java

- Cách một chương trình Java hoạt động:

  - Mỗi chương trình có một phương thức main
  - Khi đoạn mã Java được thực thi sẽ tìm đến phương thức main này và chạy chương trình
  - Mỗi chương trình Java chỉ được phép có 1 main duy nhất

- Ví dụ cơ bản về 1 chương trình chạy bằng ngôn ngữ Java

```java
    public class CodeBuoi2 {
        public static void main(String[] args) {
            System.out.println("Hello World!");
        }
    }
```

## Xuất, nhập dữ liệu, biến, kiểu dữ liệu, ép kiểu

1. Xuất dữ lêu

```java
    System.out.println("Hello World!");
    System.out.println("Hello " + "World!");
    System.out.println("Hello " + 18);
    System.out.println(1 + 1);
```

```java
    System.out.print("Hello ");
    System.out.print("World!");
```

```java
    System.out.printf("Hello %d %s", 18, "World!");
```

2. Biến, kiểu dữ liệu, ép kiểu

- Biến thường dùng để lưu trữ hay đại diện cho một giá trị nào đó
- Biến được gắn liền với kiểu dữ liệu

  - Kiểu số nguyên: int, long, short, ...
  - Kiểu số thực: float, double, ...
  - Kiểu kí tự: char
  - Kiểu luận lý: boolean

- Kiểu chuỗi: sử dụng lớp String

```java
    int a = 10;
    float b = 9.5;
    char c = 'x';
    boolean d = false;
    String s = "Hello world!";

    int e = (int) 10.2;
    float f = (float) 10;
```

3. Nhập dữ liệu

- Sử dụng Scanner có sẵn trong Java, khai báo 1 đối tượng Scanner để nhập dữ liệu cho các biến

```java
    Scanner s = new Scanner(System.in)
    int a = s.nextInt();
    double b = s.nextDouble();
    String s1 = s.next();
    String s2 = s.nextLine();
```

## Quy tắc đặt tên biến trong Java

- Tên biến không có khoảng trắng và ký tự đặc biệt
  - Sai: int h% h;
  - Đúng: int hh;
- Tên biến không được bắt đầu bằng số
  - Sai: float 2h;
  - Đúng: float h2;
- Tên biến không được trùng nhau
- Tên biến không trùng các từ khóa trong ngôn ngữ
 - Sai: int int; 
 - Đúng: int intt;
  ...

## Các phép toán, toán tử trong Java

- Các phép toán toán học: + - \* / % 
- Toán tử gán: = += -= *= /=
- Các toán tử logic: && || !
- Các toán tử so sánh: > < == != >= <=
- Toán tử 3 ngôi: ?:

## Rẽ nhánh

- Sử dụng câu lệnh: if, else, else if hoặc switch case để thực hiện rẽ nhấnh chương trình

```java
    int a = 5;
    int b = 5;
    if(a > b) {
        System.out.println("a lớn hơn b");
    } else if(a < b) {
        System.out.println("a nhỏ hơn b");
    } else {
        System.out.println("a bằng b");
    }

    // System.out.println(a > b ? "a lớn hơn b" : a < b ? "a nhỏ hơn b" : "a bằng b");
```

## Vòng lặp

- Java hỗ trợ while, do while và for để sử dụng vòng lặp

```java
    for(int i = 0; i < 5; i++) {
        System.out.println(i);
    }

    int j = 0;
    while(j < 5) {
        System.out.println(j);
        j++;
    }

    do {
        System.out.println(j);
        j--;              
    } while(j > 0);

```

- Nguyên lý hoạt động của for:
    - B1: khởi tạo biến lặp 
    - B2: so sánh biến với giá trị cho trước, nếu sai thì dừng lặp 
    - B3: Thực hiện code bên dưới 
    - B4: Thay đổi biến lặp (i++), quay lại bước 2

- Nguyên lý hoạt động của while: 
    - kiểm tra điều kiện trước, lặp cho đến khi điều kiện sai 
- Nguyên lý hoạt động của do while: 
    - thực hiện lệnh bên trong do trước
    - kiểm tra điều kiện, lặp cho đến khi điều kiện sai 

- do while khác while ở chỗ là do while có thể thực thi lệnh ít nhất 1 lần