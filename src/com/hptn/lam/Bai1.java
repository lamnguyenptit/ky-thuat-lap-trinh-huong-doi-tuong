package com.hptn.lam;

import java.util.Scanner;

public class Bai1 {
    static int mod = (int) (1e9+7);
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            System.out.println(qhd(n, k));
        }
    }

    private static int qhd(int n, int k) {
        int[] f = new int[n+1];
        f[0] = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= Math.min(i, k); j++) {
                f[i] = (f[i] + f[i-j]) % mod;
            }
        }
        return f[n];
    }
}
