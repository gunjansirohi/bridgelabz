import java.util.Scanner;

public class que2 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
		StringBuilder res=new StringBuilder();
		for(char i:s.toCharArray()) {
			if(i>='a' && i<='z') {
				i=(char)(i-32);
			}
			res.append(i);
		}
       System.out.print(res);
}}
