package com.hptn.lam.coban;

import java.util.*;

public class SapXepCongViec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            int[][] a = new int[n][2];
            for (int i = 0; i < n; i++) {
                a[i][0] = sc.nextInt();
                a[i][1] = sc.nextInt();
            }
            Arrays.sort(a, new Comparator<int[]>() {
                @Override
                public int compare(int[] o1, int[] o2) {
                    return o1[1] - o2[1];
                }
            });
            int j = 0, count = 1;
            for (int i = 0; i < n; i++) {
                if (a[i][0] >= a[j][1]){
                    j = i;
                    ++count;
                }
            }
            System.out.println(count);
        }
    }
}
