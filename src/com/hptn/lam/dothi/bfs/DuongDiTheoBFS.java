package com.hptn.lam.dothi.bfs;

import java.util.*;

public class DuongDiTheoBFS {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];
    private static int[] truoc = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
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
            for (int i = 1; i <= n; i++) {
                if (i != s){
                    if (chuaXet[i])
                        System.out.print("No path");
                    else {
                        Stack<Integer> stack = new Stack<>();
                        stack.push(i);
                        while (stack.peek() != s)
                            stack.push(truoc[stack.peek()]);
                        while (!stack.empty())
                            System.out.print(stack.pop() + " ");
                    }
                    System.out.println();
                }
            }
        }
    }

    private static void bfs(int s) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(s);
        chuaXet[s] = false;
        while (!queue.isEmpty()){
            int u = queue.poll();
            for (int v : dsKe[u]){
                if (chuaXet[v]){
                    queue.add(v);
                    chuaXet[v] = false;
                    truoc[v] = u;
                }
            }
        }
    }
}
