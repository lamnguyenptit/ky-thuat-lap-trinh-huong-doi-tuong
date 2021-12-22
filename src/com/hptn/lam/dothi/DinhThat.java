package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DinhThat {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            int u = sc.nextInt(), v = sc.nextInt();
            int count = 0;
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int x = sc.nextInt(), y = sc.nextInt();
                dsKe[x].add(y);
            }
            for (int i = 0; i <= n; i++) {
                if (i != u && i != v){
                    for (int j = 1; j <= n; j++) {
                        chuaXet[j] = true;
                    }
                    chuaXet[i] = false;
                    dfs(u);
                    if (chuaXet[v])
                        ++count;
                }
            }
            System.out.println(count);
        }
    }

    private static void dfs(int u) {
        chuaXet[u] = false;
        for (int v : dsKe[u])
            if (chuaXet[v])
                dfs(v);
    }
}
