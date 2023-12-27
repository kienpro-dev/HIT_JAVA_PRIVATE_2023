# Buổi 10: Regex + JDBC

## 1. Regex

- Khái niệm: regular expression hay còn gọi là biểu thức chính quy là 1 chuỗi những kí tự liên tục, thường được sử dụng để so khớp dữ liệu có phù hợp với mong muốn của người dùng hay không theo một quy tắc nhất định. Hiểu đơn giản là kiểm tra tính hơp lệ của chuỗi
  VD: Email, Phone number, username, password hợp lệ ...

```java
    String email1 = "tienkien@gmail.com";
    String email2 = "tienkien@gmail@.com";

    String phoneNumber1 = "0355396153";
    String phoneNumber2 = "035539615";
    String phoneNumber3 = "035539abcd";


```

- Sử dụng regex để kiểm tra tính hợp lệ của chuỗi

  - Pattern: là đối tượng mẫu biên dịch từ regex, hiểu đơn giản là bộ lọc, thường sử dụng phương thức compile(regex) để biên dịch biểu thức
  - Matcher: là phương tiện để so khớp chuỗi với regex, thường sử dụng phương thức matcher(string) để so khớp string với biểu thức

- Quy tắc viết regex:

  - Dấu . : khớp bất kì kí tự đơn nào
  - Dấu ^ : khớp với phần đầu của chuỗi hoặc sử dụng để phủ định
  - Dấu $ : khớp với phần cuối của chuỗi
  - Dấu ? : tối thiểu số kí tự bằng 0 và tối đa là 1
  - Dấu + : tối thiểu số kí tự bằng 1 và tối đa là nhiều
  - Dấu \* : tối thiểu số kí tự bằng 0 và tối đa là nhiều
  - {n} : có chính xác n lần xuất hiện
  - {n , } : có chính xác n hoặc nhiều hơn lần xuất hiện
  - {n , m} : có ít nhất n hoặc nhiều nhất m lần xuất hiện
  - (...) : khớp với các kí tự trong ()
  - [...] : khớp với bất kì kí tự nào trong []
  - [^...] : khớp với bất kì kí tự nào không trong []
  - [m-n] : khớp với từ kí tự m đến n trong bảng ASCII
  - \d : khớp với ký tự là chữ số, viết tắt của [0-9]
  - \D : khớp với ký tự không phải là chữ số, viết tắt của [^0-9]
  - \s : khớp với bất kỳ ký tự trống nào (dấu cách, tab, xuống dòng), viết tắt của [\t\n\x0B\f\r]
  - \S : khớp với bất kỳ ký tự không phải ký tự trống, viết tắt của [^\s]
  - \w : khớp bất kỳ ký tự chữ nào (chữ cái và chữ số), viết tắt của [a-zA-Z0-9]
  - \W : khớp bất kỳ ký tự nào không phải chữ cái và chữ số, viết tắt của [^\w]
    ...

- Ví dụ:

```java
    String regexPhoneNumber = "^0\\d{9}$"; // bắt đầu là 0 theo sau là 9 kí tự là số từ 0-9
    String regexMail = "^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Z|a-z]{2,}$"; // bắt đầu là chuỗi bắt kì + @ + chuỗi bất kì + dấu . + bất kì > 2 kí tự
    String regexPassword = "^.{8,}$"; // bắt đầu là bất kì kí tự nào và có ít nhất 8 kí tự
    String regexUsername = "^[a-z]{4,}$"; // tất cẩ là kí tự từ a-z và có ít nhất 4 kí tự

    String phoneNumber = "0355396153";

    Pattern pattern = Pattern.compile(regexPhoneNumber);
    Matcher matcher = pattern.matcher(phoneNumber);

    // (matcher.find())
    if(matcher.matches()) {
        System.out.println("SDT hop le");
    } else {
        System.out.println("SDT khong hop le");
    }


    // Dùng regex xóa khoảng trắng thừa
    String input = "   Hello     moi      nguoi   ";
    String result = input.replaceAll("\\s+", " ").trim();

    System.out.println(input);

```

## JDBC Connection

- Cung cấp phương thức kết nối với cơ sở dữ liệu trong Java, truy vấn, hiển thị, cập nhật hay xóa dữ liệu từ Database.
- Các lớp và phương thức sử dụng trong JDBC:
  - DriverManager : 1 class quản lý database driver( trình quản lý cơ sở dữ liệu)
  - Driver : 1 interface giao tiếp với cở sở dữ liệu
  - Connection : Quản lý các kết nối từ database đến server
  - Statement/PreparedStatement : Quản lý các câu lệnh thao tác với csdl
  - ResultSet : Trả về 1 tập kết quả

```java
public static Connection getConnection(){
    final String user = "sa";
    final String password = "1";

    String url = "jdbc:sqlserver://localhost:1433;databaseName=test_jdbc;user="+user+";password="+password;
    try {
      Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
      return DriverManager.getConnection(url);
    } catch (Exception e) {
      e.printStackTrace();
    }
    return null;
  }
```
