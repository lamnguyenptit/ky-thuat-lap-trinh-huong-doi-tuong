package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DaoTu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            daoTu(s);
        }
    }

    private static void daoTu(String s) {
        Stack<Character> st = new Stack<>();
        Scanner sc = new Scanner(s);
        while (sc.hasNext()){
            String word = sc.next();
            for (int i = 0; i < word.length(); i++)
                st.push(word.charAt(i));
            while (!st.empty())
                System.out.print(st.pop());
            System.out.print(" ");
        }
        System.out.println();
    }
}
