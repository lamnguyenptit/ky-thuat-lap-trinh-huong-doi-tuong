package com.hptn.lam.dequy;

import java.util.Scanner;

public class GapDoiDaySo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            long k = scanner.nextLong();
            System.out.println(quayLui(n, k));
        }
    }

    private static int quayLui(int n, long k) {
        if (k == 1)
            return 1;
        if (k == Math.pow(2, n-1))
            return n;
        if (k < Math.pow(2, n-1))
            return quayLui(n-1, k);
        return quayLui(n-1, (long) (k-Math.pow(2, n-1)));
    }
}
