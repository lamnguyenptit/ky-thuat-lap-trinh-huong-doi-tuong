package com.hptn.lam.huongdoituong.lophocphan2;

public class Mon {
    private String ten, ma;

    public Mon(String ma, String ten) {
        this.ten = ten;
        this.ma = ma;
    }

    public Mon() {
    }

    public String getTen() {
        return ten;
    }

    public String getMa() {
        return ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

}
