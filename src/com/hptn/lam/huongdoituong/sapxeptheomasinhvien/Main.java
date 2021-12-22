package com.hptn.lam.huongdoituong.sapxeptheomasinhvien;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        Scanner scanner = new Scanner(new File("D:\\IntellIJ Projects\\ky_thuat_lap_trinh_huong_doi_tuong\\src\\com\\hptn\\lam\\huongdoituong\\sapxeptheomasinhvien\\1.txt"));
        Scanner scanner = new Scanner(System.in);
        List<SinhVien> ds = new ArrayList<>();
        while (scanner.hasNextLine()){
            SinhVien sinhVien = new SinhVien(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            ds.add(sinhVien);
        }
        Collections.sort(ds);
        for (SinhVien sinhVien : ds)
            System.out.println(sinhVien);
    }
}
