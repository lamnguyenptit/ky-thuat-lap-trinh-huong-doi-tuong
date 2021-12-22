package com.hptn.lam.coban;

import java.util.Scanner;

public class TapHopSoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), m = sc.nextInt();
        int[] a = new int[1001];
        int[] b = new int[1001];
        for (int i = 0; i < n; i++)
            a[sc.nextInt()] = 1;
        for (int i = 0; i < m; i++)
            b[sc.nextInt()] = 1;
        for (int i = 0; i < 1001; i++) {
            if(a[i] == 1 && b[i] == 1)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 1001; i++) {
            if (a[i] == 1 && b[i] != 1)
                System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < 1001; i++) {
            if (b[i] == 1 && a[i] != 1)
                System.out.print(i + " ");
        }
    }
}
