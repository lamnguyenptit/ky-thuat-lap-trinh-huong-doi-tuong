package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BieuDienDoThiCoHuong {
    private static int n, m;
    private static List<Integer>[] dsKe = new List[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            m = sc.nextInt();
            for (int i = 0; i <= n; i++)
                dsKe[i] = new ArrayList<>();
            for (int i = 1; i <= m; i++) {
                int u = sc.nextInt(), v = sc.nextInt();
                dsKe[u].add(v);
            }
            for (int i = 1; i <= n; i++) {
                System.out.print(i + ": " );
                for (Integer tmp : dsKe[i])
                    System.out.print(tmp + " ");
                System.out.println();
            }
        }
    }
}
