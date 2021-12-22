package com.hptn.lam.coban;

import java.util.Scanner;

public class SoFibonacci {
    private static long fibonacci(int n){
        long a = 0, a1 = 1, a2 = 1;
        if (n == 1 || n == 2)
            return 1;
        int i = 3;
        while (i <= n){
            a = a1 + a2;
            a1 = a2;
            a2 = a;
            i++;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t, n;
//        long f[] = new long[100];
//        f[0] = 0;
//        f[1] = 1;
//        for (int i = 2; i <= 92; i++) {
//            f[i] = f[i-1] + f[i-2];
//        }

        t = scanner.nextInt();
        while (t-- > 0){
            n = scanner.nextInt();
            System.out.println(fibonacci(n));
        }
    }
}
