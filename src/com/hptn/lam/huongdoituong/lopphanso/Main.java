package com.hptn.lam.huongdoituong.lopphanso;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-- >0){
            PhanSo A = new PhanSo(sc.nextLine());
            PhanSo B = new PhanSo(sc.nextLine());
            PhanSo tongAB = A.cong(B);
            PhanSo tichAB = A.nhan(B);
            PhanSo C = tongAB.nhan(tongAB);
            System.out.print(C);
            System.out.print(" ");
            System.out.println(tichAB.nhan(C));
        }
    }
}
