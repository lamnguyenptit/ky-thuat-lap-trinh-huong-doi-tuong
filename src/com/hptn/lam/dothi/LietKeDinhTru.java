package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LietKeDinhTru {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            int soLT = 0;
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            for (int i = 1; i <= n; i++) {
                if (chuaXet[i]){
                    ++soLT;
                    dfs(i);
                }
            }
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n ; j++)
                    chuaXet[j] = true;
                int count = 0;
                chuaXet[i] = false;
                for (int j = 1; j <= n; j++) {
                    if (chuaXet[j]){
                        ++count;
                        dfs(j);
                    }
                }
                if (count > soLT)
                    System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void dfs(int u){
        chuaXet[u] = false;
        for (int v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
