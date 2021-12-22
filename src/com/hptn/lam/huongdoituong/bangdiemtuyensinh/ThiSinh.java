package com.hptn.lam.huongdoituong.bangdiemtuyensinh;

import java.text.DecimalFormat;

public class ThiSinh {
    private String ma, hoTen, trangThai;
    private float toan, ly, hoa, diemUT, tongDiem;
    private DecimalFormat format;

    public ThiSinh(String ma, String hoTen, float toan, float ly, float hoa) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        this.diemUT = tinhDiemUT(ma);
        this.tongDiem = tinhTongDiem();
        this.trangThai = timTrangThai();
        format = new DecimalFormat("0.#");
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + format.format(diemUT) + " " + format.format((tongDiem-diemUT)) + " " + trangThai;
    }

    private float tinhDiemUT(String ma){
        String tmp = ma.substring(0, 3);
        if (tmp.equals("KV1"))
            return 0.5f;
        else if (tmp.equals("KV2"))
            return 1f;
        else
            return 2.5f;
    }

    private float tinhTongDiem(){
        return toan*2 + ly + hoa+ diemUT;
    }

    private String timTrangThai(){
        if (tongDiem >= 24)
            return "TRUNG TUYEN";
        else
            return "TRUOT";
    }
}
