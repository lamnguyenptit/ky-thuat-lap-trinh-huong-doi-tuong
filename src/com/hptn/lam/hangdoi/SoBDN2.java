package com.hptn.lam.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoBDN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(tim(n));
        }
    }

    private static long tim(int n) {
        Queue<String> queue = new LinkedList<>();
        queue.add("1");
        while (!queue.isEmpty()){
            String tmp = queue.poll();
            long x = Long.parseLong(tmp);
            if (x % n == 0)
                return x;
            queue.add(tmp + "0");
            queue.add(tmp + "1");
        }
        return 0;
    }
}
