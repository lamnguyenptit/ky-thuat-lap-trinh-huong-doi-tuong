package com.hptn.lam.coban;

import java.util.Scanner;

public class MangDoiXung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            if (isDoiXung(a, n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean isDoiXung(int[] a, int n){
        int d = 0, c = n - 1;
        while (d < c){
            if (a[d] != a[c])
                return false;
            ++d;
            --c;
        }
        return true;
    }
}
