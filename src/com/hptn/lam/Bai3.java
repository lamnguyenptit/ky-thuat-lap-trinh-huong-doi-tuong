package com.hptn.lam;

import java.util.Scanner;

public class Bai3 {
    static int[] a = new int[15];
    static int n;
    static boolean[] b = new boolean[15];
    static boolean check;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            n = scanner.nextInt();
            quayLui(1);
        }
    }

    private static void quayLui(int i) {
        for (int j = 1; j <= n; j++) {
            if (!b[j]){
                a[i] = j;
                b[j] = true;
                if (i == n)
                    xuLy();
                else
                    quayLui(i+1);
                b[j] = false;
            }
        }
    }

    private static void xuLy() {
        check = true;
        for (int i = 1; i < n; i++) {
            if(Math.abs(a[i+1] - a[i]) == 1){
                check = false;
                break;
            }
        }
        if (check){
            for (int i = 1; i <= n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
        }
    }
}
