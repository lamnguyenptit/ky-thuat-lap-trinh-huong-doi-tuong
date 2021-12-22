package com.hptn.lam.coban;

import java.util.Scanner;

public class XauNhiPhanKeTiep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0){
            System.out.println(xauNhiPhanKeTiep(scanner.nextLine()));
        }
    }

    private static String xauNhiPhanKeTiep(String x) {
        int length = x.length();
        int i;
        for (i = length - 1; i >= 0; i--) {
            if (x.charAt(i) == '0'){
                x = x.substring(0, i) + '1' + x.substring(i + 1);
                break;
            }
            else
                x = x.substring(0, i) + '0' + x.substring(i + 1);
        }
//        if (i < 0)
//            x = "1" + x;
        return x;
    }
}
