package com.hptn.lam.quyhoachdong;

import java.util.Scanner;

public class BacThang {
    static int mod = (int) 1e9+7;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt(), k = scanner.nextInt();
            System.out.println(qhd(n, k));
        }
    }

    private static int qhd(int n, int k) {
        int[] f = new int[n+1];
        f[0] = 1;
        f[1] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= Math.min(i, k); j++)
                f[i] = (f[i] + f[i-j]) % mod;
        }
        return f[n];
    }
}
