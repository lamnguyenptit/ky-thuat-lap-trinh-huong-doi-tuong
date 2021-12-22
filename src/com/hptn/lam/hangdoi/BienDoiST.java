package com.hptn.lam.hangdoi;

import java.util.*;

public class BienDoiST {
    private static class Pair {
        int n, count;
        public Pair(int n, int count) {
            this.n = n;
            this.count = count;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while (test-- > 0){
            int s = sc.nextInt(), t = sc.nextInt();
            System.out.println(xuLy(s, t));
        }
    }

    private static int xuLy(int s, int t) {
        Set<Integer> set = new HashSet<>();
        Queue<Pair> queue = new LinkedList<>();
        set.add(s);
        queue.add(new Pair(s, 0));
        while (!queue.isEmpty()){
            Pair pair = queue.poll();
            if (pair.n == t)
                return pair.count;
            if (pair.n - 1 == t || pair.n * 2 == t)
                return pair.count + 1;
            if (!set.contains(pair.n - 1)){
                queue.add(new Pair(pair.n - 1, pair.count + 1));
                set.add(pair.n - 1);
            }
            if (pair.n < t && !set.contains(pair.n * 2)){
                queue.add(new Pair(pair.n * 2, pair.count + 1));
                set.add(pair.n * 2);
            }
        }
        return 0;
    }
}
