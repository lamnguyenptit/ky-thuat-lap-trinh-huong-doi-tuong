package com.hptn.lam.coban;

import java.util.Arrays;
import java.util.Scanner;

public class TongNhoNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            long c = 0, l = 0;
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            Arrays.sort(a);
            if (a[0] == 0){
                for (int i = 1; i < n; i++) {
                    if (i % 2 == 0)
                        c = c*10 + a[i];
                    else
                        l = l*10 + a[i];
                }
            }
            else {
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0)
                        c = c*10 + a[i];
                    else
                        l = l*10 + a[i];
                }
            }
            System.out.println(c+l);
        }
    }
}
