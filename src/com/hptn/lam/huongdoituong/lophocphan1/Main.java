package com.hptn.lam.huongdoituong.lophocphan1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<LopHocPhan> dsLop = new ArrayList<>();
        List<Mon> dsMon = new ArrayList<>();
        int n = Integer.parseInt(sc.nextLine());
        while (n-- > 0){
            Mon mon = new Mon(sc.nextLine(), sc.nextLine());
            LopHocPhan lop = new LopHocPhan(mon, sc.nextLine(), sc.nextLine());
            dsMon.add(mon);
            dsLop.add(lop);
        }
        Collections.sort(dsLop);
        n = Integer.parseInt(sc.nextLine());
        while (n-- > 0){
            String maMon = sc.nextLine();
            String tenMon = "";
            for (Mon m: dsMon){
                if (maMon.equals(m.getMa())){
                    tenMon = m.getTen();
                    break;
                }
            }
            System.out.println("Danh sach nhom lop mon " + tenMon + ":");
            for (LopHocPhan lop : dsLop){
                if (lop.getMon().getMa().equals(maMon))
                    System.out.println(lop);
            }
        }
    }
}
