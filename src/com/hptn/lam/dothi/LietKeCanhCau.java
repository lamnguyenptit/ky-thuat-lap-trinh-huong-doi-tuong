package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LietKeCanhCau {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];

    private static class Canh{
        int fi, se;

        public Canh(int fi, int se) {
            this.fi = fi;
            this.se = se;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            List<Canh> dsCanh = new ArrayList<>();
            List<Canh> rs = new ArrayList<>();
            dsCanh.add(new Canh(0, 0));
            rs.add(new Canh(0, 0));
            int soLT = 0;
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                dsCanh.add(new Canh(u, v));
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                if (chuaXet[i]) {
                    ++soLT;
                    dfs(i);
                }
            }
            for (int i = 1; i <= m; i++) {
                int count = 0;
                for (int j = 1; j <= n; j++) {
                    chuaXet[j] = true;
                    dsKe[j].clear();
                }
                for (int j = 1; j <= m; j++) {
                    if (i != j){
                        dsKe[dsCanh.get(j).fi].add(dsCanh.get(j).se);
                        dsKe[dsCanh.get(j).se].add(dsCanh.get(j).fi);
                    }
                }
                for (int j = 1; j <= n; j++) {
                    if (chuaXet[j]){
                        ++count;
                        dfs(j);
                    }
                }
                if (count > soLT){
                    if (dsCanh.get(i).fi < dsCanh.get(i).se)
                        rs.add(new Canh(dsCanh.get(i).fi, dsCanh.get(i).se));
                    else
                        rs.add(new Canh(dsCanh.get(i).se, dsCanh.get(i).fi));
                }
            }
            for (int i = 1; i < rs.size(); i++) {
                System.out.print(rs.get(i).fi + " " + rs.get(i).se + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int u){
        chuaXet[u] = false;
        for (Integer v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
