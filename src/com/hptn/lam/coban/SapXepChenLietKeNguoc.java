package com.hptn.lam.coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepChenLietKeNguoc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        sortNguoc(a, n);
    }

    private static void sortNguoc(int[] a, int n) {
        List<String> ds = new ArrayList<>();
        int key, j, k = 0;
        for (int i = 0; i < n; i++) {
            key = a[i];
            j = i - 1;
            while (j >= 0 && a[j] > key){
                a[j + 1] = a[j];
                --j;
            }
            a[j + 1] = key;
            String rs = "Buoc " + k++ + ":";
            for (int l = 0; l <= i; l++) {
                rs += " " + a[l];
            }
            ds.add(rs);
        }
        Collections.reverse(ds);
        for (String s : ds)
            System.out.println(s);
    }
}
