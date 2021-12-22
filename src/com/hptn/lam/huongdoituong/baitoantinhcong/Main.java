package com.hptn.lam.huongdoituong.baitoantinhcong;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NhanVien nhanVien = new NhanVien(1, scanner.nextLine(), scanner.nextInt(), scanner.nextInt(), scanner.next());
        System.out.println(nhanVien);
    }
}
