package com.hptn.lam.huongdoituong.lopintset;

import java.util.TreeSet;

public class IntSet {
    private TreeSet<Integer> set = new TreeSet<>();
    public IntSet(int[] a) {
        for (int j : a)
            set.add(j);
    }

    public IntSet() {}

    @Override
    public String toString() {
        StringBuilder tmp = new StringBuilder();
        for (Integer i : set)
            tmp.append(i).append(" ");
        return tmp.toString();
    }

    IntSet union(IntSet other) {
        IntSet u = new IntSet();
        u.set.addAll(set);
        u.set.addAll(other.set);
        return u;
    }
}
