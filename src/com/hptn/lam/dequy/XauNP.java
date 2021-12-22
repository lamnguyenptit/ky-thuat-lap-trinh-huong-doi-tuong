package com.hptn.lam.dequy;

import java.util.Scanner;

public class XauNP {
    static int n, b[] = new int[30];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        quayLui(1);
    }

    private static void quayLui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n)
                in();
            else
                quayLui(i + 1);
        }
    }

    private static void in() {
        for (int i = 1; i <= n; i++)
            System.out.print(b[i] + " ");
        System.out.println();
    }
}
