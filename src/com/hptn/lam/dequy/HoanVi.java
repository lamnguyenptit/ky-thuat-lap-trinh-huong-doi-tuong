package com.hptn.lam.dequy;

import java.util.Scanner;

public class HoanVi {
    static int a[] = new int[15], n;
    static boolean[] b = new boolean[15];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        quayLui(1);
    }

    private static void quayLui(int i) {
        for (int j = 1; j <= n; j++) {
            if (!b[j]){
                a[i] = j;
                b[j] = true;
                if (i == n)
                    in();
                else
                    quayLui(i+1);
                b[j] = false;
            }
        }
    }

    private static void in() {
        for (int i = 1; i <= n; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
}
