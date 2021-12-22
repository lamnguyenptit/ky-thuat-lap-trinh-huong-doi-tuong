package com.hptn.lam.huongdoituong.timthukhoacuakythi;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ThiSinh implements Comparable<ThiSinh>{
    private int ma;
    private String ten;
    private Date ngaySinh;
    private float diem1, diem2, diem3, tong;

    public ThiSinh(int ma, String ten, String ngaySinh, float diem1, float diem2, float diem3) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.diem1 = diem1;
        this.diem2 = diem2;
        this.diem3 = diem3;
        this.tong = diem1 + diem2 + diem3;
    }

    public float getTong() {
        return tong;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + new SimpleDateFormat("d/M/yyyy").format(ngaySinh) + " " + tong;
    }

    @Override
    public int compareTo(ThiSinh o) {
        return ma - o.ma;
    }
}
