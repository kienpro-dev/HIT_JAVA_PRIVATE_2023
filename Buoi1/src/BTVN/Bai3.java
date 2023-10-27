package BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int res = 1;

        while (n != 0) {
            int digit = n % 10;
            res *= digit;
            n /= 10;
        }

        System.out.println(res);
    }
}
