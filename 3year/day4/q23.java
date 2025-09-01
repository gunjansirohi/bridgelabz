package day4;
// Group words with the same set of characters (e.g., "listen" and "silent").
import java.util.*;

public class q23 {
    public static List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();

        for (String word : words) {
            // Convert word to char array, sort it, then convert back to string
            char[] chars = word.toCharArray();
            Arrays.sort(chars);
            String sorted = new String(chars);

            // Use sorted string as key
            map.computeIfAbsent(sorted, k -> new ArrayList<>()).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        String[] input = {"listen", "silent", "enlist", "google", "gooegl", "rat", "tar", "art"};
        List<List<String>> grouped = groupAnagrams(input);

        for (List<String> group : grouped) {
            System.out.println(group);
        }
    }
}
