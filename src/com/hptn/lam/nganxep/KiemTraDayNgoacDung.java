package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraDayNgoacDung {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            if (check(s))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }

    private static boolean check(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char out = s.charAt(i);
            if (out == '(' || out == '[' || out == '{')
                st.push(s.charAt(i));
            else {
                if (st.empty())
                    return false;
                char in = st.peek();
                if (in == '(' && out == ')')
                    st.pop();
                else if (in == '[' && out == ']')
                    st.pop();
                else if (in == '{' && out == '}')
                    st.pop();
            }
        }
        return st.empty();
    }
}
