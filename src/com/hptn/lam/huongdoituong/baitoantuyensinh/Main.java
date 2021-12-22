package com.hptn.lam.huongdoituong.baitoantuyensinh;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        ThiSinh thiSinh = new ThiSinh(scanner.nextLine(), scanner.nextLine(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.println(thiSinh);
    }
}
