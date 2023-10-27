package BTVN;

import java.util.Scanner;

public class Bai1 {
    public static int timUSCLN(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static int timBSCNN(int a, int b) {
        return (a * b) / timUSCLN(a, b);
    }

    public static int timUSCLN(int a, int b, int c) {
        return timUSCLN(timUSCLN(a, b), c);
    }

    public static int timBSCNN(int a, int b, int c) {
        return timBSCNN(timBSCNN(a, b), c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println(timUSCLN(a, b, c));
        System.out.println(timBSCNN(a, b, c));
    }
}
