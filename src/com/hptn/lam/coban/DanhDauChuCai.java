package com.hptn.lam.coban;

import java.util.Scanner;

public class DanhDauChuCai {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        System.out.println(s.chars().distinct().count());
    }
}
