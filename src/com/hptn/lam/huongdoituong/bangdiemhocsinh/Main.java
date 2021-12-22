package com.hptn.lam.huongdoituong.bangdiemhocsinh;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        float[] diem = new float[10];
        List<HocSinh> ds = new ArrayList<>();
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            scanner.nextLine();
            HocSinh hocSinh = new HocSinh(i, scanner.nextLine());
            for (int j = 0; j < 10; j++)
                diem[j] = scanner.nextFloat();
            hocSinh.setDiem(diem);
            ds.add(hocSinh);
        }
        Collections.sort(ds);
        for (HocSinh hs : ds)
            System.out.println(hs);
    }
}
