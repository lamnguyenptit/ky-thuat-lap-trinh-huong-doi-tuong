package com.hptn.lam.coban;

import java.util.Scanner;

public class HoanViKeTiep {
    static int[] x;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            x = new int[n+1];
            for (int i = 1; i <= n; i++)
                x[i] = scanner.nextInt();
            xuLy(n);
            System.out.println();
        }
    }

    private static void xuLy(int n) {
        int i = n-1, temp;
        while (i > 0 && x[i] > x[i+1])
            --i;
        if (i <= 0){
            for (int j = 1; j <= n; j++)
                x[j] = j;
        }
        else {
            int j = n;
            while (j > i && x[j] < x[i])
                --j;
            temp = x[i];
            x[i] = x[j];
            x[j] = temp;
            int l = i+1, r = n;
            while (l < r){
                temp = x[r];
                x[r] = x[l];
                x[l] = temp;
                ++l;
                --r;
            }
        }
        for (int j = 1; j <= n; j++) {
            System.out.print(x[j] + " ");
        }
    }
}
