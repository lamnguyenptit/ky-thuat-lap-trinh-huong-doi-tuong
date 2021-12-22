package com.hptn.lam.huongdoituong.danhsachmathang;

public class MatHang implements Comparable<MatHang>{
    private String ma, ten, donVi;
    private int giaMua, giaBan, loiNhuan;

    public MatHang(int ma, String ten, String donVi, int giaMua, int giaBan) {
        this.ma = "MH" + String.format("%03d", ma);
        this.ten = ten;
        this.donVi = donVi;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
        this.loiNhuan = giaBan - giaMua;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + donVi + " " + giaMua + " " + giaBan + " " + loiNhuan;
    }

    @Override
    public int compareTo(MatHang o) {
        if (loiNhuan == o.loiNhuan)
            return ma.compareTo(o.ma);
        else
            return o.loiNhuan - loiNhuan;
    }
}
