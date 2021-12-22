package com.hptn.lam.coban;

import java.util.Scanner;

public class SapXepChen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        sort(a, n);
    }

    private static void sort(int[] a, int n) {
        int key, j, k = 0;
        for (int i = 0; i < n; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                --j;
            }
            a[j + 1] = key;
            System.out.print("\nBuoc " + k++ + ":");
            for (int l = 0; l <= i; l++) {
                System.out.print(" " + a[l]);
            }
        }
    }
}
