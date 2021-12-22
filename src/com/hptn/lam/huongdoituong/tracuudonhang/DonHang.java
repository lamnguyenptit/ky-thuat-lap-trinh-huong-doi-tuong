package com.hptn.lam.huongdoituong.tracuudonhang;

public class DonHang {
    private String ma, ten;
    private long gia;
    private int soLuong;

    public DonHang(String ten, String ma, long gia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + ma.substring(1, 4) + " " + giaGiam() + " " + (soLuong*gia - giaGiam());
    }

    private long giaGiam(){
        if (this.ma.charAt(4) == '1')
            return gia*soLuong / 2;
        return gia*soLuong*3 / 10;
    }
}
