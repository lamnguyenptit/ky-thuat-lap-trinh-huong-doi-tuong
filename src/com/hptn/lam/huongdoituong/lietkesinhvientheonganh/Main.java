package com.hptn.lam.huongdoituong.lietkesinhvientheonganh;

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
            String nganh = scanner.nextLine().toUpperCase();
            System.out.println("DANH SACH SINH VIEN NGANH " + nganh + ":");
            for (SinhVien sinhVien : ds){
                if (nganh.equals("CONG NGHE THONG TIN") || nganh.equals("AN TOAN THONG TIN")){
                    if (sinhVien.getLop().charAt(0) == 'E')
                        continue;
                }
                if (sinhVien.getNganh().equals(nganh))
                    System.out.println(sinhVien);
            }
        }
    }
}
