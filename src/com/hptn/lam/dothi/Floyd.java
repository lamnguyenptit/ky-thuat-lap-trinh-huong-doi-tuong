package com.hptn.lam.dothi;

import java.util.*;

public class Floyd {
    private static int[][] a = new int[105][105];
    private static int n, m;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int u, v, w;
        n = in.nextInt();
        m = in.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j)
                    a[i][j] = 0;
                else
                    a[i][j] = (int) 1e9;
            }
        }
        for (int i = 1; i <= m; i++) {
            u = in.nextInt();
            v = in.nextInt();
            w = in.nextInt();
            a[u][v] = w;
            a[v][u] = w;
        }
        floyd();
        int q = in.nextInt();
        while (q-- > 0) {
            u = in.nextInt();
            v = in.nextInt();
            System.out.println(a[u][v]);
        }
    }

    public static void floyd() {
        for (int k = 1; k <= n; k++)
            for (int i = 1; i <= n; i++)
                for (int j = 1; j <= n; j++)
                    if (a[i][j] > a[i][k] + a[k][j])
                        a[i][j] = a[i][k] + a[k][j];
    }
}
