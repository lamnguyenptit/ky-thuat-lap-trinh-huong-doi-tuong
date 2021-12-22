package com.hptn.lam.huongdoituong.hoadon;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class KhachHang {
    private String ma, ten, gioiTinh, diaChi;
    private Date ngaySinh;

    public KhachHang(int ma, String ten, String gioiTinh, String ngaySinh, String diaChi) throws ParseException {
        this.ma = "KH" + String.format("%03d", ma);
        this.ten = chuanHoa(ten);
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
    }

    private String chuanHoa(String s) {
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

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public Date getNgaySinh() {
        return ngaySinh;
    }
}
