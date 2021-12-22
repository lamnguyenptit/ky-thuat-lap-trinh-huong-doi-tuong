package com.hptn.lam.dequy;

import java.util.Scanner;

public class DayXauFibonacci {
    static long[] f = new long[100];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        f[0] = 0; f[1] = 1;
        for (int i = 2; i <= 92; i++)
            f[i] = f[i-1] +f[i-2];
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            long i = scanner.nextLong();
            System.out.println(fiboWord(n, i));
        }
    }

    private static char fiboWord(int n, long i) {
        if (n == 1)
            return 'A';
        if (n == 2)
            return 'B';
        if (i <= f[n-2])
            return fiboWord(n-2, i);
        return fiboWord(n-1, i-f[n-2]);
    }
}
