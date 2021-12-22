package com.hptn.lam.huongdoituong.danhsachgiangvientheobomon;

import java.util.StringTokenizer;

public class GiangVien {
    private String ma, ten, mon;

    public GiangVien(int ma, String ten, String mon) {
        this.ma = "GV" + String.format("%02d", ma);
        this.ten = ten;
        this.mon = mon(mon);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + mon;
    }

    public String getMon() {
        return mon;
    }

    private String mon(String mon){
        StringTokenizer tokenizer = new StringTokenizer(mon);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            builder.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return builder.toString();
    }
}
