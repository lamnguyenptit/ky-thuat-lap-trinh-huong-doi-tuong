package com.hptn.lam.huongdoituong.lietkenhapxuathangtheonhom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<SanPham> ds = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            SanPham sanPham = new SanPham(sc.next(), sc.nextInt());
            ds.add(sanPham);
        }
        String nhom = sc.next();
        Collections.sort(ds);
        for (SanPham sanPham : ds){
            if (String.valueOf(sanPham.getMa().charAt(0)).equals(nhom))
                System.out.println(sanPham);
        }
    }
}
