package com.hptn.lam.huongdoituong.hoadon;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        List<KhachHang> khachHangs = new ArrayList<>();
        List<MatHang> matHangs = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            KhachHang khachHang = new KhachHang(i, sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
            khachHangs.add(khachHang);
        }
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            sc.nextLine();
            MatHang matHang = new MatHang(i, sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
            matHangs.add(matHang);
        }
        int k = sc.nextInt();
        for (int i = 1; i <= k; i++) {
            String maKH = sc.next(), maMH = sc.next();
            int soLuong = sc.nextInt();
            HoaDon hoaDon = new HoaDon(i, soLuong);
            for (KhachHang kh: khachHangs){
                if (kh.getMa().equals(maKH)){
                    hoaDon.setKhachHang(kh);
                    break;
                }
            }
            for (MatHang mh: matHangs){
                if (mh.getMa().equals(maMH)){
                    hoaDon.setMatHang(mh);
                    break;
                }
            }
            System.out.println(hoaDon);
        }
    }
}
