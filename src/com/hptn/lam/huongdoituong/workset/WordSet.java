package com.hptn.lam.huongdoituong.workset;

import java.util.StringTokenizer;
import java.util.TreeSet;

public class WordSet {
    private TreeSet<String> set = new TreeSet<>();

    public WordSet(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            set.add(tmp.toLowerCase());
        }
    }

    public WordSet() {
    }

    public WordSet intersection(WordSet s) {
        WordSet workSet = new WordSet();
        workSet.set.addAll(set);
        workSet.set.retainAll(s.set);
        return workSet;
    }

    public WordSet union(WordSet s) {
        WordSet workSet = new WordSet();
        workSet.set.addAll(set);
        workSet.set.addAll(s.set);
        return workSet;
    }

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for (String i : set)
            tmp.append(i).append(" ");
        return tmp.toString();
    }
}
