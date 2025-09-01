package day4;
import java.util.*;
public class que3 {
    Scanner sc=new
    String s=sc.nextLine();
		int count=0;
		for(char i:s.toCharArray()) {
			if(i=='a'||i=='e' || i=='i'|| i=='o'|| i=='u'|| i=='A'||i=='E' || i=='I'|| i=='O'|| i=='U') {
				count++;
			}
		}
       System.out.println(count+" vowels");
        
}
