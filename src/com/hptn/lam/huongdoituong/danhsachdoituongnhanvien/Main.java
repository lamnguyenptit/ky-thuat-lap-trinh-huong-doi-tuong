package com.hptn.lam.huongdoituong.danhsachdoituongnhanvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            NhanVien nhanVien = new NhanVien(i, scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            System.out.println(nhanVien);
        }
    }
}
