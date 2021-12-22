package com.hptn.lam.dothi;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChuyenTuDanhSachKeSangDanhSachCanh {
    private static List<Integer>[] dsKe = new List[1005];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 1; i <= n; i++) {
            Scanner scanner = new Scanner(sc.nextLine());
            dsKe[i] = new ArrayList<>();
            while (scanner.hasNext()){
                dsKe[i].add(Integer.parseInt(scanner.next()));
            }
        }
        for (int i = 1; i <= n; i++) {
            for (Integer tmp : dsKe[i]){
                if (i < tmp)
                    System.out.println(i + " " + tmp);
            }
        }
    }
}
