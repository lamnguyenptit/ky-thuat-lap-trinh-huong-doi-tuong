package com.hptn.lam.coban;

import java.util.Scanner;
import java.util.StringTokenizer;

public class ChuanHoaXauHoTen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        while (t-- > 0){
            System.out.println(chuanHoa(scanner.nextLine()));
        }
    }

    private static String chuanHoa(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            builder.append(Character.toUpperCase(tmp.charAt(0)));
            for (int i = 1; i < tmp.length(); i++) {
                builder.append(Character.toLowerCase(tmp.charAt(i)));
            }
            builder.append(" ");
        }
        return builder.toString().trim();
    }
}
