package com.hptn.lam.coban;

import java.util.Scanner;

public class SoDep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            String s = scanner.next();
            if (isThuanNghich(s) && isChan(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean isChan(String s) {
        for (int i = 0; i < s.length(); i++) {
            int t = s.charAt(i) - '0';
            if (t % 2 == 1)
                return false;
        }
        return true;
    }

    private static boolean isThuanNghich(String s) {
        StringBuilder builder = new StringBuilder(s);
        String rs = builder.reverse().toString();
        return s.equals(rs);
    }
}
