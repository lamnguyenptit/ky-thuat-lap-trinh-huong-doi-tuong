package com.hptn.lam.nganxep;

import java.util.Scanner;
import java.util.Stack;

public class DanhSoThuTuCapDauNgoac {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0){
            String s = sc.nextLine();
            xuLy(s);
        }
    }

    private static void xuLy(String s) {
        Stack<Integer> stack = new Stack<>();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '('){
                stack.push(++count);
                System.out.print(count + " ");
            }
            else if (s.charAt(i) == ')')
                System.out.print(stack.pop() + " ");
        }
        System.out.println();
    }
}
