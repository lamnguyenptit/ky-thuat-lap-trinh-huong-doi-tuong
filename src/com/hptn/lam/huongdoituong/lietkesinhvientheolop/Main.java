package com.hptn.lam.huongdoituong.lietkesinhvientheolop;

import java.util.ArrayList;
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
        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String lop = scanner.nextLine();
            System.out.println("DANH SACH SINH VIEN LOP " + lop + ":");
            for (SinhVien sinhVien : ds){
                if (sinhVien.getLop().equals(lop))
                    System.out.println(sinhVien);
            }
        }
    }
}
