package com.hptn.lam.huongdoituong.tinhgiochuanchotunggiangvien;

public class Mon {
    private String ma, ten;

    public Mon(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Mon(String ma) {
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
