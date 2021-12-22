package com.hptn.lam.dothi;

import java.util.*;

public class QuayLaiDinh1 {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[21];
    private static boolean[] chuaXet = new boolean[21];
    private static int[] truoc = new int[21];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
            }
            for (int i = 1; i <= m; i++) {
                int x = sc.nextInt(), y = sc.nextInt();
                dsKe[x].add(y);
            }
            bfs(1, 2);
            int rs = dem(truoc, 1, 2);
            for (int i = 1; i <= n; i++){
                chuaXet[i] = true;
                truoc[i] = 0;
            }
            bfs(2, 1);
            rs += dem(truoc, 2, 1);
            System.out.println(rs);
        }
    }

    private static int dem(int[] truoc, int s, int t) {
        int x = t, count = 0;
        while (x != s){
            ++count;
            x = truoc[x];
        }
        return count - 1;
    }

    private static void bfs(int u, int t) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        chuaXet[u] = false;
        while (!queue.isEmpty()){
            int v = queue.poll();
            for (Integer x : dsKe[v]){
                if (chuaXet[x]){
                    queue.add(x);
                    chuaXet[x] = false;
                    truoc[x] = v;
                    if (x == t)
                        return;
                }
            }
        }
    }
}
