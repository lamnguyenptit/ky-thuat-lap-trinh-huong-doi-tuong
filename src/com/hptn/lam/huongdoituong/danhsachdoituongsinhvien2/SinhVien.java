package com.hptn.lam.huongdoituong.danhsachdoituongsinhvien2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class SinhVien {
    private String ma, ten, lop;
    private Date ngaySinh;
    private float gpa;

    public SinhVien(int id, String ten, String lop, String ngaySinh, float gpa) throws ParseException {
        this.ma = "B20DCCN" + String.format("%03d", id);
        this.ten = chuanHoa(ten);
        this.lop = lop;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.gpa = gpa;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + lop + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh) + String.format(" %.2f", gpa);
    }

    private static String chuanHoa(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            builder.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i = 1; i < tmp.length(); i++) {
                builder.append(Character.toLowerCase(tmp.charAt(i)));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}
