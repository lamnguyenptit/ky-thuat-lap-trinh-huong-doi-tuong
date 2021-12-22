package com.hptn.lam.huongdoituong.sapxepsinhvientheolop;

public class SinhVien implements Comparable<SinhVien>{
    private String ma, hoTen, lop, email;

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + email;
    }

    @Override
    public int compareTo(SinhVien o) {
        if (this.lop.compareTo(o.lop) != 0)
            return this.lop.compareTo(o.lop);
        else
            return this.ma.compareTo(o.ma);
    }
}