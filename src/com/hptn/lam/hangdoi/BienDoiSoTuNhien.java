package com.hptn.lam.hangdoi;

import java.util.*;

public class BienDoiSoTuNhien {
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
            int n = sc.nextInt();
            System.out.println(xuLy(n));
        }
    }

    private static int xuLy(int n) {
        Set<Integer> set = new HashSet<>();
        Queue<Pair> queue = new LinkedList<>();
        set.add(n);
        queue.add(new Pair(n, 0));
        while (!queue.isEmpty()){
            Pair pair = queue.poll();
            if (pair.n == 1)
                return pair.count;
            if (pair.n - 1 == 1)
                return pair.count + 1;
            if (!set.contains(pair.n - 1)){
                queue.add(new Pair(pair.n - 1, pair.count + 1));
                set.add(pair.n - 1);
            }
            for (int i = 2; i <= Math.sqrt(pair.n); i++) {
                if (pair.n % i == 0){
                    if (!set.contains(pair.n/i)){
                        queue.add(new Pair(pair.n/i, pair.count + 1));
                        set.add(pair.n/i);
                    }
                }
            }
        }
        return 0;
    }
}
