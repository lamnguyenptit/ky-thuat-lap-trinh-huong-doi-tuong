package com.hptn.lam.huongdoituong.tracuudonhang;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        while (n-- > 0){
            scanner.nextLine();
            DonHang donHang = new DonHang(scanner.nextLine(), scanner.nextLine(), scanner.nextLong(), scanner.nextInt());
            System.out.println(donHang);
        }
    }
}
