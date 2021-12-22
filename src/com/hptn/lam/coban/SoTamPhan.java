package com.hptn.lam.coban;

import java.util.Scanner;

public class SoTamPhan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        int t = scanner.nextInt();
        while (t-- > 0){
            int n = scanner.nextInt();
            check = true;
            while (n > 0){
                int m = n % 10;
                if (m - 2 > 0){
                    check = false;
                    break;
                }
                n /= 10;
            }
            if (check)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
