package com.hptn.lam.coban;

import java.util.Scanner;

public class GiaoCuaHaiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] a = new int[n];
        int[] b = new int[m];
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < m; i++)
            b[i] = scanner.nextInt();
        int A[] = new int[1000], B[] = new int[1000];
        for (int i = 0; i < n; i++)
            A[a[i]] = 1;
        for (int i = 0; i < n; i++)
            B[b[i]] = 1;
        for (int i = 0; i < 1000; i++) {
            if (A[i] > 0 && B[i] > 0)
                System.out.print(i + " ");
        }
    }
}
