package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KiemTraChuTrinh {
    private static List<Integer>[] dsKe = new List[1005];
    private static boolean[] chuaXet = new boolean[1005];
    private static int[] truoc = new int[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), m = sc.nextInt();
            boolean check = false;
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
                if (chuaXet[i] && dfs(i)){
                    check = true;
                    break;
                }
            }
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean dfs(int u){
        chuaXet[u] = false;
        for (Integer v : dsKe[u]){
            if (chuaXet[v]){
                truoc[v] = u;
                if (dfs(v))
                    return true;
            }
            else if (v != truoc[u]){
//                start = v;
//                end = u;
                return true;
            }
        }
        return false;
    }

    //Có hướng
//    private static boolean dfs(int u){
//        chuaXet[u] = 1;
//        for (Integer v : dsKe[u]){
//            if (chuaXet[v] == 0){
//                if (dfs(v))
//                    return true;
//            }
//            else if (chuaXet[v] == 1)
//                return true;
//        }
//        chuaXet[u] = 2;
//        return false;
//    }
}
