package day4;

public class que1 {
   // public class ques {
//     public static void main(String[] args) {
//         Car c1=new Car("Honda Civic",2022);
//         Car c2=new Car("Apache",2021);
//         c1.display();
//         c2.display();
//     }
// }
// class Car{
//     String model;
//     int year;
//     static int numberOfcar=0;
//     Car(String model,int year){
//         this.model=model;
//         this.year=year;
//         numberOfcar++;
//     }
//     void display(){
//         System.out.println("model:"+model+"year: "+year);
//         System.out.println("total cars:"+numberOfcar);
//     }
// }



import java.util.*;
public  class Str{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
//      QUESTION 1
//        String s1= sc.nextLine();
//        String s2=sc.nextLine();
        // Case Sensitive
        // if(s1.equals(s2)){
        //     System.out.println("equale string");
        // }
        // else{
        //     System.out.println("Not Equal");
        // }

        // Case Insensitive
//        if(s1.toUpperCase().equals(s2.toUpperCase())){
//            System.out.println("equale string");
//        }
//        else{
//            System.out.println("Not Equal");
//        }
        
		
//		question 2
//		
        
		
//		Question 3
// 		String s=sc.nextLine();
// 		int count=0;
// 		for(char i:s.toCharArray()) {
// 			if(i=='a'||i=='e' || i=='i'|| i=='o'|| i=='u'|| i=='A'||i=='E' || i=='I'|| i=='O'|| i=='U') {
// 				count++;
// 			}
// 		}
//        System.out.println(count+" vowels");
        
//        Find the length of string without using length()
// 		String s=sc.nextLine();
		// int length=0;
		// for(char i:s.toCharArray()) {
		// 	length=length+1;
		// }
		// System.out.print(length+" length");
			
//		Check if a string is a palindrome.
// 		String s=sc.next();
// 		boolean isPalindrome=true;
// 		int left=0;
// 		int right=s.length()-1;
// 		while(left<right) {
// 			if(s.charAt(left)!=s.charAt(right)) {
// 				isPalindrome=false;
// 				break;
// 			}
// 			left++;
// 			right--;
// 		}
// 		if(isPalindrome) {
// 			System.out.print(true);
// 		}
// 		else {
// 			System.out.print(false);
// 		}
		
// 		Find the first non-repeating character in a string.

//		String s=sc.next();
//		int freq[]=new int[256];
//		for(int i=0;i<s.length();i++) {
//			freq[s.charAt(i)]++;
//		}
//		for(int i=0;i<s.length();i++) {
//			if(freq[s.charAt(i)]==1) {
//				System.out.print("first non repeating number is:"+s.charAt(i));
//				return;
//			}
//		}
//		System.out.print("No repeating character");
		
//		Q6.Count the number of words in a string (use StringTokenizer).
//		String s=sc.nextLine();
//		StringTokenizer token=new StringTokenizer(s);
//		int count=token.countTokens();
//		System.out.print("number of words "+count);
		
//		Q7.Replace all spaces with hyphens in a string.
//		String s=sc.nextLine();
//		String res=s.replace(" ","-");
//		System.out.print(res);
		
//		Q8.Find the ASCII value of each character in a string.
//		String s=sc.nextLine();
//		for(int i=0;i<s.length();i++) {
//			char c=s.charAt(i);
//			int ascii=(int)c;
//			System.out.println(s.charAt(i)+" ascii value is "+ascii);
//		}

//		import java.util.Arrays;

 public class Str{
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT anagrams.");
        }
    }

    public static boolean isAnagram(String s1, String s2) {
       
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

       
        if (s1.length() != s2.length()) {
            return false;
        }
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}

                 

// 		String s=sc.next();
		
//         sc.close();

	}

} 
}
