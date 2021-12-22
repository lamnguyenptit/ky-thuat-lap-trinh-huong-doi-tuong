package com.hptn.lam.huongdoituong.danhsachmathang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        List<MatHang> rs = new ArrayList<>();
        for (int i = 1; i <= t; i++) {
            sc.nextLine();
            MatHang matHang = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            rs.add(matHang);
        }
        Collections.sort(rs);
        for (MatHang matHang : rs)
            System.out.println(matHang);
    }
}
