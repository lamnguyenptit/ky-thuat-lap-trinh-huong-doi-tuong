package com.hptn.lam.dequy;

import java.util.Scanner;

public class TinhLuyThua {
    static int mod = (int) 1e9 + 7;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            if (n == 0 && k == 0)
                break;
            System.out.println(powMod(n, k));
        }
    }

    private static long powMod(int n, long k) {
        if (k == 0)
            return 1;
        long x = powMod(n, k/2);
        if (k % 2 == 0)
            return x*x % mod;
        return n * (x*x % mod) % mod;
    }
}
