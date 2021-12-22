package com.hptn.lam.dothi.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DFSTrenDoThiVoHuong2 {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];
    private static List<Integer> rs = new ArrayList<>();

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
            System.out.print("DFS(" + s + ") = ");
            for (int i = 0; i < rs.size() - 1; i++) {
                System.out.print(rs.get(i) + " -> ");
            }
            System.out.print(rs.get(rs.size()-1));
            rs.clear();
            System.out.println();
        }
    }

    private static void dfs(int s) {
        chuaXet[s] = false;
        rs.add(s);
        for (int v : dsKe[s]){
            if (chuaXet[v]){
                dfs(v);
            }
        }
    }
}
