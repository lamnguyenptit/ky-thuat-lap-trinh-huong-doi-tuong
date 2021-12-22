package com.hptn.lam.quyhoachdong;

import java.util.Scanner;

public class XauConDoiXungDaiNhat {
    static boolean[][] f;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            char[] s = scanner.next().toCharArray();
            System.out.println(qhd(s));
        }
    }

    private static int qhd(char[] s) {
        int n = s.length, result = 1;
        f = new boolean[n+1][n+1];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                f[i][j] = i == j;
            }
        }
        for (int k = 1; k < n; k++) {
            for (int i = 0; i < n-k; i++) {
                int j = i + k;
                if (s[i] == s[j]){
                    if(k == 1)
                        f[i][j] = true;
                    else
                        f[i][j] = f[i+1][j-1];
                }
                if (f[i][j])
                    result = Math.max(result, j-i+1);
            }
        }
        return result;
    }
}
