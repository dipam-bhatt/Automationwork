package Basic;

import java.util.Scanner;

public class Table {

	     public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("enter num to print table : ");
		  int num = sc.nextInt();
		  int s = 1;
		  while(s<=10) {
			  System.out.println(num+" x "+s+" = "+(num*s));
			  s++;
		  }
	      System.out.println("do while loop");
	      int a = sc.nextInt();
	      int d = 1;
	      do {
	    	  System.out.println(a+" x "+d+" = "+(a*d));
	    	  d++;
	    	
	      }
	      while(d<=10);
		}
	}

