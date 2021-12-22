package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LienThong {
    private static int n, m;
    private static final List<Integer>[] dsKe = new List[301];
    private static final boolean[] chuaXet = new boolean[301];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        List<Integer> rs = new ArrayList<>();
        int x = sc.nextInt();
        for (int i = 0; i <= n; i++){
            dsKe[i] = new ArrayList<>();
            chuaXet[i] = true;
        }
        for (int i = 1; i <= m; i++) {
            int u = sc.nextInt(), v = sc.nextInt();
            dsKe[u].add(v);
            dsKe[v].add(u);
        }
        dfs(x);
        for (int i = 1; i <= n; i++) {
            if (chuaXet[i])
                rs.add(i);
        }
        if (rs.isEmpty())
            System.out.println(0);
        else {
            for (int i : rs)
                System.out.println(i);
        }
    }

    public static void dfs(int u) {
        chuaXet[u] = false;
        for (int v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
