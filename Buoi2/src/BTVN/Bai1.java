package BTVN;

import java.util.Scanner;

public class Bai1 {

	public static int[] c = new int[1000007];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
	    int[] a = new int[n];
        for (int i = 1; i < n; i++) {
            a[i] = sc.nextInt();
            c[a[i]]++;
        }
        int value = 0;
        int viTri = 0;
        for (int i = 1; i < n; i++)
            if (value < c[a[i]]) {
                value = c[i];
                viTri = i;
            }
        System.out.println(viTri + " " + value);

    }
}