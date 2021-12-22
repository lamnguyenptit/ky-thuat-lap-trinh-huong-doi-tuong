package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class SuaLaiDayNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            String s = sc.next();
            System.out.println(dem(s));
        }
    }

    private static int dem(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(s.charAt(i));
            else {
                if (st.empty() || st.peek() == ')')
                    st.push(s.charAt(i));
                else
                    st.pop();
            }
        }
        int m = st.size(), n = 0;
        while (!st.empty() && st.peek() == '('){
            st.pop();
            ++n;
        }
        m = m - n;
        return m/2 + n/2 + m%2 + n % 2;
    }
}
