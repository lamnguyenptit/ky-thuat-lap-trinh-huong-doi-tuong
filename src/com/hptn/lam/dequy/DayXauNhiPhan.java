package com.hptn.lam.dequy;

import java.util.Scanner;

public class DayXauNhiPhan {
    static long[] f = new long[100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        f[0] = 0; f[1] = 1;
        for (int i = 2; i <= 92; i++)
            f[i] = f[i-1] +f[i-2];
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(xuLy(n, k));
        }
    }

    private static char xuLy(int n, long k) {
        if (n == 1)
            return '0';
        if (n == 2)
            return '1';
        if (k <= f[n-2])
            return xuLy(n-2, k);
        return xuLy(n-1, k-f[n-2]);
    }
}
