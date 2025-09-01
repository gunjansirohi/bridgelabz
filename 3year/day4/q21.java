package day4;
// Check if a string contains a substring without using contains() or indexOf().
import java.util.*;

public class q21 {
    public static boolean hasSubstring(String text, String pattern) {
        int textLength = text.length();
        int patternLength = pattern.length();
        if (patternLength>textLength)
            return false;
        for (int i=0;i<=textLength-patternLength;i++) {
            int j;
            for(j=0;j<patternLength;j++){
                if(text.charAt(i + j)!=pattern.charAt(j)){
                    break;
                }
            }
            if(j==patternLength){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String text=sc.nextLine();
        String pattern=sc.nextLine();
        if(hasSubstring(text, pattern)){
            System.out.println("Substring found!");
        }else{
            System.out.println("Substring not found.");
        }
    }
}}
