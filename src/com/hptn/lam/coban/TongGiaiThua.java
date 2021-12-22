package com.hptn.lam.coban;

import java.util.Scanner;

public class TongGiaiThua {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(tinhTongGiaiThua(n));
    }

    private static long tinhTongGiaiThua(int n) {
        long s = 0;
        for (int i = 1; i <= n; i++) {
            s += tinhGiaiThua(i);
        }
        return s;
    }

    private static long tinhGiaiThua(int n) {
        long giaiThua = 1;
        if(n > 1) {
            for (int i = 2; i <= n; i++) {
                giaiThua *= i;
            }
        }
        return giaiThua;
    }
}
