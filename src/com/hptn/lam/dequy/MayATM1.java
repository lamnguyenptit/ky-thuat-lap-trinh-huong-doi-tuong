package com.hptn.lam.dequy;

import java.util.Arrays;
import java.util.Scanner;

public class MayATM1 {
    private static int n, s, count, max;
    private static int[] a;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            n = sc.nextInt();
            s = sc.nextInt();
            a = new int[n];
            count = 0;
            max = 9999999;
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            xuLy(0);
            System.out.println(max);
        }
    }

    private static void xuLy(int i) {
        for (int j = s/a[i]; j >= 0; j--) {
            count += j;
            s -= j*a[i];
            if (s == 0)
                max = count;
            else if (i < n-1 && count + s/a[i+1] < max)
                xuLy(i+1);
            count -= j;
            s += j*a[i];
        }
    }
}
