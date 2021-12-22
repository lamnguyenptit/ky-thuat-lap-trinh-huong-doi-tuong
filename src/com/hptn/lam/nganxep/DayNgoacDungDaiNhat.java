package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DayNgoacDungDaiNhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            System.out.println(tinh(s));
        }
    }

    private static int tinh(String s) {
        Stack<Integer> st = new Stack<>();
        int result = 0;
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(')
                st.push(i);
            else {
                st.pop();
                if (!st.empty())
                    result = Math.max(result, i - st.peek());
                else
                    st.push(i);
            }
        }
        return result;
    }
}
