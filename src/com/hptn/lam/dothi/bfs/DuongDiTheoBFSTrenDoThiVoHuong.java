package com.hptn.lam.dothi.bfs;

import java.util.*;

public class DuongDiTheoBFSTrenDoThiVoHuong {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];
    private static int[] truoc = new int[10001];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            int u = sc.nextInt(), v = sc.nextInt();
            for (int i = 0; i <= n; i++) {
                dsKe[i] = new ArrayList<>();
                chuaXet[i] = true;
                truoc[i] = 0;
            }
            for (int i = 1; i <= m; i++) {
                int x = sc.nextInt(), y = sc.nextInt();
                dsKe[x].add(y);
                dsKe[y].add(x);
            }
            bfs(u);
            if (chuaXet[v])
                System.out.print(-1);
            else {
                Stack<Integer> stack = new Stack<>();
                stack.push(v);
                while (stack.peek() != u)
                    stack.push(truoc[stack.peek()]);
                while (!stack.empty())
                    System.out.print(stack.pop() + " ");
            }
            System.out.println();
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
                    truoc[x] = v;
                }
            }
        }
    }
}
