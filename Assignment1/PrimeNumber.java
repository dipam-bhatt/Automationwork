package Assignment1;

//WAP to compute the sum of the first 100 prime numbers


import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 System.out.println("Given number is prime or not");
	   	   int n1,count=0;
	   	   n1 = sc.nextInt();
	   	   for(int i1=1;i1<=n1;i1++) {
	   	       if(n1%i1==0) {
	   	       count++;	
	   	    	}
	   	    }
	   	    if(count==2) {
	   	    	System.out.println("Number is prime");}
	   	    else {
	   	    		System.out.println("Number is not prime");
	   	    	}
	}

}
