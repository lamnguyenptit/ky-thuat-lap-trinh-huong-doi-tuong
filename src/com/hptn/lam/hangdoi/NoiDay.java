package com.hptn.lam.hangdoi;

import java.util.PriorityQueue;
import java.util.Scanner;

public class NoiDay {
    private static final int mod = (int) 1e9+7;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
            long rs = 0;
            int n = sc.nextInt();
            for (int i = 0; i < n; i++)
                priorityQueue.add(sc.nextInt());
            while (priorityQueue.size() > 1){
                int fi = priorityQueue.poll();
                int se = priorityQueue.poll();
                int tmp = (fi+se)%mod;
                rs = (rs+tmp)%mod;
                priorityQueue.add(tmp);
            }
            System.out.println(rs);
        }
    }
}
