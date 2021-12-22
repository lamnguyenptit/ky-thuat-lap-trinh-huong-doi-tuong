package com.hptn.lam.hangdoi;

import java.util.*;

public class GiaTriNhoNhatCuaXau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int k = sc.nextInt();
            String s = sc.next();
            System.out.println(xuLy(s, k));
        }
    }

    private static long xuLy(String s, int k) {
        if (k >= s.length())
            return 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });
        int[] count = new int[30];
        long result = 0;
        for (int i = 0; i < s.length(); i++)
            ++count[s.charAt(i) - 'A'];
        for (int i = 0; i <= 'Z' - 'A'; i++)
            if (count[i] != 0)
                priorityQueue.add(count[i]);
        while (k-- > 0){
            int tmp = priorityQueue.poll();
            priorityQueue.add(--tmp);
        }
        while (!priorityQueue.isEmpty())
            result += Math.pow(priorityQueue.poll(), 2);
        return result;
    }
}
