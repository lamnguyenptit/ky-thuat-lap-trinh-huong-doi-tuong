package com.hptn.lam.huongdoituong.sapxepdonhang;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<DonHang> ds = new ArrayList<>();
        int n = scanner.nextInt();
        while (n-- > 0){
            scanner.nextLine();
            DonHang donHang = new DonHang(scanner.nextLine(), scanner.nextLine(), scanner.nextLong(), scanner.nextInt());
            ds.add(donHang);
        }
        Collections.sort(ds);
        for (DonHang donHang : ds)
            System.out.println(donHang);
    }
}
