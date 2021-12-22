package com.hptn.lam.coban;

import java.util.Scanner;

public class RutGonXauKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i+1)){
                s = removeCharAt(s, i);
                s = removeCharAt(s, i);
                i = -1;
            }
        }
        if (s.isEmpty())
            System.out.println("Empty String");
        else
            System.out.println(s);
    }

    private static String removeCharAt(String s, int pos) {
        return s.substring(0, pos) + s.substring(pos + 1);
    }
}
