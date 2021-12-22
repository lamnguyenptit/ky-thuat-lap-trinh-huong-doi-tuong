package com.hptn.lam.coban;

import java.util.Scanner;

public class SapXepChon {
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
        int minIndex, temp, k = 1;
        for (int i = 0; i < n - 1; i++) {
            minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (a[minIndex] > a[j])
                    minIndex = j;
            }
            if (minIndex != i){
                temp = a[i];
                a[i] = a[minIndex];
                a[minIndex] = temp;
            }
            System.out.print("\nBuoc " + k++ + ":");
            for (int j = 0; j < n; j++) {
                System.out.print(" " + a[j]);
            }
        }
    }
}
