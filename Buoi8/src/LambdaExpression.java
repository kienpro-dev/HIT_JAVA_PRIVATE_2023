import java.util.ArrayList;
import java.util.Arrays;

/*
//Functional interface (Single Abstract Method) : Chỉ được tạo duy nhất đúng 1 method là public abstract
  @FunctionalInterface : annotation nhận biết 1 interface là functional interface
  - Default method và static method
    + Giúp ta mở rộng interface mà không phải lo ngại phá vỡ các class được implement từ nó


  Cấu trúc : (argument-list) -> {body}
  argument-list : Danh sách tham số
  body : Nội dung muốn thực hiện
  Dấu -> : Dùng để liên kết phần tham số và nội dung

  - Lambda nó là hàm ẩn danh , 1 hàm nó sẽ có các tính
  chất hàm bình thường , có thể có tham số hoặc k có ,
  có kiểu trả về hoặc không có kiểu trả ,  giúp code được
  viết ngắn gọn hơn.


  - Nó sử dụng cặp {}; có nhiều câu lệnh hoặc nhiều khối lệnh , còn
  1 câu lệnh thì k cần dùng


 */
public class LambdaExpression {

  @FunctionalInterface
  interface Hello {
    public abstract String sayHello(String name);

    //2 loại phương thức này thì mình có thể định nghĩa được trong interface
    //nó sẽ ảnh hương đến Functional inteferface
    default void test() {
      System.out.println("Hello ae");
    }

    static void test2() {
      System.out.println("Xin chao mn");
    }
  }

  @FunctionalInterface
  interface Goodbye {
    void goodbye();
  }

  //Ví dụ Lambda Tính giá trị lớn nhất trong 2 số
  @FunctionalInterface
  interface Max {
    int maxOfTwoNumber(int a, int b);
  }

  public static void main(String[] args) {


    Hello s = (String name) -> "Hello" + name;
    System.out.println(s.sayHello("AE nha"));
    //Cach goi default method
    s.test();
    //Cach goi static method
    Hello.test2();


    Goodbye g = () -> {
      System.out.println("Hello moi nguoi");
    };
    g.goodbye();

//    Hello s1 = new Hello() {
//      @Override
//      public String sayHello(String name) {
//        return null;
//      }
//    };
//    System.out.println(s1.sayHello(""));

    //Định nghĩa Functional interface Tính max 2 số qua biểu thức Lambda
    //Cach 1 :
    Max number = (int a, int b) -> {
      return (a > b) ? a : b;//Toan tu 3 ngoi
//      return Math.max(a , b);
    };
    //Cach 2 :
    Max max = (a, b) -> (a > b) ? a : b;
    System.out.println(max.maxOfTwoNumber(3, 5));
    //Gọi method ra
    System.out.println(number.maxOfTwoNumber(3, 5));
//    Note : Với những hàm trả về mình định nghĩa phần thần trong khối {};
//    thì mình phải return về , còn không định nghĩa trong {}; thì k cần return


    //Ứng dung cua Functional interface trong Collection
    ArrayList<Integer> arrayList = (ArrayList<Integer>) Arrays.asList(1, 3, 2, 4, 8, 9);

    //Vong lap for each xuất ra các phần tử
    for (int i : arrayList) {
      System.out.println(i);
    }
    //In ra cac phan tu cua list
    arrayList.forEach((e) -> {
      System.out.println(e + " ");
    });

    //Su dung lambda expresstion de in ra cac phan tu la so chan
    arrayList.forEach((e) -> {
      if (e % 2 == 0) {
        System.out.println(e + " ");
      }
    });
  }
}