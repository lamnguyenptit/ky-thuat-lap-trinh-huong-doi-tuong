package com.hptn.lam.coban;

import java.util.Scanner;

public class SoKhongLienKe {
    static boolean check;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            check = true;
            char[] s = scanner.next().toCharArray();
            int tong = 0;
            for (int i = 0; i < s.length-1; i++) {
                if (Math.abs(s[i] - s[i+1]) != 2) {
                    check = false;
                    break;
                }
            }
            for (char c : s)
                tong += c - '0';
            if (tong % 10 != 0)
                check = false;
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
