package com.hptn.lam.dequy;

import java.util.Arrays;
import java.util.Scanner;

public class DayConCoTongSoNguyenTo {
    static int b[] = new int[20], n, a[] = new int[20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            b = new int[20];
            a = new int[20];
            n = scanner.nextInt();
            int[] x = new int[n];
            for (int i = 0; i < n; i++)
                x[i] = scanner.nextInt();
            Arrays.sort(x);
            for (int i = 1; i <= n; i++) {
                a[i] = x[n - i];
            }

            quayLui(1);
        }
    }

    private static void quayLui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n)
                xuLy();
            else
                quayLui(i + 1);
        }
    }

    private static void xuLy() {
        int i, tong = 0;
        for (i = 1; i <= n; i++) {
            if (b[i] == 1)
                tong += a[i];
        }
        if (isPrime(tong)){
            for (i = 1; i <= n; i++) {
                if (b[i] == 1)
                    System.out.print(a[i] + " ");
            }
            System.out.println();
        }
    }

    private static boolean isPrime(int n) {
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
