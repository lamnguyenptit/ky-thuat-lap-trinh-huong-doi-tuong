package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class KiemTraCauVietDungQuyTac {
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
            if (s.charAt(i) == '(' || s.charAt(i) == '[')
                st.push(s.charAt(i));
            else if (s.charAt(i) == ')' || s.charAt(i) == ']'){
                if (st.empty())
                    st.push(s.charAt(i));
                else if ((st.peek() == '(' && s.charAt(i) == ')') || (st.peek() == '[' && s.charAt(i) == ']'))
                    st.pop();
                else
                    return false;
            }
        }
        return st.empty();
    }
}
