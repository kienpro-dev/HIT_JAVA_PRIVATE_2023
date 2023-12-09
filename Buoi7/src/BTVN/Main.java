package BTVN;

import java.util.Scanner;

public class Main {
    public static boolean isValid(String input) {
        int ngoac1 = 0;
        int ngoac2 = 0;
        int ngoac3 = 0;

        for (char c : input.toCharArray()) {
            if (c == '(') {
                ngoac1++;
            } else if (c == ')') {
                ngoac1--;
            } else if (c == '[') {
                ngoac2++;
            } else if (c == ']') {
                ngoac2--;
            } else if (c == '{') {
                ngoac3++;
            } else if (c == '}') {
                ngoac3--;
            }

            if (ngoac1 < 0 || ngoac2 < 0 || ngoac3 < 0) {
                return false;
            }
        }

        return ngoac1 == 0 && ngoac2 == 0 && ngoac3 == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi kí tự: ");
        String input = scanner.nextLine();

        if (isValid(input)) {
            System.out.println("Chuỗi ngoặc hợp lệ.");
            int ngoac1 = 0;
            int ngoac2 = 0;
            int ngoac3 = 0;

            for (char c : input.toCharArray()) {
                if (c == '(') {
                    ngoac1++;
                }  else if (c == '[') {
                    ngoac2++;
                }  else if (c == '{') {
                    ngoac3++;
                }
            }

            System.out.println("Số lượng cặp (): " + ngoac1);
            System.out.println("Số lượng cặp []: " + ngoac2);
            System.out.println("Số lượng cặp {}: " + ngoac3);
        } else {
            System.out.println("Chuỗi ngoặc không hợp lệ.");
        }
    }
}
