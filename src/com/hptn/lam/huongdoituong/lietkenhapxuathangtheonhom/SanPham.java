package com.hptn.lam.huongdoituong.lietkenhapxuathangtheonhom;

public class SanPham implements Comparable<SanPham>{
    private String ma;
    private int soLuongNhap, soLuongXuat, thue, donGia;
    private long tien;

    public SanPham(String ma, int soLuongNhap) {
        this.ma = ma;
        this.soLuongNhap = soLuongNhap;
        this.soLuongXuat = tinhSoLuongXuat();
        this.donGia = tinhDonGia();
        this.tien = (long) soLuongXuat *donGia;
        this.thue = tinhThue();
    }

    public String getMa() {
        return ma;
    }

    @Override
    public String toString() {
        return ma + " " + soLuongNhap + " " + soLuongXuat + " " + donGia + " " + tien + " " + thue;
    }

    private int tinhThue() {
        if (ma.charAt(0) == 'A' && ma.charAt(4) == 'Y')
            return (int) (tien*0.08);
        else if (ma.charAt(0) == 'A' && ma.charAt(4) == 'N')
            return (int) (tien*0.11);
        else if (ma.charAt(0) == 'B' && ma.charAt(4) == 'Y')
            return (int) (tien*0.17);
        return (int) (tien*0.22);
    }

    private int tinhDonGia() {
        if (ma.charAt(4) == 'Y')
            return 110000;
        return 135000;
    }

    private int tinhSoLuongXuat(){
        if (ma.charAt(0) == 'A')
            return (int) Math.round(soLuongNhap*0.6);
        return (int) Math.round(soLuongNhap*0.7);
    }

    @Override
    public int compareTo(SanPham o) {
        return o.thue - this.thue;
    }
}
