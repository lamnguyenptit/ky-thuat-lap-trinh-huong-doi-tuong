package com.hptn.lam.huongdoituong.tinhthunhapgiaovien;

public class GiaoVien {
    private String ma, chucVu, hoTen;
    private long thuNhap;
    private int luongCoBan, heSo;

    public GiaoVien(String ma, String hoTen, long luong) {
        this.ma = ma;
        this.chucVu = ma.substring(0, 2);
        this.heSo = Integer.parseInt(ma.substring(2));
        this.hoTen = hoTen;
        if (chucVu.equals("HT"))
            this.luongCoBan = 2000000;
        else if (chucVu.equals("HP"))
            this.luongCoBan = 900000;
        else
            this.luongCoBan = 500000;
        thuNhap = luong * heSo + luongCoBan;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + heSo + " " + luongCoBan + " " + thuNhap;
    }
}
