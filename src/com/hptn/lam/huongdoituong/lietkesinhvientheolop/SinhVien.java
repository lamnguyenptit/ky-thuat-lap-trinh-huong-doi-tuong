package com.hptn.lam.huongdoituong.lietkesinhvientheolop;

public class SinhVien {
    private String ma, hoTen, lop, email;

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    public String getLop() {
        return lop;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + email;
    }
}
