package com.hptn.lam.huongdoituong.tinhthunhapgiaovien;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GiaoVien giaoVien = new GiaoVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLong());
        System.out.println(giaoVien);
    }
}
