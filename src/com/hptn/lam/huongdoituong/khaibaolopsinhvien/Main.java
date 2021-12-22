package com.hptn.lam.huongdoituong.khaibaolopsinhvien;

import java.text.ParseException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.next(), scanner.next(), scanner.nextFloat());
        System.out.println(sinhVien.toString());
    }
}
