package com.leetcode;

public class CountNSay {
    public static String countNsay1(int n) {
        if (n <= 0) {
            return "";
        }
        String str = "1";
        while (n > 1) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < str.length(); i++) {
                int count = 1;
                while (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
                    count++;
                    i++;
                }
                sb.append(count).append(str.charAt(i));
            }
            str = sb.toString();
            --n;

        }
        return str;
    }

    public static void main(String args[]) {

        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(countNsay1(i));
            System.out.println();
        }

    }
}