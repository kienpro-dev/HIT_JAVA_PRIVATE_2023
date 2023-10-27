package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static String parse(int n, int b) {
        if (n == 0) {
            return "0";
        }

        String res = "";
        while (n > 0) {
            int digit = n % b;
            res = toDigit(digit) + res;
            n /= b;
        }

        return res;
    }

    public static String toDigit(int digit) {
        if (digit >= 0 && digit <= 9) {
            return String.valueOf(digit);
        } else {
            switch (digit) {
                case 10:
                    return "A";
                case 11:
                    return "B";
                case 12:
                    return "C";
                case 13:
                    return "D";
                case 14:
                    return "E";
                case 15:
                    return "F";
                default:
                    return "";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = sc.nextInt();
        int base = sc.nextInt();
        if(base != 2 || base != 8 || base != 10 || base != 16) {
            System.out.println("Not support");
        } else {
            System.out.println(parse(number, base));
        }

    }
}
