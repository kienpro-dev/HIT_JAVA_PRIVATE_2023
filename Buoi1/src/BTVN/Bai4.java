package BTVN;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();

        char operator = scanner.next().charAt(0);

        int n2 = scanner.nextInt();

        int res = 0;

        switch (operator) {
            case '+':
                res = n1 + n2;
                break;
            case '-':
                res = n1 - n2;
                break;
            case '*':
                res = n1 * n2;
                break;
            case '/':
                res = n1 / n2;
                break;
            default:
                return;
        }

        System.out.println(res);
    }
}
