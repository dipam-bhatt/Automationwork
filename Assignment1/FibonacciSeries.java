package Assignment1;

//W.A.J.P for create Fibonacci Series

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		  int f=1, u=0, n,  sum=1;
	   	   n=sc.nextInt();
	   	   while (sum<=n) {
	   		     System.out.println(sum);
	   		     f=u;
	   		     u=sum;
	   		     sum=f+u;
	   	   }
	}

}
