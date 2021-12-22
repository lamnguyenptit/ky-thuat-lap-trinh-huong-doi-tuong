package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class BieuThucDung2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            System.out.println(xuLy(s));
        }
    }

    private static int xuLy(String s) {
        Stack<Character> st = new Stack<>();
        int max = 0, totalMax = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                ++max;
                st.push(s.charAt(i));
                if (max > totalMax)
                    totalMax = max;
            } else if (s.charAt(i) == ')') {
                char c = st.pop();
                if (max > 0 && c == '(')
                    --max;
                else
                    return -1;
            }
        }
        if (!st.isEmpty())
            return -1;
        return totalMax;
    }
}
