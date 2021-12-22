package com.hptn.lam.huongdoituong.tinhgiochuanchotunggiangvien;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<Mon> mons = new ArrayList<>();
        List<GiangVien> giangViens = new ArrayList<>();
        List<Lop> lops = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- >0){
            Mon mon = new Mon(sc.next(), sc.nextLine().substring(1));
            mons.add(mon);
        }
        n = Integer.parseInt(sc.nextLine());
        while (n-- >0){
            GiangVien giangVien = new GiangVien(sc.next(), sc.nextLine().substring(1));
            giangViens.add(giangVien);
        }
        n = sc.nextInt();
        while (n-- >0){
            String maGV = sc.next(), maMon = sc.next();
            float gio = sc.nextFloat();
            Lop lop = new Lop(gio);
            for(GiangVien g : giangViens){
                if (g.getMa().equals(maGV)) {
                    lop.setGiangVien(g);
                    break;
                }
            }
            for (Mon mon : mons){
                if (mon.getMa().equals(maMon)){
                    lop.setMon(mon);
                    break;
                }
            }
            lops.add(lop);
        }
        String maGV = sc.next();
        for(GiangVien g : giangViens){
            if (g.getMa().equals(maGV)) {
                System.out.println("Giang vien: " + g.getTen());
                float tong = 0f;
                for (Lop lop : lops){
                    if (lop.getGiangVien().getMa().equals(maGV)){
                        System.out.println(lop.getMon().getTen() + " " + lop.getGio());
                        tong += lop.getGio();
                    }
                }
                System.out.println("Tong: " + String.format("%.2f", tong));
                break;
            }
        }
    }
}
