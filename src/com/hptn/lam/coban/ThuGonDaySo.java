package com.hptn.lam.coban;

import java.util.Scanner;

public class ThuGonDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int count = n;
        for (int i = 0; i < n; i++)
            a[i] = scanner.nextInt();
        for (int i = 0; i < n - 1; i++) {
            if ((a[i] + a[i+1]) % 2 == 0){
                --count;
                ++i;
            }
        }
        System.out.println(count);
    }
}
