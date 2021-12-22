package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class BienDoiHauToTienTo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String s = sc.nextLine();
            System.out.println(xuLy(s));
        }
    }

    private static String xuLy(String s) {
        Stack<String> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (!isOperator(c))
                stack.push(String.valueOf(c));
            else {
                String s1 = stack.pop();
                String s2 = stack.pop();
                String tmp = c + s2 + s1;
                stack.push(tmp);
            }
        }
        return stack.peek();
    }

    private static boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/' || c == '%' || c == '^';
    }
}
