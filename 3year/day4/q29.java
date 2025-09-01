package day4;

public class q29 {
    public static boolean isValidShuffle(String s1, String s2, String result) {
        if (s1.length() + s2.length() != result.length()) {
            return false;
        }

        int i = 0, j = 0, k = 0;

        while (k < result.length()) {
            if (i < s1.length() && result.charAt(k) == s1.charAt(i)) {
                i++;
            } else if (j < s2.length() && result.charAt(k) == s2.charAt(j)) {
                j++;
            } else {
                return false;
            }
            k++;
        }

        return (i == s1.length() && j == s2.length());
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String result = "dabecf";

        System.out.println("Is valid shuffle: " + isValidShuffle(s1, s2, result));
    }
}
