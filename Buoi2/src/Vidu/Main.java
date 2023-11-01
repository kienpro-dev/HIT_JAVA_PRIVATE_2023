package Vidu;

public class Main {
    public static void print(int ketQua) {
        System.out.println(ketQua);
    }

    public static int tinhTong(int a, int b) {
        return a + b;
    }

    // Java không hỗ trợ tham chiếu, chỉ có tham trị
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) {

        Integer a = 1000;
        Integer b = 1000;
        System.out.println(a == b); // false

//        System.out.println(a.equals(b));

        Integer a2 = 100;
        Integer b2 = 100;
        System.out.println(a == b); // true

        // Lý do: Java sử dụng một bộ nhớ đệm để lưu trữ một loạt các đối tượng Integer
        // có giá trị từ -128 đến 127. Những đối tượng này là các thể hiện của một bộ nhớ đệm
        // được gọi là "Integer cache." Mục đích của việc sử dụng bộ nhớ đệm này là để
        // tối ưu hóa việc sử dụng bộ nhớ khi bạn tạo nhiều đối tượng Integer có cùng giá trị.

        // Khi 2 giá trị không nằm trong khoảng từ -128 đến 127, nên Java sẽ tạo mới hai đối tượng
        // Integer riêng biệt để đại diện cho a và b. Do đó, a và b sẽ tham chiếu đến hai đối tượng
        // Integer khác nhau với cùng một giá trị, và toán tử == sẽ trả về false trong trường hợp này.

        // Giải pháp: sử dụng equals khi so sánh

//        final double PI = 3.14;
//
//        int[] array1 = new int[5];
//
//        int[] array2 = {5 , 6, 7, 8, 9};
//        // Chỉ số: index (0 -> n-1)
//        // Vị trí: position (1 -> n)
//        int a = array2[0];
//
//        for (int i = array2.length - 1; i >= 0; i--) {
//              System.out.print(array2[i] + " ");
//        }
//
//        for(int x : array2) {
//            System.out.println(x);
//        }
    }
}
