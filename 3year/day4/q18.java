package day4;
import java.util.*;
// Count frequency of each character in a string.
public class q18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Map<Character,Integer>frequencyMap=new HashMap<>();
        for (char ch:s.toCharArray()) {
            if (ch!=' '){
                frequencyMap.put(ch,frequencyMap.getOrDefault(ch,0) + 1);
            }
        }
        for(Map.Entry<Character,Integer>entry:frequencyMap.entrySet()){
            System.out.println(entry.getKey()+" -> "+entry.getValue());
        }
    }
}
