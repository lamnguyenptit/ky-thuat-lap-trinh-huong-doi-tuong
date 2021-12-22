package com.hptn.lam.huongdoituong.khaibaolopnhanvien;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class NhanVien {
    private String ma, hoTen, gioiTinh, diaChi, maSoThue;
    private Date ngaySinh, ngayKyHopDong;

    public NhanVien(String hoTen, String gioiTinh, String ngaySinh, String diaChi, String maSoThue, String ngayKyHopDong) throws ParseException {
        this.ma = "00001";
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.maSoThue = maSoThue;
        this.ngaySinh = new SimpleDateFormat("MM/dd/yyyy").parse(ngaySinh);
        this.ngayKyHopDong = new SimpleDateFormat("dd/MM/yyyy").parse(ngayKyHopDong);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + gioiTinh + " " + new SimpleDateFormat("MM/dd/yyyy").format(ngaySinh) + " " + diaChi + " "
                + maSoThue + " " + new SimpleDateFormat("dd/MM/yyyy").format(ngayKyHopDong);
    }
}
