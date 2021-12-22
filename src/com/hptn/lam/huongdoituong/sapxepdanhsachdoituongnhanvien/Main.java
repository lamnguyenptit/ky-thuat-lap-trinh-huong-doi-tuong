package com.hptn.lam.huongdoituong.sapxepdanhsachdoituongnhanvien;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner in = new Scanner(System.in);
        List<NhanVien> ds = new ArrayList<>();
        int n = Integer.parseInt(in.nextLine());
        for (int i = 1; i <= n; i++) {
            NhanVien nhanVien = new NhanVien(i, in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine(), in.nextLine());
            ds.add(nhanVien);
        }
        Collections.sort(ds);
        for (NhanVien tmp : ds)
            System.out.println(tmp);
    }
}
