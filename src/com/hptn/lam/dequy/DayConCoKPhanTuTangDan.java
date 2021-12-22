package com.hptn.lam.dequy;

import java.util.*;

public class DayConCoKPhanTuTangDan {
//    static int n, k, a[], c[];
//    static boolean[] b;
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int t = scanner.nextInt();
//        while (t-- > 0){
//            n = scanner.nextInt();
//            k = scanner.nextInt();
//            a = new int[n+1];
//            c = new int[n+1];
//            b = new boolean[n+1];
//            for (int i = 1; i <= n; i++)
//                a[i] = scanner.nextInt();
//            Arrays.sort(a);
//            quayLui(1);
//        }
//    }
//
//    private static void quayLui(int i) {
//        for (int j = i; j <= n-k+i; j++) {
//            if (!b[j]){
//                c[i] = a[j];
//                b[j] = true;
//                if (i == k)
//                    in();
//                else
//                    quayLui(i+1);
//                b[j] = false;
//            }
//        }
//    }
//
//    private static void in() {
//        for (int i = 1; i <= k; i++)
//            System.out.print(c[i] + " ");
//        System.out.println();
//    }
    private static int n, k, a[] = new int[20], c[] = new int[20];
    private static boolean[] b = new boolean[20];
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            n = scanner.nextInt();
            k = scanner.nextInt();
            for (int i = 1; i <= n; i++)
                c[i] = scanner.nextInt();
            Arrays.sort(c);

            quayLui(1);
        }
    }

    private static void quayLui(int i) {
        for (int j = 1; j <= n-k+i; j++) {
            if (!b[j]){
                a[i] = j;
                b[j] = true;
                if (i == k)
                    in();
                else
                    quayLui(i+1);
                b[j] = false;
            }
        }
    }

    private static void in() {
        for (int i = 1; i <= n; i++)
            System.out.print(c[a[i]]);
        System.out.println();
    }
}
