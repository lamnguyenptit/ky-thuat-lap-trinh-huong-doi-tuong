package com.hptn.lam.huongdoituong.tinhgio;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Gamer implements Comparable<Gamer>{
    private String ma, ten;
    private Date gioVao, gioRa;
    private long gio, phut, thoiGianChoi;

    public Gamer(String ma, String ten, String gioVao, String gioRa) throws ParseException {
        this.ma = ma;
        this.ten = ten;
        this.gioVao = new SimpleDateFormat("HH:mm").parse(gioVao);
        this.gioRa = new SimpleDateFormat("HH:mm").parse(gioRa);
        this.thoiGianChoi = this.gioRa.getTime() - this.gioVao.getTime();
        this.gio = TimeUnit.MILLISECONDS.toHours(this.thoiGianChoi);
        this.phut = (this.thoiGianChoi - TimeUnit.HOURS.toMillis(this.gio)) / (60*1000);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + gio + " gio " + phut +" phut";
    }

    @Override
    public int compareTo(Gamer o) {
        return (int) (o.thoiGianChoi - this.thoiGianChoi);
    }
}
