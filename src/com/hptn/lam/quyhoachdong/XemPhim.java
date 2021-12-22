package com.hptn.lam.quyhoachdong;

import java.util.Scanner;

public class XemPhim {
    private static final int[][] F = new int[105][25005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt(), n = sc.nextInt();
        int[] w = new int[n+1];
        for (int i = 1; i <= n; i++) {
            w[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= c; j++) {
                if (w[i] <= j)
                    F[i][j] = Math.max(F[i - 1][j], w[i] + F[i - 1][j - w[i]]);
                else
                    F[i][j] = F[i-1][j];
            }
        }
        System.out.println(F[n][c]);
    }
}
