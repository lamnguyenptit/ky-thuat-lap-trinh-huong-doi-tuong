package com.hptn.lam.huongdoituong.lietkesinhvientheonganh;

public class SinhVien {
    private String ma, hoTen, lop, email, nganh;

    public SinhVien(String ma, String hoTen, String lop, String email) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
        this.email = email;
        this.nganh = nganh();
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + lop + " " + email;
    }

    public String getNganh() {
        return nganh;
    }

    public String getLop() {
        return lop;
    }

    private String nganh(){
        String nganh = this.ma.substring(3, 7);
        switch (nganh) {
            case "DCKT":
                return "KE TOAN";
            case "DCCN":
                return "CONG NGHE THONG TIN";
            case "DCAT":
                return "AN TOAN THONG TIN";
            case "DCVT":
                return "VIEN THONG";
            default:
                return "DIEN TU";
        }
    }
}
