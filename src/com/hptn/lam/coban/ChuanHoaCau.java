package com.hptn.lam.coban;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaCau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()){
            String tmp = sc.nextLine();
            if (tmp.equals(""))
                break;
            else
                System.out.println(xuLy(tmp.toLowerCase()));
        }
    }

    private static String xuLy(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            if (tmp.equals(".") || tmp.equals(":") || tmp.equals("!") || tmp.equals("?") || tmp.equals(";"))
                builder.deleteCharAt(builder.length() - 1);
            builder.append(tmp).append(" ");
        }
        if (builder.charAt(builder.length()-1) == ' ')
            builder.deleteCharAt(builder.length()-1);
        char c = Character.toUpperCase(builder.charAt(0));
        builder.replace(0, 1, String.valueOf(c));
        c = builder.charAt(builder.length()-1);
        if (c != '.' && c != '!' && c != '?'){
            builder.append(".");
        }
        return builder.toString();
    }
}
