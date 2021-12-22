package com.hptn.lam.huongdoituong.sapxepsinhvientheolop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            ds.add(sinhVien);
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds)
            System.out.println(sinhVien);
    }
}
