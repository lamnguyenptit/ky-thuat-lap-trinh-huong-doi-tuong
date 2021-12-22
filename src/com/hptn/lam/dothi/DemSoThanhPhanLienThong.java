package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DemSoThanhPhanLienThong {
    private static int n, m;
    private static List<Integer>[] dsKe = new ArrayList[1005];
    private static boolean[] chuaXet = new boolean[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i <= 1000; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            int dem = 0;
            for (int i = 1; i <= n; i++) {
                if (chuaXet[i]){
                    ++dem;
                    dfs(i);
                }
            }
            System.out.println(dem);
        }
    }

    private static void dfs(int u) {
        chuaXet[u] = false;
        for (Integer v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
