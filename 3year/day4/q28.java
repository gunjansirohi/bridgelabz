package day4;
// Implement your own replace() function
public class q28 {

    public static String customReplace(String original, String target, String replacement) {
        if (target.isEmpty()) return original; // Avoid infinite loop

        StringBuilder result = new StringBuilder();
        int i = 0;

        while (i < original.length()) {
            // Check if target matches at current position
            if (i + target.length() <= original.length() &&
                original.substring(i, i + target.length()).equals(target)) {
                result.append(replacement);
                i += target.length();
            } else {
                result.append(original.charAt(i));
                i++;
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String original = "the cat chased the cat";
        String target = "cat";
        String replacement = "dog";

        String replaced = customReplace(original, target, replacement);
        System.out.println("Result: " + replaced);
    }
}
