package day4;


import java.util.*;
public class q15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "aaabbcc";
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1)).append(count);
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1)).append(count);
        System.out.println("Compressed string: " + compressed.toString());
    }
}