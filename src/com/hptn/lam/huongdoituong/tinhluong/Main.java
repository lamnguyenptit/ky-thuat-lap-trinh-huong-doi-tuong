package com.hptn.lam.huongdoituong.tinhluong;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<PhongBan> phongBans = new ArrayList<>();
        List<NhanVien> nhanViens = new ArrayList<>();
        while (n-- > 0){
            PhongBan phongBan = new PhongBan(sc.next(), sc.nextLine().substring(1));
            phongBans.add(phongBan);
        }
        n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            NhanVien nhanVien = new NhanVien(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            nhanViens.add(nhanVien);
        }
        for (PhongBan phongBan : phongBans){
            for (NhanVien nhanVien : nhanViens){
                if (nhanVien.getPhongBan().getMa().equals(phongBan.getMa()))
                    nhanVien.getPhongBan().setTen(phongBan.getTen());
            }
        }
        for (NhanVien nhanVien : nhanViens)
            System.out.println(nhanVien);
    }
}
