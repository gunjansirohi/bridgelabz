package day4;
import java.util.*;
// Remove all digits from a string.
public class q12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String res=s.replaceAll("\\d", "");
        System.out.println(res);

    }
}
