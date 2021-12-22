package com.hptn.lam.huongdoituong.sapxepketquatuyensinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        List<ThiSinh> ds = new ArrayList<>();
        int n = sc.nextInt();
        while (n-- > 0){
            sc.nextLine();
            ThiSinh thiSinh = new ThiSinh(sc.nextLine(), sc.nextLine(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
            ds.add(thiSinh);
        }
        Collections.sort(ds);
        for (ThiSinh thiSinh : ds)
            System.out.println(thiSinh);
    }
}
