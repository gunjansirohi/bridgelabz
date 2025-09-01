package day4;

import java.util.*;
//
public class q14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1= "123456";
        String s2 = "abc123";

        System.out.println(s1 + " contains only digits: " + containsOnlyDigits(s1)); // true
        System.out.println(s2 + " contains only digits: " + containsOnlyDigits(s2)); 
    }
    public static boolean containsOnlyDigits(String input) {
        return input.matches("\\d+");
    }

}
