package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

// WAP to demonstrate try catch block

public class TryCatchBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			int num = sc.nextInt();
			int num1 = sc.nextInt();
			int m = (num*num1);
			
			System.out.println(m);
			
		} catch (InputMismatchException e) {
			System.out.println("value should be numeric value");
		}
	}

}
