package com.hptn.lam.coban;

import java.math.BigInteger;
import java.util.Scanner;

public class BoiSoChungNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        BigInteger a, b;
        while (t-- > 0){
            a = scanner.nextBigInteger();
            b = scanner.nextBigInteger();
            System.out.println(a.multiply(b).divide(a.gcd(b)));
        }
    }
}
