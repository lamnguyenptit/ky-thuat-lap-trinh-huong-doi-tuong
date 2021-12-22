package com.hptn.lam.coban;

import java.util.Scanner;

public class UocSoNguyenToLonNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        long n;
        while (t-- > 0){
            n = scanner.nextLong();
            for (long i = 2; i <= Math.sqrt(n); i++) {
                if (i*i == n){
                    n /= i;
                    break;
                }
                while (n%i == 0)
                    n /= i;
            }
            System.out.println(n);
        }
    }
}
