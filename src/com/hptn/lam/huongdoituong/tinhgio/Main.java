package com.hptn.lam.huongdoituong.tinhgio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<Gamer> ds = new ArrayList<>();
        while (t-- > 0){
            Gamer gamer = new Gamer(scanner.nextLine(), scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
            ds.add(gamer);
        }
        Collections.sort(ds);
        for (Gamer g : ds)
            System.out.println(g);
    }
}
