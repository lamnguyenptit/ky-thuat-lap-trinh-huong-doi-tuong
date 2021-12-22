package com.hptn.lam.dequy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LietKeTapCon {
    static int n, b[] = new int[30];
    static String s;
    static List<String> result = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0){
            b = new int[30];
            result = new ArrayList<>();
            n = scanner.nextInt();
            s = scanner.next();
            quayLui(1);

            Collections.sort(result);
            for (String s : result)
                System.out.print(s + " ");
            System.out.println();
        }
    }

    private static void quayLui(int i) {
        for (int j = 0; j <= 1; j++) {
            b[i] = j;
            if (i == n)
                xuLy();
            else
                quayLui(i + 1);
        }
    }

    private static void xuLy() {
        StringBuilder tmp = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            if (b[i] == 1)
                tmp.append(s.charAt(i - 1));
        }
        result.add(tmp.toString());
    }
}
