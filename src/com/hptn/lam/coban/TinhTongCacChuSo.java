package com.hptn.lam.coban;

import java.util.Arrays;
import java.util.Scanner;

public class TinhTongCacChuSo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            char[] s = scanner.next().toCharArray();
            Arrays.sort(s);
            int tong = 0;
            for (char c : s) {
                if (Character.isDigit(c))
                    tong += (c - '0');
                else
                    System.out.print(c);
            }
            System.out.println(tong);
        }
    }
}
