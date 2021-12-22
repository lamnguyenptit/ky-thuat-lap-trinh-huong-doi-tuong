package com.hptn.lam.coban;

import java.util.Scanner;

public class SoKhoiLapPhuong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long max = -1;
            String s = sc.next();
            StringBuilder builder;
            for (int i = 0; i < s.length(); i++) {
                builder = new StringBuilder(s);
                builder.deleteCharAt(i);
                if (isSoKhoiLapPhuong(builder.toString()))
                    if (max < Long.parseLong(builder.toString()))
                        max = Long.parseLong(builder.toString());
            }
            System.out.println(max);
        }
    }

    private static boolean isSoKhoiLapPhuong(String tmp) {
        long n = Long.parseLong(tmp);
        long rs = 1, i = 1;
        while (rs <= n){
            if (i*i*i == n)
                return true;
            rs = i*i*i;
            ++i;
        }
        return false;
    }
}
