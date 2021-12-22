package com.hptn.lam.huongdoituong.sapxepdonhang;

public class DonHang implements Comparable<DonHang>{
    private String ma, ten;
    private long gia, tongGia;
    private int soLuong;

    public DonHang(String ten, String ma, long gia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.gia = gia;
        this.soLuong = soLuong;
        this.tongGia = soLuong*gia - giaGiam();
    }

    public long getTongGia() {
        return tongGia;
    }

    @Override
    public String toString() {
        return ten + " " + ma + " " + ma.substring(1, 4) + " " + giaGiam() + " " + tongGia;
    }

    private long giaGiam(){
        if (this.ma.charAt(4) == '1')
            return gia*soLuong / 2;
        return
                gia*soLuong*3 / 10;
    }

    @Override
    public int compareTo(DonHang o) {
        return ma.substring(1, 4).compareTo(o.ma.substring(1, 4));
    }
}
