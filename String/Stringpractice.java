package String;

import java.util.Scanner;

//string-sequence of characters

public class Stringpractice {
	public static void main(String[] args) {
		System.out.println("hello string @#$");
		char name[]= {'J','A','V','A'};
		System.out.println(name);
		String s = "JAVA";
		System.out.println(s);
		String s1= "hello new java String";
		System.out.println(s1.length()); //to check length of string
		System.out.println(s1.charAt(20)); //to check charcter at index
		String s2 = "JAVA";
		String s3 = "JAVA";
		// strings equality check return ascii value
 		//string equality check return ascii value
		System.out.println(s2.compareToIgnoreCase(s3));
		// string equality check return boolean value
		System.out.println(s2.equals(s3));
		//string equality check return boolean value
		System.err.println(s2.equalsIgnoreCase(s3));
		
		System.out.println("-------");
		String s4= "      java      ";
		System.out.println(s4.isBlank()); //total string empty
		
		System.out.println(s4.isEmpty()); //will consider spaceas charcter
		
		System.out.println(s4.trim()); //remove before & after string space
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter string : ");
		
		String user = sc.nextLine(); //strong user input
		
		System.out.println(user);
		System.out.println("enter character : ");
		char c = sc.next().charAt(0); // take charcter user input
		System.out.println(c);
			
		
		
	}

}
