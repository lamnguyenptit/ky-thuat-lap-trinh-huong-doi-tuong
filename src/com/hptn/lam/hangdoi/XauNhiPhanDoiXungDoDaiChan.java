package com.hptn.lam.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class XauNhiPhanDoiXungDoDaiChan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            xuLy(n);
        }
    }

    private static void xuLy(int n) {
        Queue<String> q = new LinkedList<>();
        q.add("0");
        q.add("1");
        while (true){
            String tmp = q.poll();
            if (tmp.length() > n/2)
                break;
            StringBuilder builder = new StringBuilder(tmp);
            System.out.print(builder);
            System.out.print(builder.reverse().append(" "));
            q.add(tmp + "0");
            q.add(tmp + "1");
        }
        System.out.println();
    }
}
