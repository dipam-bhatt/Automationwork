package Assignment1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MulticatchBlock {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("enter num = ");
			int num = sc.nextInt();
			System.out.println("enter num1 = ");
			int num1 = sc.nextInt();
			int d = (num/num1);
			System.out.println(d);
		} catch (ArithmeticException e) {
			System.out.println("denominator cannot be zero");
		}
		catch (InputMismatchException e) {
			System.out.println("denominator should be numeric value");
		}
		catch (Exception e) {
			System.out.println("error");
		}
	}

}
