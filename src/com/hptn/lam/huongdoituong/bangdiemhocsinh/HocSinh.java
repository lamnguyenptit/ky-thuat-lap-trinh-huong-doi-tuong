package com.hptn.lam.huongdoituong.bangdiemhocsinh;

public class HocSinh implements Comparable<HocSinh>{
    private String ma, hoTen;
    private float[] diem;
    private float diemTB;

    public HocSinh(int id, String hoTen) {
        this.ma = "HS" + String.format("%02d", id);
        this.hoTen = hoTen;
    }

    public void setDiem(float[] diem) {
        this.diem = diem;
        this.diemTB = tinhDiemTrungBinh();
    }

    @Override
    public String toString() {
        return ma + " " + hoTen + " " + diemTB + " " + xepLoaiHS(diemTB);
    }

    private float tinhDiemTrungBinh(){
        float tb = 0f;
        for (int i = 0; i < 10; i++) {
            if (i == 0 || i == 1)
                tb += diem[i];
            tb += diem[i];
        }
        tb /= 12;
        return (float) Math.round(tb*10)/10;
    }

    private String xepLoaiHS(float diemTb){
        if (diemTb >= 9)
            return "XUAT SAC";
        else if (8 <= diemTb && diemTb <= 8.9)
            return "GIOI";
        else if (7 <= diemTb && diemTb <=7.9)
            return "KHA";
        else if (5 <= diemTb && diemTb <= 6.9)
            return "TB";
        else
            return "YEU";
    }

    @Override
    public int compareTo(HocSinh o) {
        if (this.diemTB < o.diemTB)
            return 1;
        else if (this.diemTB > o.diemTB)
            return -1;
        else{
            return this.ma.compareTo(o.ma);
        }
    }
}
