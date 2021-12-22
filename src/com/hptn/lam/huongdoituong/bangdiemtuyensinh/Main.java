package com.hptn.lam.huongdoituong.bangdiemtuyensinh;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        int n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            System.out.println(thiSinh);
        }
    }
}
