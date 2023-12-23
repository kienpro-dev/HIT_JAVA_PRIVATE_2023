import java.util.InputMismatchException;
import java.util.Scanner;

public class RunMain {
  public static void main(String[] args) {

    int[] array = {1, 2, 3};
//Mảng chi co 3 phần tử, chỉ số chỉ tối đa đến 2 , nếu truy xuất vào phần tử chỉ số 3 sẽ bị lỗi
//    System.out.println(array[0]);
//    System.out.println(array[1]);
//    System.out.println(array[2]);

    //TODO : Exception : Nó là 1 lỗi hay ngoại lệ , nó sẽ dừng chương trình đột ngột
//    3 loại : Checked Exception , Unchecked Exception , Errors
//    1. Checked Exception : Nó được kiểm tra và xử lý
//    2. Unchecked Exception : Nó không được kiểm tra và sử lý
//    3. Error :  Lỗi do bộ nhớ , không liên quan đến code mình viết

    //Khi chạy chương trình mình sẽ chạy vào trong try ,
    // nếu như mà có lỗi xảy ra nó sẽ vào trong catch cho mình
    try {
      System.out.println(array[4]);
    } catch (ArrayIndexOutOfBoundsException e) {//bắt cái lỗi xảy ra
      System.out.println(" Lỗi : " + e);
    }
    System.out.println(" Ket thuc ");

//Checked Exception
    try {
      int n = new Scanner(System.in).nextInt();
      System.out.println(n);
    } catch (InputMismatchException e) {
      System.out.println("Loi : " + e);
    } finally {//khi chuong trinh co loi hay khong thi no in ra cai finally
      System.out.println("Ket thuc ");
    }


//Bat khong duoc loi : Unchecked Exception
    try {
      System.out.println(array[3]);
    } catch (InputMismatchException e) {
      System.out.println("Loi : " + e);
    } catch (ArrayIndexOutOfBoundsException e) {
      System.out.println("loi :" + e);
    } catch (java.lang.Exception e) {
      System.out.print("Loi " + e);
    }
  }
}