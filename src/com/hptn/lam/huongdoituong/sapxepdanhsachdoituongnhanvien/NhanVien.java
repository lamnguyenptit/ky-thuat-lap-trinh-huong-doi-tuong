package com.hptn.lam.huongdoituong.sapxepdanhsachdoituongnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien implements Comparable<NhanVien>{
    private final String ma, hoTen, gioiTinh, diaChi, maSoThue;
    private final Date ngaySinh, ngayKy;

    public NhanVien(int id, String hoTen, String gioiTinh, String ngaySinh,  String diaChi, String maSoThue, String ngayKy) throws ParseException {
        this.ma = String.format("%05d", id);
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngaySinh = new SimpleDateFormat("dd/MM/yyyy").parse(ngaySinh);
        this.ngayKy = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKy);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngaySinh)
                + " " + diaChi + " " + maSoThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKy);
    }

    @Override
    public int compareTo(NhanVien o) {
        return this.ngaySinh.compareTo(o.ngaySinh);
    }
}
