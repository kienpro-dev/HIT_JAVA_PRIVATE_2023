package BTVN;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        int n2 = scanner.nextInt();

        int n3 = scanner.nextInt();

        int n4 = scanner.nextInt();

        int n5 = scanner.nextInt();

        int max1, max2;

        if (n1 >= n2 && n1 >= n3 && n1 >= n4 && n1 >= n5) {
            max1 = n1;
            if (n2 >= n3 && n2 >= n4 && n2 >= n5) {
                max2 = n2;
            } else if (n3 >= n4 && n3 >= n5) {
                max2 = n3;
            } else if (n4 >= n5) {
                max2 = n4;
            } else {
                max2 = n5;
            }
        } else if (n2 >= n3 && n2 >= n4 && n2 >= n5) {
            max1 = n2;
            if (n1 >= n3 && n1 >= n4 && n1 >= n5) {
                max2 = n1;
            } else if (n3 >= n4 && n3 >= n5) {
                max2 = n3;
            } else if (n4 >= n5) {
                max2 = n4;
            } else {
                max2 = n5;
            }
        } else if (n3 >= n4 && n3 >= n5) {
            max1 = n3;
            if (n1 >= n2 && n1 >= n4 && n1 >= n5) {
                max2 = n1;
            } else if (n2 >= n4 && n2 >= n5) {
                max2 = n2;
            } else if (n4 >= n5) {
                max2 = n4;
            } else {
                max2 = n5;
            }
        } else if (n4 >= n5) {
            max1 = n4;
            if (n1 >= n2 && n1 >= n3 && n1 >= n5) {
                max2 = n1;
            } else if (n2 >= n3 && n2 >= n5) {
                max2 = n2;
            } else if (n3 >= n5) {
                max2 = n3;
            } else {
                max2 = n5;
            }
        } else {
            max1 = n5;
            if (n1 >= n2 && n1 >= n3 && n1 >= n4) {
                max2 = n1;
            } else if (n2 >= n3 && n2 >= n4) {
                max2 = n2;
            } else if (n3 >= n4) {
                max2 = n3;
            } else {
                max2 = n4;
            }
        }

        System.out.println(max1 + " " + max2);
    }
}
