package com.hptn.lam.coban;

import java.util.Scanner;

public class SoLienKe {
    static boolean check;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            check = true;
            char[] s = scanner.next().toCharArray();
            for (int i = 0; i < s.length-1; i++) {
                if (Math.abs(s[i] - s[i+1]) != 1) {
                    check = false;
                    break;
                }
            }
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
