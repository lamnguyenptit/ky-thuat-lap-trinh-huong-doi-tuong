package com.hptn.lam.quyhoachdong;

public class Fibonacci {
    public static void main(String[] args) {
        long[] f = new long[100];
        f[0] = 0;
        f[1] = 1;
        for (int i = 2; i <= 92; i++) {
            f[i] = f[i-1] + f[i-2];
        }
        int n = 90;
        for (int i = 0; i <= n; i++) {
            System.out.println(f[i]);
        }
    }

//    private static long fibonacci(int n) {
//        if (n == 0 || n == 1)
//            return n;
//        return fibonacci(n - 1) + fibonacci(n - 2);
//    }
}
