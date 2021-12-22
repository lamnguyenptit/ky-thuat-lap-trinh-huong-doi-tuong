package com.hptn.lam.dothi.dfs;

import java.util.*;

public class DuongDiTheoDFSVoiDoThiVoHuong {
    private static int n, m;
    private static List<Integer>[] dsKe = new ArrayList[1001];
    private static boolean[] chuaXet = new boolean[10001];
    private static int[] truoc = new int[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            int s = sc.nextInt();
            int t = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
                truoc[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                dsKe[u].add(v);
                dsKe[v].add(u);
            }
            dfs(s);
            if (chuaXet[t])
                System.out.println(-1);
            else {
                Stack<Integer> stack = new Stack<>();
                stack.push(t);
                while (stack.peek() != s)
                    stack.push(truoc[stack.peek()]);
                while (!stack.empty())
                    System.out.print(stack.pop() + " ");
//                List<Integer> kq = new ArrayList<>();
//                int x = t;
//                while (x != s){
//                    kq.add(x);
//                    x = truoc[x];
//                }
//                kq.add(s);
//                Collections.reverse(kq);
//                for (Integer tmp:kq)
//                    System.out.print(tmp + " ");
                System.out.println();
            }
        }
    }

    private static void dfs(int u) {
        chuaXet[u] = false;
        for (Integer v : dsKe[u]){
            if (chuaXet[v]) {
                dfs(v);
                truoc[v] = u;
            }
        }
    }
}
