package com.hptn.lam.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoNguyenThuy {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            xuly(n);
        }
    }

    private static void xuly(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("4");
        queue.add("5");
        while (n > 0){
            String tmp = queue.poll();
            StringBuilder builder = new StringBuilder(tmp);
            System.out.print(builder);
            System.out.print(builder.reverse().append(" "));
            --n;
            queue.add(tmp + "4");
            queue.add(tmp + "5");
        }
        System.out.println();
    }
}
