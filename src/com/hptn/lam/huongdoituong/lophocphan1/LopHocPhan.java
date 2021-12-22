package com.hptn.lam.huongdoituong.lophocphan1;

public class LopHocPhan implements Comparable<LopHocPhan>{
    private String nhomLop, tenGV;
    private Mon mon;

    public LopHocPhan(Mon mon, String nhomLop, String tenGV) {
        this.mon = new Mon(mon.getMa(), mon.getTen());
        this.nhomLop = nhomLop;
        this.tenGV = tenGV;
    }

    public String getNhomLop() {
        return nhomLop;
    }

    public Mon getMon() {
        return mon;
    }

    @Override
    public String toString() {
        return nhomLop + " " + tenGV;
    }


    @Override
    public int compareTo(LopHocPhan o) {
        return Integer.parseInt(nhomLop) - Integer.parseInt(o.getNhomLop());
    }
}
