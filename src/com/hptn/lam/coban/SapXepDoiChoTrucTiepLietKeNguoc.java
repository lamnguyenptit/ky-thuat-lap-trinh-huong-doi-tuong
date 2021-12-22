package com.hptn.lam.coban;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SapXepDoiChoTrucTiepLietKeNguoc {
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
        int temp, k = 1;
        ArrayList<String> ds = new ArrayList<>();
        for (int i = 0; i < n - 1; i++) {
            for (int j = i+1; j < n; j++) {
                if (a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
            String tmp = "Buoc " + k++ + ":";
            for (int j = 0; j < n; j++)
                tmp = tmp + " " + a[j];
            ds.add(tmp);
        }
        Collections.reverse(ds);
        for(String tmp : ds)
            System.out.println(tmp);
    }
}
