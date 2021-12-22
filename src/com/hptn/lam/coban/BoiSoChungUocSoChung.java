package com.hptn.lam.coban;

import java.util.Scanner;

public class BoiSoChungUocSoChung {
    private static int gcd(int a, int b){
        while (a != b){
            if (a > b)
                a -= b;
            else
                b -= a;
        }
        return a;
    }

//    private static int gcd(int a, int b){
//        while (a*b != 0){
//            if (a > b)
//                a %= b;
//            else
//                b %= a;
//        }
//        return a + b;
//    }

    private static long lcm(int a, int b){
        return (long) a*b / gcd(a, b);
    }

    public static void main(String[] args) {
        int t, a, b;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t-- > 0){
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(lcm(a, b) + " " + gcd(a, b));
        }
    }
}
