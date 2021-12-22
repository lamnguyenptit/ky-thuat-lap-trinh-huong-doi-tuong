package com.hptn.lam.huongdoituong.lopphanso;

import java.util.StringTokenizer;

public class PhanSo {
    private long tu, mau;

    public PhanSo(String nextLine) {
        StringTokenizer tokenizer = new StringTokenizer(nextLine);
        tu = Long.parseLong(tokenizer.nextToken());
        mau = Long.parseLong(tokenizer.nextToken());
    }

    public PhanSo() {
    }

    @Override
    public String toString() {
        return tu + "/" + mau;
    }

    public void rutGon() {
        long x = UCLN(tu, mau);
        tu /= x;
        mau /= x;
    }

    private long UCLN(long a, long b) {
        long t;
        while (b > 0){
            t = a % b;
            a = b;
            b = t;
        }
        return a;
    }

    public PhanSo cong(PhanSo b) {
        PhanSo c = new PhanSo();
        c.tu = tu*b.mau + b.tu*mau;
        c.mau = mau*b.mau;
        c.rutGon();
        return c;
    }

    public PhanSo nhan(PhanSo b) {
        PhanSo d = new PhanSo();
        d.tu = tu*b.tu;
        d.mau = mau*b.mau;
        d.rutGon();
        return d;
    }
}
