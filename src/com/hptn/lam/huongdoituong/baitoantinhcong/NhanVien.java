package com.hptn.lam.huongdoituong.baitoantinhcong;

public class NhanVien {
    private String ma, hoTen, chucVu;
    private int soNgayCong, luongCB;
    private long luong, tongLuong, thuong;

    public NhanVien(int ma, String hoTen, int luongCB, int soNgayCong, String chucVu) {
        this.ma = "NV" + String.format("%02d", ma);
        this.hoTen = hoTen;
        this.chucVu = chucVu;
        this.soNgayCong = soNgayCong;
        this.luongCB = luongCB;
        this.thuong = thuong();
        this.luong = (long) luongCB*soNgayCong;
        this.tongLuong = luong + thuong + phuCap(chucVu);
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + luong + " " + thuong + " " + phuCap(chucVu) + " " + tongLuong;
    }

    private long thuong(){
        if (this.soNgayCong >= 25)
            return (long) luongCB*soNgayCong*2/10;
        else if (this.soNgayCong >= 22)
            return (long) luongCB*soNgayCong/10;
        else
            return 0;
    }

    private int phuCap(String chucVu){
        if (chucVu.equals("GD"))
            return 250000;
        else if (chucVu.equals("PGD"))
            return 200000;
        else if (chucVu.equals("TP"))
            return 180000;
        else
            return 150000;
    }
}
