package com.hptn.lam.coban;

import java.util.*;

public class ToHopTiepTheo {
    private static int[] a, b;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt(), k = sc.nextInt();
            a = new int[n+1];
            b = new int[n+1];
            for (int i = 1; i <= k; i++) {
                a[i] = sc.nextInt();
                b[i] = a[i];
            }
            System.out.println(xuLy(n, k));
        }
    }

    private static int xuLy(int n, int k) {
        int i = k, count = 0;
        while (i > 0 && a[i] == n-k+i)
            --i;
        if (i <= 0){
//            for (int j = 1; j <= k; j++)
//                a[j] = j;
            return k;
        }
        else {
            a[i] = a[i] + 1;
            for (int j = i+1; j <= k; j++) {
                a[j] = a[j-1]+1;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int j = 1; j <= k; j++) {
            list.add(a[j]);
            System.out.print(a[j] + " ");
        }
        for (int j = 1; j <= k; j++) {
            if (!list.contains(b[j]))
                ++count;
        }
        return count;
    }
}
