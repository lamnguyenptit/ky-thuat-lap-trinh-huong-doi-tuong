package com.hptn.lam.dequy;

import java.util.Scanner;

public class TapHop {
    static int n, k, s, count, c[] = new int[30];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true){
            n = scanner.nextInt();
            k = scanner.nextInt();
            s = scanner.nextInt();
            if (n == 0 && k == 0 && s == 0)
                break;
            count = 0;
            quayLui(1);
            System.out.println(count);
        }
    }

    private static void quayLui(int i) {
        for (int j = c[i-1] + 1; j <= n-k+i; j++) {
            c[i] = j;
            if(i == k)
                xuLy();
            else
                quayLui(i+1);
        }
    }

    private static void xuLy() {
        int tong = 0;
        for (int i = 1; i <= k; i++)
            tong += c[i];
        if (tong == s)
            ++count;
    }
}
