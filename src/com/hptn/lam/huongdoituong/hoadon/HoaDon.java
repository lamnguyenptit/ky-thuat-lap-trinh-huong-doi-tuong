package com.hptn.lam.huongdoituong.hoadon;

import java.text.ParseException;

public class HoaDon {
    private String ma;
    private KhachHang khachHang;
    private MatHang matHang;
    private int soLuong;

    public HoaDon(int ma, int soLuong) throws ParseException {
        this.ma = "HD" + String.format("%03d", ma);
        this.soLuong = soLuong;
    }

    public void setKhachHang(KhachHang khachHang) {
        this.khachHang = khachHang;
    }

    public void setMatHang(MatHang matHang) {
        this.matHang = matHang;
    }

    @Override
    public String toString() {
        return ma + " " + khachHang.getTen() + " " + khachHang.getDiaChi() + " " + matHang.getTen() + " " +
                matHang.getDonVi() + " " + matHang.getGiamMua() + " " + matHang.getGiaBan() + " " + soLuong + " " +
                matHang.getGiaBan() * soLuong;
    }
}
