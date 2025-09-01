package day4;
import java.util.*;
// Toggle the case of each character in a string.
public class q16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder toggled = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                toggled.append(Character.toLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                toggled.append(Character.toUpperCase(ch));
            } else {
                toggled.append(ch); // Keep non-letter characters unchanged
            }
        }
        System.out.println("Toggled string: " + toggled.toString());
    }
}

