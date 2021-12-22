package com.hptn.lam.huongdoituong.tinhtien;

public class HoaDon implements Comparable<HoaDon>{
    private String ma, ten;
    private int soLuong, chietKhau;
    private long donGia, tongTien;

    public HoaDon(String ma, String ten, int soLuong, long donGia, int chietKhau) {
        this.ma = ma;
        this.ten = ten;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
        this.tongTien = donGia * soLuong - chietKhau;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + soLuong + " " + donGia + " " + chietKhau + " " + tongTien;
    }

    @Override
    public int compareTo(HoaDon o) {
        long tmp = o.tongTien - tongTien;
        if (tmp > 0)
            return 1;
        else if (tmp == 0)
            return 0;
        return -1;
    }
}
