package com.hptn.lam.dothi.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSTrenDoThiVoHuong {
    private static int n, m;
    private static List<Integer>[] dsKe = new ArrayList[1001];
    private static boolean[] chuaXet = new boolean[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            int s = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            dfs(s);
            System.out.println();
        }
    }

    private static void dfs(int u) {
        System.out.print(u + " ");
        chuaXet[u] = false;
        for (Integer v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
