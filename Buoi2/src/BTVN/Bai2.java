package BTVN;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n + 1];
        a[0] = 0;
        for (int i = 1; i <= n; i++) {
            a[i] = a[i - 1] + sc.nextLong();
        }
        int q = sc.nextInt();
        int x, y;
        while (q > 0) {
            q--;
            x = sc.nextInt();
            y = sc.nextInt();
            System.out.println((a[y] - a[x - 1]));
        }
    }
}