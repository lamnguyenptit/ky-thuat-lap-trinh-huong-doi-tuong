package com.hptn.lam.dequy;

import java.util.*;

public class DiChuyenTrongMeCung {
    private static int n;
    private static int[][] a;
    private static boolean check;
    private static List<String> rs;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            a = new int[n+1][n+1];
            rs = new ArrayList<>();
            check = false;
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= n; j++) {
                    a[i][j] = sc.nextInt();
                }
            }
            xuLy(1, 1, "");
            if (check){
                Collections.sort(rs);
                for (String tmp : rs) {
                    System.out.print(tmp + " ");
                }
            }
            else
                System.out.print(-1);
            System.out.println();
        }
    }

    private static void xuLy(int i, int j, String s) {
        if (i == 1 && j == 1 && a[i][j] == 0){
            check = false;
            return;
        }
        if (i == n && j == n && a[n][n] != 0){
            rs.add(s);
            check = true;
            return;
        }
        if (i < n && a[i+1][j] != 0)
            xuLy(i+1, j, s+"D");
        if (j < n && a[i][j+1] != 0)
            xuLy(i, j+1, s+"R");
    }
}
