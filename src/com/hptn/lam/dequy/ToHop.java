package com.hptn.lam.dequy;

import java.util.Scanner;

public class ToHop {
    static int n, k, c[] = new int[30];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        k = scanner.nextInt();
        quayLui(1);
    }

    private static void quayLui(int i) {
        for (int j = c[i-1] + 1; j <= n-k+i; j++) {
            c[i] = j;
            if (i == k)
                in();
            else
                quayLui(i+1);
        }
    }

    private static void in() {
        for (int i = 1; i <= k; i++)
            System.out.print(c[i] + " ");
        System.out.println();
    }
}
