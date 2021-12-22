package com.hptn.lam.coban;

import java.math.BigInteger;
import java.util.Scanner;

public class UocSoChungLonNhatCuaSoNguyenLon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            long a = scanner.nextLong();
            BigInteger b = scanner.nextBigInteger();
            System.out.println(b.gcd(BigInteger.valueOf(a)));
        }
    }
}
