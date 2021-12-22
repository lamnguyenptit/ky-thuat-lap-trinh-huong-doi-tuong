package com.hptn.lam.huongdoituong.khaibaolopthisinh;

public class ThiSinh {
    private String hoTen, ngaySinh;
    private float d1, d2, d3, tong;

    public ThiSinh(String hoTen, String ngaySinh, float d1, float d2, float d3) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.d1 = d1;
        this.d2 = d2;
        this.d3 = d3;
        this.tong = d1 + d2 + d3;
    }

    @Override
    public String toString() {
        return hoTen + " " + ngaySinh + " " + String.format("%.1f", tong);
    }
}
