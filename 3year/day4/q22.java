package day4;

// Write a custom method to compare two strings without using .equals().
public class q22 {
    public static boolean areStringsEqual(String str1, String str2) {
        if (str1 == null || str2 == null) {
            return str1 == str2;
        }
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String a = "hello";
        String b = "hello";
        String c = "Hello";
        System.out.println(areStringsEqual(a, b));
        System.out.println(areStringsEqual(a, c));
    }
}