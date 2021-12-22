package com.hptn.lam.coban;

import java.math.BigInteger;
import java.util.Scanner;

public class ChiaHet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            BigInteger a = scanner.nextBigInteger();
            BigInteger b = scanner.nextBigInteger();
            if (a.compareTo(b) > 0){
                if (a.mod(b).equals(new BigInteger("0")))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
            else {
                if (b.mod(a).equals(new BigInteger("0")))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }
}
