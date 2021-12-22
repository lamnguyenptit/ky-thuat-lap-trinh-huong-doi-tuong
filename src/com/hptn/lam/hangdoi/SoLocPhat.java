package com.hptn.lam.hangdoi;

import java.util.*;

public class SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            long n = sc.nextInt();
            xuly(n);
            System.out.println();
        }
    }

    private static void xuly(long n) {
        Queue<String> queue = new LinkedList<>();
        List<String> rs = new ArrayList<>();
        queue.add("6");
        queue.add("8");
        while (!queue.isEmpty()){
            String tmp = queue.poll();
            if (tmp.length() > n)
                break;
            rs.add(tmp);
            queue.add(tmp + "6");
            queue.add(tmp + "8");
        }
        System.out.println(rs.size());
        for (int i = rs.size() - 1; i >= 0; i--)
            System.out.print(rs.get(i) + " ");
    }
}
