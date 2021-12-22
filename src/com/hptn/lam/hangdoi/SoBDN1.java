package com.hptn.lam.hangdoi;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SoBDN1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            System.out.println(tim(n));
        }
    }
//
//        public static void xuly(String s1){
//        Queue q = new LinkedList<String>();
//        q.add("1");
//        int dem = 0;
//        while(!q.isEmpty()){
//            String s2 = (String) q.poll();
//            if(s2.length() < s1.length()){
//                dem++;
//                q.add(s2 + "0");
//                q.add(s2 + "1");
//            }
//            if(s1.length() == s2.length() && s2.compareTo(s1) <= 0) dem++;
//        }
//        System.out.println(dem);
//    }

    private static int tim(int n) {
        Queue<String> queue = new LinkedList<>();
        int count = 0;
        queue.add("1");
        while (!queue.isEmpty()){
            String tmp = queue.poll();
            long x = Long.parseLong(tmp);
            if (x > n)
                break;
            queue.add(tmp + "0");
            queue.add(tmp + "1");
            ++count;
        }
        return count;
    }
}
