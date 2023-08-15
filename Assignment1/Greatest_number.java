package Assignment1;

import java.util.Scanner;

//W.A.J.P to Take three numbers from the user and print the greatest number.


public class Greatest_number {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		System.out.println("enter number");
        a = sc.nextInt();
        System.out.println("enter number");
        b = sc.nextInt();
        System.out.println("enter number");
        c= sc.nextInt();
       
         if (a>b && a>c)
         {
        	 System.out.println("Greatest number:" +a);
         }
          if (b>c && b>a)
         { 
        	 System.out.println("Greatest number:" +b);
        	 
         }
         else
         System.out.println("Greatest number:"  +c);
	}

}
