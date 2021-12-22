package com.hptn.lam.quyhoachdong;

import java.util.Scanner;

public class ToHop {
    private static final int[][] c = new int[1005][1005];
    private static final int mod = (int) 1e9+7;

    public static void main(String[] args) {
        for (int i = 0; i <= 1000; i++) {
            for (int j = 0; j <= i; j++)
                if (i == j || j == 0)
                    c[i][j] = 1;
                else
                    c[i][j] = (c[i-1][j-1] + c[i-1][j]) % mod;
        }
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt(), k = scanner.nextInt();
            System.out.println(c[n][k]);
        }
    }
}
