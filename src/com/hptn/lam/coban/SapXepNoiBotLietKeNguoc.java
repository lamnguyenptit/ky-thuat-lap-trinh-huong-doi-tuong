package com.hptn.lam.coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepNoiBotLietKeNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            sortNguoc(a, n);
        }
    }

    private static void sortNguoc(int[] a, int n) {
        List<String> ds = new ArrayList<>();
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
            String rs = "Buoc " + k++ + ":";
            for (int j = 0; j < n; j++) {
                rs += " " + a[j];
            }
            ds.add(rs);
        }
        Collections.reverse(ds);
        for (String s : ds)
            System.out.println(s);
    }
}
