package com.hptn.lam.huongdoituong.timthukhoacuakythi;

import java.text.ParseException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<ThiSinh> ds = new ArrayList<>();
        List<ThiSinh> rs = new ArrayList<>();
        float max = 0f;
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            sc.nextLine();
            ThiSinh thiSinh = new ThiSinh(i, sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            if (max < thiSinh.getTong())
                max = thiSinh.getTong();
            ds.add(thiSinh);
        }
        for (ThiSinh thiSinh : ds){
            if (thiSinh.getTong() == max)
                rs.add(thiSinh);
        }
        Collections.sort(rs);
        for (ThiSinh thiSinh : rs)
            System.out.println(thiSinh);
    }
}
