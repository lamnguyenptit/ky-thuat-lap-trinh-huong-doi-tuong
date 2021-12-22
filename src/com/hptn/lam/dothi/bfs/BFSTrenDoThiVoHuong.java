package com.hptn.lam.dothi.bfs;

import java.util.*;

public class BFSTrenDoThiVoHuong {
    private static int n, m;
    private static List<Integer>[] dsKe = new ArrayList[1001];
    private static boolean[] chuaXet = new boolean[1001];

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
            bfs(s);
            System.out.println();
        }
    }

    private static void bfs(int u) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        chuaXet[u] = false;
        while (!queue.isEmpty()){
            int v = queue.poll();
            System.out.print(v + " ");
            for (Integer x : dsKe[v]){
                if (chuaXet[x]){
                    queue.add(x);
                    chuaXet[x] = false;
                }
            }
        }
    }
}
