package com.hptn.lam.huongdoituong.diemdanh2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SinhVien> ds = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            SinhVien sinhVien = new SinhVien(sc.nextLine(), sc.nextLine(), sc.nextLine());
            ds.add(sinhVien);
        }
        for (int i = 1; i <= n; i++) {
            String ma = sc.next();
            for (SinhVien sinhVien : ds){
                if (sinhVien.getMa().equals(ma))
                    sinhVien.setDiemDanh(sc.next().toCharArray());
            }
        }
        sc.nextLine();
        String lop = sc.nextLine();
        for (SinhVien sinhVien : ds){
            if (sinhVien.getLop().equals(lop))
                System.out.println(sinhVien);
        }
    }
}
