package com.hptn.lam.nganxep;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class SoLocPhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0){
            int n = sc.nextInt();
            xuly(n);
        }
    }

    private static void xuly(int n) {
        Queue<String> queue = new LinkedList<>();
        Stack<Long> stack = new Stack<>();
        int count = 0;
        queue.add("6");
        queue.add("8");
        while (true){
            String tmp = queue.poll();
            long x = Long.parseLong(tmp);
            if (((int) Math.log10(x) + 1) > n)
                break;
            ++count;
            stack.add(x);
            queue.add(tmp + "6");
            queue.add(tmp + "8");
        }
        System.out.println(count);
        while (!stack.empty())
            System.out.print(stack.pop() + " ");
        System.out.println();
    }
}
