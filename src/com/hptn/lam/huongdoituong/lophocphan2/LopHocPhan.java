package com.hptn.lam.huongdoituong.lophocphan2;

public class LopHocPhan implements Comparable<LopHocPhan>{
    private String nhomLop, tenGV;
    private Mon mon;

    public LopHocPhan(Mon mon, String nhomLop, String tenGV) {
        this.mon = new Mon(mon.getMa(), mon.getTen());
        this.nhomLop = nhomLop;
        this.tenGV = tenGV;
    }

    public String getTenGV() {
        return tenGV;
    }

    public String getNhomLop() {
        return nhomLop;
    }

    public Mon getMon() {
        return mon;
    }

    @Override
    public String toString() {
        return mon.getMa() + " " + mon.getTen() + " " + nhomLop;
    }


    @Override
    public int compareTo(LopHocPhan o) {
        if (this.mon.getMa().equals(o.getMon().getMa()))
            return Integer.parseInt(nhomLop) - Integer.parseInt(o.getNhomLop());
        return this.mon.getMa().compareTo(o.getMon().getMa());
    }
}
