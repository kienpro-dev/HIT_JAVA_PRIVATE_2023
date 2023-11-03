package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        boolean[] f = new boolean[30];
        char[] c = s.toCharArray();
        for (int i = 1; i <= 26; i++) {
            f[i] = false;
        }
        for (int i = 0; i < s.length(); i++) {
            int x = (int) c[i];
            if (x >= 65 && x <= 90) {
                f[x - 64] = true;
            } else if (x >= 97 && x <= 122) {
                f[x - 96] = true;
            }
        }
        boolean ans = true;
        for (int i = 1; i <= 26; i++) {
            if (f[i] == false) ans = false;
        }
        if (ans) System.out.println("YES");
        else System.out.println("NO");
    }
}