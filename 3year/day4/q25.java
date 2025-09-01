package day4;

// Find all permutations of a string.
public class q25 {
    public static void permute(String str) {
        permuteHelper(str.toCharArray(), 0);
    }
    private static void permuteHelper(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
            return;
        }
        for (int i = index; i < chars.length; i++) {
            swap(chars, index, i);
            permuteHelper(chars, index + 1);
            swap(chars, index, i); // backtrack
        }
    }
    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
    public static void main(String[] args) {
        String input = "abc";
        System.out.println("Permutations of " + input + ":");
        permute(input);
    }
}
