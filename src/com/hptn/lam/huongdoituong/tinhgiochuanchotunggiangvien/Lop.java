package com.hptn.lam.huongdoituong.tinhgiochuanchotunggiangvien;

public class Lop {
    private GiangVien giangVien;
    private Mon mon;
    private float gio;

    public Lop(float gio) {
        this.gio = gio;
    }

    public GiangVien getGiangVien() {
        return giangVien;
    }

    public void setGiangVien(GiangVien giangVien) {
        this.giangVien = giangVien;
    }

    public Mon getMon() {
        return mon;
    }

    public void setMon(Mon mon) {
        this.mon = mon;
    }

    public float getGio() {
        return gio;
    }
}
