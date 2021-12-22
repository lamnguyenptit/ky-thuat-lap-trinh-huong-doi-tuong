package com.hptn.lam.coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SapXepChonLietKeNguoc {
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
        int minIndex, temp, k = 1;
        List<String> ds = new ArrayList<>();
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
