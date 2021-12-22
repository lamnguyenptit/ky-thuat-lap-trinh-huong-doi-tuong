package com.hptn.lam.huongdoituong.danhsachkhachhang;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        List<KhachHang> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            KhachHang k = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(k);
        }
        Collections.sort(ds);
        for (KhachHang k : ds)
            System.out.println(k);
    }
}
