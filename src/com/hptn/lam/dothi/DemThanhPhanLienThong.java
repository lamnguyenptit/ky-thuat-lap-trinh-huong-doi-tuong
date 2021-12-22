package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemThanhPhanLienThong {
    private static int n, m;
    private static final List<Integer>[] dsKe = new List[20005];
    private static final boolean[] chuaXet = new boolean[20005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        for (int i = 0; i <= n; i++)
            dsKe[i] = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            dsKe[u].add(v);
            dsKe[v].add(u);
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++)
                chuaXet[j] = true;
            int soLT = 0;
            chuaXet[i] = false;
            for (int j = 1; j <= n; j++) {
                if (chuaXet[j]) {
                    ++soLT;
                    dfs(j);
                }
            }
            System.out.println(soLT);
        }
    }

    public static void dfs(int u) {
        chuaXet[u] = false;
        for (int v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
