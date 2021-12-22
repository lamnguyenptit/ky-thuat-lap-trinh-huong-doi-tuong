package com.hptn.lam.coban;

import java.util.Scanner;

public class SoNguyenTo {
    private static boolean isPrime(int n){
        if (n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int t, n;
        Scanner scanner = new Scanner(System.in);
        t = scanner.nextInt();
        while (t-- > 0){
            n = scanner.nextInt();
            if (isPrime(n))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
