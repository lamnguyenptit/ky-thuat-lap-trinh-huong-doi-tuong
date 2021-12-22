package com.hptn.lam.coban;

import java.math.BigInteger;
import java.util.Scanner;

public class TachDoiVaTinhTong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        while (s.length() > 1){
            s = xuLy(s);
            System.out.println(s);
        }
    }

    private static String xuLy(String s) {
        BigInteger n = new BigInteger(s.substring(0, s.length()/2));
        BigInteger m = new BigInteger(s.substring(s.length()/2));
        return String.valueOf(m.add(n));
    }
}
