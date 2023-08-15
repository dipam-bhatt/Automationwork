package Basic;

import java.util.Scanner;

class A{
	public void call() {
		System.out.println("hello call function");
	}
}
public class Userinput {
	public static void main(String[] args) {
		A obj = new A();
		obj.call();
		//here ln is for new line
		System.out.println("hello");
		System.out.println("hello again");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a = ");
		int a = sc.nextInt();
		System.out.println("enter b = ");
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("c = "+c);
		System.out.println("enter double value = ");
		double d = sc.nextDouble();
		System.out.println(d);


}
}

