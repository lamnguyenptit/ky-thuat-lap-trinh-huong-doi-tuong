package com.hptn.lam.dothi.dfs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class DuongDiTheoDFS {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];
    private static int[] truoc = new int[1005];

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

    private static void dfs(int s) {
        chuaXet[s] = false;
        for (int v : dsKe[s]){
            if (chuaXet[v]){
                dfs(v);
                truoc[v] = s;
            }
        }
    }
}
