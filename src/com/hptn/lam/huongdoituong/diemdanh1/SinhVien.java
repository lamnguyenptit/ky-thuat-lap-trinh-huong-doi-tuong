package com.hptn.lam.huongdoituong.diemdanh1;

public class SinhVien {
    private String ma, hoTen, lop;
    private char[] diemDanh;
    private int diemCC;

    public SinhVien(String ma, String hoTen, String lop) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.lop = lop;
    }

    private int tinhDiemCC() {
        int diem = 10;
        for (char c : diemDanh) {
            if (c == 'v')
                diem -= 2;
            else if (c == 'm')
                --diem;
        }
        return Math.max(diem, 0);
    }

    public String getMa() {
        return ma;
    }

    public void setDiemDanh(char[] diemDanh) {
        this.diemDanh = diemDanh;
        this.diemCC = tinhDiemCC();
    }

    @Override
    public String toString() {
        if (diemCC == 0)
            return ma + " " + hoTen + " " + lop + " " + diemCC + " KDDK";
        return ma + " " + hoTen + " " + lop + " " + diemCC;
    }
}
