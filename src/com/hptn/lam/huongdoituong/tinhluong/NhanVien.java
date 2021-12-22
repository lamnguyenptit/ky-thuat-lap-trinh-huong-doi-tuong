package com.hptn.lam.huongdoituong.tinhluong;

public class NhanVien {
    private String ma, ten;
    private int ngayCong, luongCB, heSoNhan;
    private long luongThang;
    private PhongBan phongBan;

    public NhanVien(String ma, String ten, int luongCB, int ngayCong) {
        this.ma = ma;
        this.ten = ten;
        this.luongCB = luongCB;
        this.ngayCong = ngayCong;
        this.heSoNhan = tinhHeSoNhan();
        this.luongThang = tinhLuongThang();
        this.phongBan = new PhongBan(ma.substring(3));
    }

    public String getMa() {
        return ma;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    private int tinhHeSoNhan() {
        int nam = Integer.parseInt(ma.substring(1, 3));
        char first = ma.charAt(0);
        if (1 <= nam && nam < 4){
            if (first == 'A' || first == 'B')
                return 10;
            else if (first == 'C')
                return 9;
            else
                return 8;
        }
        else if (4 <= nam && nam < 9) {
            if (first == 'A')
                return 12;
            else if (first == 'B')
                return 11;
            else if (first == 'C')
                return 10;
            else
                return 9;
        }
        else if (9 <= nam && nam < 16) {
            if (first == 'A')
                return 14;
            else if (first == 'B')
                return 13;
            else if (first == 'C')
                return 12;
            else
                return 11;
        }
        else {
            if (first == 'A')
                return 20;
            else if (first == 'B')
                return 16;
            else if (first == 'C')
                return 14;
            else
                return 13;
        }
    }

    private long tinhLuongThang() {
        return luongCB*ngayCong*heSoNhan*1000L;
    }

    @Override
    public String toString() {
        return ma + " " + ten + " " + phongBan.getTen() + " " + luongThang;
    }
}
