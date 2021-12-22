package com.hptn.lam.huongdoituong.tinhluong;

public class PhongBan {
    private String ma, ten;

    public PhongBan(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public PhongBan(String ma) {
        this.ma = ma;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
}
