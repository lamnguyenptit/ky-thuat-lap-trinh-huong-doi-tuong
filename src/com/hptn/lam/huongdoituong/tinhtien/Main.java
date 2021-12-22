package com.hptn.lam.huongdoituong.tinhtien;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<HoaDon> ds = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            HoaDon hoaDon = new HoaDon(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextLong(), sc.nextInt());
            ds.add(hoaDon);
        }
        Collections.sort(ds);
        for (HoaDon hoaDon : ds)
            System.out.println(hoaDon);
    }
}
