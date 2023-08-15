package Assignment1;

// W.A.J.P to find factorial for Given Number

import java.util.Scanner;

public class FactorialNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Find factorial number for given number");
   	    n = sc.nextInt();
   	    int f = 1 ;
   	    for(int b=1;b<=n;b++) {
   	    f = f*b;
   	    System.out.println("f = "+f);
   	    }
	}

}
