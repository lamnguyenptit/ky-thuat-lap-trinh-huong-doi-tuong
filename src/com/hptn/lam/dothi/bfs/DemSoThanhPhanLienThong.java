package com.hptn.lam.dothi.bfs;

import java.util.*;

public class DemSoThanhPhanLienThong {
    private static int n, m;
    private static List<Integer>[] dsKe = new ArrayList[1001];
    private static boolean[] chuaXet = new boolean[10001];

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
                    bfs(i);
                }
            }
            System.out.println(dem);
        }
    }

    private static void bfs(int u) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        chuaXet[u] = false;
        while (!queue.isEmpty()){
            int v = queue.poll();
            for (Integer x : dsKe[v]){
                if (chuaXet[x]){
                    queue.add(x);
                    chuaXet[x] = false;
                }
            }
        }
    }
}
