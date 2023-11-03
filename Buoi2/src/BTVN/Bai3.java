package BTVN;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int v = 0, y = 0, z = 0;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 65 && s.charAt(i) <= 90) || (s.charAt(i) >= 97 && s.charAt(i) <= 122)) {
                v++;
            } else if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                y++;
            } else {
                z++;
            }
        }
        System.out.println(v + " " + y + " " + z);
    }
}