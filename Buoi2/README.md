# Buổi 2

## Mảng trong java

- Thông thường, mảng (array) là một tập hợp các phần tử có cùng kiểu được lưu trữ gần nhau trong bộ nhớ.

- Mảng trong java là một đối tượng chứa các phần tử có kiểu dữ liệu giống nhau. Mảng là một cấu trúc dữ liệu nơi lưu trữ các phần tử giống nhau. Với mảng trong java chúng ta chỉ có thể lưu trữ một tập các phần tử có số lượng phần tử cố định.

- Mảng trong java lưu các phần tử theo chỉ số, chỉ số của phần tử đầu tiên là 0.

```java
    	// Khai báo mảng kiểu int có 5 phần tử
       int[] numbers = new int[5];

       // Khai báo và khởi tạo mảng ngay từ đầu
       int[] primes = {2, 3, 5, 7, 11};

       // Truy cập phần tử trong mảng
       int firstNumber = numbers[0]; // Lấy phần tử đầu tiên của mảng numbers

       // Thay đổi giá trị của phần tử
       primes[2] = 13; // Giá trị 5 được thay đổi thành 13

       // Duyệt mảng bằng vòng lặp for
	for (int i = 0; i < primes.length; i++) {
              System.out.println(primes[i]);
       }

	// Duyệt mảng bằng vòng lặp for-each
	for (int prime : primes) {
      	       System.out.println(prime);
       }
```

## Hàm và hằng trong Java

1. Hàm
- Hàm trong Java là một khối mã thực hiện một nhiệm vụ cụ thể và có thể được gọi từ bất kỳ đâu trong chương trình. Dưới đây là một ví dụ về hàm tính giai thừa:

- Hàm tính giai thừa

```java
      int factorial(int n) {
       if (n == 0 || n == 1) {
      	       return 1;
       } else {
     		return n * factorial(n - 1);
       }
      }
       // Gọi hàm và lấy kết quả
      int result = factorial(5); // Kết quả: 120
```

- Hàm kiểm tra số nguyên tố

```java
	// Hàm kiểm tra số nguyên tố
       boolean isPrime(int n) {
    		if (n <= 1) {
        		return false;
    		}
    		for (int i = 2; i <= Math.sqrt(n); i++) {
        		if (n % i == 0) {
            		return false;
        		}
   		}
   		return true;
       }

	// Gọi hàm và lấy kết quả
	boolean primeCheck = isPrime(17); // Kết quả: true
```

- Sự khác biệt giữa hàm có static và không có static: 
- Hàm không có static
       - Các hàm này được gọi trên các đối tượng của lớp, nghĩa là cần tạo một đối tượng của lớp đó trước khi gọi hàm. 
- Hàm có static 
       - Các hàm này được gọi trực tiếp từ lớp mà không cần tạo đối tượng của lớp.

2. Hằng
   Hằng là một biến không thay đổi giá trị sau khi được gán, thường được khai báo với từ khóa final:

```java
    public class TimeConstants {
       public static final int SECONDS_IN_MINUTE = 60;
       public static final int MINUTES_IN_HOUR = 60;
       public static final int HOURS_IN_DAY = 24;
    }

       // Sử dụng hằng số trong chương trình
	 int secondsInADay = TimeConstants.SECONDS_IN_MINUTE * 	TimeConstants.MINUTES_IN_HOUR * TimeConstants.HOURS_IN_DAY;
       System.out.println("Số giây trong một ngày: " + secondsInADay);
```

3. Thư viện toán học Math

- Thư viện Math trong Java cung cấp các hàm toán học cơ bản như:

```java
    	double x = 3.0;
       double y = 4.0;

       // Tính căn bậc hai
       double squareRoot = Math.sqrt(x);
       // Kết quả: 1.732...

       // Tính lũy thừa
       double power = Math.pow(x, y);
       // Kết quả: 81.0

       // Tính giá trị tuyệt đối
       double absoluteValue = Math.abs(-10.5);
       // Kết quả: 10.5

       // Làm tròn số thực
       double roundedValue = Math.round(7.85);
       // Kết quả: 8

       // Làm tròn lên (ceiling) và làm tròn xuống (floor)
       double ceilingValue = Math.ceil(7.2);
       // Kết quả: 8.0
       double floorValue = Math.floor(7.8);
       // Kết quả: 7.0
```

- Các hàm trigonometric như:

```java
double angleInRadians = Math.toRadians(30);
// Chuyển đổi từ độ sang radian

// Tính sin, cos, tan
double sineValue = Math.sin(angleInRadians);
double cosineValue = Math.cos(angleInRadians);
double tangentValue = Math.tan(angleInRadians);

// Tính arcsin, arccos, arctan
double arcsineValue = Math.asin(sineValue);
double arccosineValue = Math.acos(cosineValue);
double arctangentValue = Math.atan(tangentValue);
```

- Hàm random:

```java
// Sinh số ngẫu nhiên từ 0 đến 1
double randomValue = Math.random(); //
// Kết quả: giá trị ngẫu nhiên từ 0 (bao gồm) đến 1 (không bao gồm)
```

- Ví dụ về hàm logarithm và exponential:

```java
double value = 5.0;

// Tính logarithm cơ số 10
double logBase10 = Math.log10(value);
// Kết quả: 0.69897...

// Tính logarithm cơ số e: ln
double naturalLog = Math.log(value);
// Kết quả: 1.60943...

// Tính e mũ x
double ePowerX = Math.exp(value);
// Kết quả: 148.413...
```

- Nhớ rằng lớp Math trong Java cung cấp nhiều hàm toán học mạnh mẽ, giúp bạn thực hiện các phép tính phức tạp trong chương trình của mình.

## Lớp String

- Lớp String trong Java là một cách mạnh mẽ để làm việc với chuỗi ký tự

- Lớp String trong java cung cấp rất nhiều các phương thức để thực hiện các thao tác với chuỗi như: compare(), concat(), equals(), split(), length(), replace(), compareTo(), intern(), substring(), ...

```java

       // Khai báo và nối chuỗi
       String firstName = "John";
       String lastName = "Doe";
       String fullName = firstName + " " + lastName;
       String fullNameConcat = firstName.concat(" ").concat(lastName);

       // So sánh chuỗi
       String str1 = "Hello";
       String str2 = "World";
       String str3 = "Hello";
       boolean areEqual1 = str1.equals(str2); // Kết quả: false
       boolean areEqual2 = str1.equals(str3); // Kết quả: true
       boolean areEqualIgnoreCase = str1.equalsIgnoreCase("HELLO");
       // Kết quả: true
	// Lấy độ dài chuỗi
       String text = "Hello, world!";
       int length = text.length(); // Kết quả: 13

       // Trích xuất và tìm kiếm chuỗi con
       String sentence = "Java programming is fun and powerful.";
       String subString = sentence.substring(5, 15);
       // Kết quả: "programming"

       int indexOfFun = sentence.indexOf("fun"); // Kết quả: 21

       // Thay thế và chuyển đổi chuỗi
       String originalText = "I like apples and apples are tasty.";
	 String replacedText = originalText.replace("apples", "bananas");
	 String uppercaseText = originalText.toUpperCase();
	 String lowercaseText = originalText.toLowerCase();

	 // Kiểm tra chuỗi có chứa một ký tự/chuỗi con hay không
	 String message = "Hello, Java programming.";
	 boolean startsWithHello = message.startsWith("Hello");
	 // Kết quả: true

	 boolean endsWithProgramming = message.endsWith("programming.");
	 // Kết quả: false

	 boolean containsJava = message.contains("Java");
	 // Kết quả: true

```
4. Wrapper class trong java
- Lớp Wrapper trong Java là loại lớp cung cấp một cơ chế để chuyển đổi loại dữ liệu nguyên thủy thành đối tượng và ngược lại. 

- ![alt-text](https://shareprogramming.net/wp-content/uploads/2019/12/wrapper-class.jpg)

