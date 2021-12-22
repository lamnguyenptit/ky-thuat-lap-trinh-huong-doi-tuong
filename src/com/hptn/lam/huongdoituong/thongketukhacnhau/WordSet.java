package com.hptn.lam.huongdoituong.thongketukhacnhau;

import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private final TreeSet<String> set;

    public WordSet(Scanner input) {
        set = new TreeSet<>();
        while (input.hasNextLine()){
            String tmp = input.nextLine();
            if (tmp.equals(""))
                break;
            StringTokenizer tokenizer = new StringTokenizer(tmp.toLowerCase());
            while (tokenizer.hasMoreTokens())
                set.add(String.valueOf(tokenizer.nextToken()));
        }
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (String tmp : set)
            s.append(tmp).append("\n");
        return s.toString();
    }
}
