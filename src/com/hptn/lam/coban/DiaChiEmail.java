package com.hptn.lam.coban;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiaChiEmail {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        List<String> emails = new ArrayList<>();
        while (t-- > 0)
            emails.add(chuanHoa(scanner.nextLine()));
        for (int i = 0; i < emails.size(); i++) {
            int count = 1;
            for (int j = i+1; j < emails.size(); j++) {
                if (emails.get(i).equals(emails.get(j))){
                    ++count;
                    emails.set(j, emails.get(j) + count);
                }
            }
        }
        for (String s : emails)
            System.out.println(s + "@ptit.edu.vn");
    }

    private static String chuanHoa(String s) {
        StringTokenizer tokenizer = new StringTokenizer(s);
        StringBuilder builder = new StringBuilder();
        while (tokenizer.hasMoreTokens()){
            String tmp = tokenizer.nextToken();
            if (!tokenizer.hasMoreTokens())
                builder.insert(0, tmp.toLowerCase());
            else
                builder.append(Character.toLowerCase(tmp.charAt(0)));
        }
        return builder.toString().trim();
    }
}
