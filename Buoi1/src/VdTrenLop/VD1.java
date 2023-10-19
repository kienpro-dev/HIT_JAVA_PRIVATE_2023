package VdTrenLop;

import java.util.Scanner;

public class VD1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // Lưu ý khi nhập dữ liệu có cả số và kí tự trong 1 bài
        // sử dụng nextLine() sau khi nhập số hoặc trước khi nhập chuỗi
        int a = s.nextInt();
        s.nextLine();
        String s2 = s.nextLine();
        System.out.println(a);
        System.out.println(s2);
        
    }
}


//git add . : up tất cả những file thay đổi
//git commit -m "": viết message
//git push origin main: up lên github