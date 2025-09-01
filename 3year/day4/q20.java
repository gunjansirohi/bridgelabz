package day4;
// Implement your own split() method (without using built-in split() or StringTokenizer).
import java.util.ArrayList;
import java.util.List;
public class q20{
    public static void main(String[] args) {
        String input = "apple,banana,grape,kiwi";
        char delimiter = ',';
        List<String> result = customSplit(input, delimiter);
        for (String word : result) {
            System.out.println(word);
        }
    }
    public static List<String> customSplit(String str, char delimiter) {
        List<String> parts = new ArrayList<>();
        StringBuilder current = new StringBuilder();
        for (char ch : str.toCharArray()) {
            if (ch == delimiter) {
                parts.add(current.toString());
                current.setLength(0); // Clear the StringBuilder
            } else {
                current.append(ch);
            }
        }
        parts.add(current.toString());
        return parts;
    }
}
