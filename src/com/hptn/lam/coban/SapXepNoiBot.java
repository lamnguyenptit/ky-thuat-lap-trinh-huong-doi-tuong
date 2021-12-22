package com.hptn.lam.coban;

import java.util.Scanner;

public class SapXepNoiBot {
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
        int temp, k = 1;
        boolean swapped;
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]){
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped)
                break;
            System.out.print("\nBuoc " + k++ + ":");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + a[j]);
            }
        }
    }
}
