package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class GoBanPhim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        xuLy(s);
    }

    private static void xuLy(String s) {
        Stack<Character> stackL = new Stack<>();
        Stack<Character> stackR = new Stack<>();
        StringBuilder builder = new StringBuilder();
        int point = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '<')
                stackL.push('<');
            else if (s.charAt(i) == '>')
                stackR.push('>');
            else {
                while (!stackL.empty()) {
                    if (point > 0)
                        --point;
                    stackL.pop();
                }
                while (!stackR.empty()) {
                    if (point < builder.length())
                        ++point;
                    stackR.pop();
                }
                if (s.charAt(i) == '-')
                    builder.deleteCharAt(--point);
                else{
                    if (point != builder.length())
                        builder.insert(point, s.charAt(i));
                    else{
                        builder.append(s.charAt(i));
                        ++point;
                    }
                }
            }
        }
        System.out.println(builder);
    }
}
