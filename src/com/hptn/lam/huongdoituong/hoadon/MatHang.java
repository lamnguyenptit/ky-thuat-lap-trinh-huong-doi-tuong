package com.hptn.lam.huongdoituong.hoadon;

public class MatHang {
    private String ma, ten, donVi;
    private int giamMua, giaBan;

    public MatHang(int ma, String ten, String donVi, int giamMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giamMua = giamMua;
        this.giaBan = giaBan;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDonVi() {
        return donVi;
    }

    public int getGiamMua() {
        return giamMua;
    }

    public int getGiaBan() {
        return giaBan;
    }
}
