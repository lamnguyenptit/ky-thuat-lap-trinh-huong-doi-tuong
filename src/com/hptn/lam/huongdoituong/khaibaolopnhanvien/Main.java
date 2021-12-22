package com.hptn.lam.huongdoituong.khaibaolopnhanvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
        System.out.println(nhanVien);
    }
}
