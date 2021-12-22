package com.hptn.lam.huongdoituong.tinhgiochuanchotunggiangvien;

public class GiangVien {
    private final String ma;
    private final String ten;
    private Mon mon;

    public GiangVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }

    public Mon getMon() {
        return mon;
    }

    public String getMa() {
        return ma;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    public String getTen() {
        return ten;
    }
}
