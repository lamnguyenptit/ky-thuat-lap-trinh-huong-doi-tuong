package com.hptn.lam.huongdoituong.khaibaolopthisinh;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ThiSinh thiSinh = new ThiSinh(scanner.nextLine(), scanner.nextLine(), scanner.nextFloat(), scanner.nextFloat(), scanner.nextFloat());
        System.out.println(thiSinh);
    }
}
