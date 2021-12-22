package com.hptn.lam.coban;

import java.util.Scanner;

public class NhamChuSo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println((be(a) + be(b)) + " " + (lon(a) + lon(b)));
    }
    private static int be(int n) {
        String s = String.valueOf(n);
        s = s.replace('6', '5');
        return Integer.parseInt(s);
    }
    private static int lon(int n) {
        String s = String.valueOf(n);
        s = s.replace('5', '6');
        return Integer.parseInt(s);
    }

//    private static String xuLy(int a, int b){
//        int sumMin=a+b;
//        int sumMax=a+b;
//        int tmp=0;
//        while(a>0 || b>0){
//            if(a%10==6)
//                sumMin-=Math.pow(10,tmp);
//            if(a%10==5)
//                sumMax+=Math.pow(10,tmp);
//            if(b%10==6)
//                sumMin-=Math.pow(10,tmp);
//            if(b%10==5)
//                sumMax+=Math.pow(10,tmp);
//            a/=10;
//            b/=10;
//            tmp++;
//        }
//        return sumMin + " " + sumMax;
//    }
}
