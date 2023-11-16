# Buổi 5

## List, ArrayList trong Java OOP

![alt text](https://ironhackvietnam.edu.vn/wp-content/uploads/2021/03/list-trong-java.jpg)

- List trong Java là 1 interface nằm trong những Java Collection thường được sử dụng để lưu trữ và thao tác với 1 mảng các đối tượng. (tìm kiếm, chèn, sửa, xóa, ...). Tìm hiểu thêm về [Collections](https://viblo.asia/p/tong-quan-ve-collections-trong-java-maGK7E0Dlj2)
- Trong đó có ArrayList được triển khai từ interface List, sử dụng như 1 mảng động trong Java để lưu trữ phần tử, hỗ trợ nhiều phương thức để thao tác với mảng

- Khai báo 1 ArrayList:

```java
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        ArrayList<VD.Person> array2 = new ArrayList<VD.Person>();
    }
```

- Lưu ý:

  - Kiểu dữ liệu truyền vào phải là 1 lớp hoặc 1 wrapper class: Integer, String, Double, ...
  - ArrayList là 1 class nên nó sẽ có những phương thức riêng để thao tác với mảng được tạo ra

- Các phương thức quan trọng của ArrayList:
  - add, addAll
  - contains
  - retainAll, removeAll
  - indexOf, lastIndexOf
  - size, get, set
  - [Xemthêm](https://viettuts.vn/java-collection/arraylist-trong-java#goto-h2-1)

```java
    public static void main(String[] args) {
        ArrayList<Integer> array1 = new ArrayList<Integer>();

        // Thêm phần tử vào dãy: add và addAll
        array1.add(1);
        array1.add(2);
        array1.add(3);
        array1.add(5);
        // array1: 1, 2, 3, 5

        array1.add(1, 4); // add theo chỉ số (index)
        // array1: 1, 4, 2, 3, 5

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(5);
        array2.add(6);
        // array2: 5, 6

        array1.addAll(array2); // add ArrayList vào ArrayList khác
        // array1: 1, 4, 2, 3, 5, 5, 6

        // Kiểm tra phẩn tử có trong dãy hay không (true hoặc false): contains
        boolean checkNumber = array1.contains(5); // => true

        // Phương thức array1.retainAll(array2): xóa những phần tử không thuộc
        // array2 khỏi array1
        // array1: 1, 4, 2, 3, 5, 5, 6
        // array2: 5, 6
        array1.retainAll(array2);
        // array1: 5, 5, 6
        // array2: 5, 6

        // Phương thức array1.removeAll(array2): ngược lại, xóa những phần tử
        // thuộc array2 khỏi array1
        array1.removeAll(array2);
        // array1: (NOTHING)
        // array2: 5, 6

        // Phương thức lấy vị trí của phần tử dãy
        ArrayList<Integer> array3 = new ArrayList<Integer>();
        array3.add(1);
        array3.add(2);
        array3.add(3);
        array3.add(1);
        array3.add(4);

        int idx1 = array3.indexOf(1);
        int idx2 = array3.lastIndexOf(1);
        int idx3 = array3.indexOf(5);

        // Các phương thức thông dụng khác để truy xuất đến phần tử trong dãy
        for(int i = 0 ; i < array3.size() ; i++){
            array3.set(i, 100);
            System.out.print(array3.get(i) + " ");
        }

    }
```

## Kế thừa trong Java OOP (Inheritance)

- Kế thừa trong OOP là thừa hưởng lại thuộc tính và phương thức của 1 lớp
- Lớp cho kế thừa gọi là lớp cha, lớp được kế thừa gọi là lớp con, lớp con sẽ thừa hưởng các thuộc tính và phương thức của lớp cha mà vẫn phải đảm bảo tính đóng gói (Encapsulation)

![alt text](https://res.cloudinary.com/shopmanagement/image/upload/v1693349441/adtvjanovqgva5wagl5r.png)

![alt text](https://codelearn.io/Media/Default/Users/TuanLQ7/Java_OOP/inheritance6.png)

- Mục đích sử dụng kế thừa:
  - Tái sử dụng lại code
  - Dễ dàng chỉnh sửa, gỡ lỗi
  - Tăng khả năng mở rộng code
  - ...

```java
    class VD.Person{
        // private String name;
        protected String name;

        public VD.Person(String name) {
            this.name = name;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

    }

    // Lớp VD.Student kế thừa lớp VD.Person thông qua từ khóa extends
    class VD.Student extends VD.Person {
        private double gpa;

        // Khi khai báo constructor lớp con cần truyền đầy đủ tham số cả cha lẫn con
        public VD.Student(String name, double gpa) {
            // thông qua từ khóa super gọi đến constructor lớp cha
            super(name);
            this.gpa = gpa;
        }
        public double getGpa() {
            return gpa;
        }
        public void setGpa(double gpa) {
            this.gpa = gpa;
        }
    }
```

- Lưu ý: Java không hỗ trợ đa kế thừa, mỗi class chỉ có 1 class cha duy nhất

![alt text](https://viettuts.vn/images/java/cac-kieu-ke-thua.jpg)

## Ghi đè phương thức (override)

- Ghi đè phương thức trong java xảy ra nếu lớp con có phương thức giống lớp cha.
- Sử dụng để cung cấp 1 phương thức được cài đặt khác đối với mỗi lớp con khác nhau của lớp cha.

```java
    class VD.Person{
        public void display() {
            System.out.println("This is VD.Person");
        }
    }

    class VD.Student extends VD.Person{
        @Override
        public void display() {
            System.out.println("This is VD.Student");
        }
    }

    class Test {
        public static void main(String[] args) {
            VD.Student s = new VD.Student();
            s.display();
            // This is VD.Student
        }
    }
```

- Ví dụ thực tế về ghi đè phương thức trong các ngân hàng:

![alt text](https://www.javatpoint.com/images/core/bankinheritance.png)

- Lưu ý:
  - Để ghi đè phương thức lớp cha thì phương thức lớp con cần có phạm vi truy cập bằng hoặc rộng hơn phương thức lớp cha: private -> default -> protected -> public
  - Phương thức static và final không thể bị ghi đè

## Bài tập OOP phiếu

![alt text](https://vn-live-01.slatic.net/p/1723f1e9491d502317a81f64fd383c78.jpg)

- Các bước làm 1 bài tập OOP phiếu:
    - Bước 1: Liệt kê các thuộc tính của lớp có ghi trên phiếu
    - Bước 2: Nhóm các thuộc tính có điểm chung 
    - Bước 3: Xác định lớp chính và các lớp cho các nhóm thuộc tính đó
    - Bước 4: Code ...

![alt text](https://hiepsiit.com/public/uploads/images/Baitap/hdt/9.jpg)
