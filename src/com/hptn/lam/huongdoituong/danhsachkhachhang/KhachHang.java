package com.hptn.lam.huongdoituong.danhsachkhachhang;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;


public class KhachHang implements Comparable<KhachHang> {
    private final String ma;
    private final String ten;
    private final String sex;
    private final String diaChi;
    private final Date ngaySinh;

    public KhachHang(int ma, String ten, String sex, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", ma);
        this.ten = chuanHoa(ten);
        this.sex = sex;
        this.diaChi = diaChi;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + sex + " " + diaChi + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh);
    }

    private String chuanHoa(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()) {
            String tmp = tokenizer.nextToken();
            builder.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i = 1; i < tmp.length(); i++) {
                builder.append(Character.toLowerCase(tmp.charAt(i)));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }

    @Override
    public int compareTo(KhachHang o) {
        return ngaySinh.compareTo(o.ngaySinh);
    }
}
