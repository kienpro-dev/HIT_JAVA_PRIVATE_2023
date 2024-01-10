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
## Thực hiện tìm kiếm, thêm, sửa, xóa từ cơ sở dữ liệu

- Tìm kiếm: thực thi với câu lệnh SELECT trong SQL

```java
public List<>SinhVien> danhSachSinhVien() {
        // Tạo List SinhVien để lưu trữ kết quả
        List<SinhVien> list = new ArrayList<>();
        
        // Tạo chuỗi kết nối với cơ sở dữ liệu
        Connection con = getConnection();

        // Viết câu lệnh truy vấn SQL
        String sql = "SELECT * FROM SinhVien";
        
        // Tạo Statement quản lý câu lệnh truy vấn
        Statement statement = con.createStatement();
        
        // Thực thi câu lệnh sql trả về kết quả
        ResultSet rs = statement.executeQuery();
        
        // Lặp qua từng kết quả trả về trong ResultSet để xử lý
        while (rs.next()) {
            
            String name = rs.getString("name");
            String age = rs.getInt("age");
            SinhVien a = new SinhVien(name, age);
            list.add(a);
        }
        
        // Đóng kết nối sau khi truy vấn xong
        con.close();
        return list;
}
    
```

- Thêm: thực thi với câu lệnh INSERT trong SQL
- Có thể sử dụng PrepareStatement để thay thế cho Statement để viết truy vấn:
  - PrepareStatement có hiệu suất cao hơn Statement
  - PrepareStatement sử dụng tham số để tham chiếu giá trị mà không tạo ra câu lệnh SQL tường minh, giúp ánh xạ giá trị 1 cách linh động
  - PrepareStatement ngăn tấn công SQL Injection, ...
```java
public void themSinhVien(SinhVien s) {
        // Tạo chuỗi kết nối với cơ sở dữ liệu
        Connection con = getConnection();
        
        // Tạo truy vấn sử dụng PrepareStatement để tham chiếu giá trị
        String sql = "INSERT INTO SinhVien VALUES(? , ?)";

        // Tạo PreparedStatement để quản lý câu lệnh
        PreparedStatement ps = con.prepareStatement(sql);
        
        // Tham chiếu đến giá trị của câu lệnh SQL
        ps.setString(1, s.getName());
        ps.setInt(2, s.getAge());
        
        // Cập nhật giá trị sau khi thay đổi
        ps.executeUpdate();
} 

```

- Sửa: thực thi với câu lệnh UPDATE trong SQL
- Xóa: thực thi với câu lệnh DELETE trong SQL

## Quản lý kết nối JDBC bằng Connection pooling
- Connection Pooling là một kỹ thuật được sử dụng để quản lý và tái sử dụng các kết nối đến Database
- Mục tiêu của Connection Pooling là tối ưu hóa việc quản lý kết nối, giảm thiểu tạo và đóng kết nối liên tục, cũng như cải thiện hiệu suất ứng dụng.
- Khi một ứng dụng Java tương tác với cơ sở dữ liệu thông qua JDBC, việc mở và đóng kết nối có thể gây tốn kém và làm giảm hiệu suất. Connection Pooling giải quyết vấn đề này bằng cách tạo sẵn một pool các kết nối đến cơ sở dữ liệu và cung cấp chúng cho ứng dụng khi cần. Khi ứng dụng đã sử dụng xong kết nối, nó không đóng nó mà chỉ trả lại kết nối đó vào pool để sử dụng lại.
## Áp dụng

- Xây dựng chuỗi kết nối

```java

    String user = "root";
    String password = "root";
    Stack<Connection> pools = new Stack<>();
    
    String url = "jdbc:mysql://localhost:3306/test";
    try {
      Class.forName("com.mysql.jdbc.Driver");
      return DriverManager.getConnection(url, user, )password;
    } catch (Exception e) {
      e.printStackTrace();
    }

```

- Sử dụng pools quản lý chuỗi kết nối

```java 
public Connection getConnection() throws SQLException {
	if(this.pools.isEmpty()) {
		return DriverManager.getConnection(this.url, this.username, this.password);
	} else {
		return this.pools.pop();
	}
}
```

- Giải phóng kết nối và lưu vào pools
```java
public void releaseConnection(Connection con) throws SQLException {
    this.pools.push(conn);
}

```