package com.hptn.lam.huongdoituong.danhsachgiangvientheobomon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<GiangVien> ds = new ArrayList<>();
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            GiangVien giangVien = new GiangVien(i, scanner.nextLine(), scanner.nextLine());
            ds.add(giangVien);
        }
        n = Integer.parseInt(scanner.nextLine());
        while (n-- > 0){
            String mon = scanner.nextLine();
            mon = getMon(mon);
            System.out.println("DANH SACH GIANG VIEN BO MON " + mon + ":");
            for (GiangVien giangVien : ds){
                if (giangVien.getMon().equals(mon))
                    System.out.println(giangVien);
            }
        }
    }

    private static String getMon(String mon){
        StringTokenizer tokenizer = new StringTokenizer(mon);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            builder.append(Character.toUpperCase(tmp.charAt(0)));
        }
        return builder.toString();
    }
}
