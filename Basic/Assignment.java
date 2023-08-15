package Basic;

import java.util.*;

import exception.exception;



//W.A.J.P to Take three numbers from the user and print the greatest number.
public class Assignment {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a,b,c;
		System.out.println("enter number");
        a = sc.nextInt();
        System.out.println("enter number");
        b = sc.nextInt();
        System.out.println("enter number");
        c= sc.nextInt();
       
         if (a>b)
         if (a>c)
         {
        	 System.out.println("Greatest number:" +a);
         }
         else if (b>c && b>a)
         { 
        	 System.out.println("Greatest number:" +b);
        	 
         }
         else
         System.out.println("Greatest number:"  +c);
         
		
  	



//WAP to compute the sum of the first 100 prime numbers
 int counter, sum=0;
  for (int num=1;num<=100;num++)
  {
  counter=0;
	  for (int i= 2; i<= num/2; i++)
	  {
		  //check for prime number
		  if(num %i ==0)
		  {
	 counter++;
	 break;
		  }
	  }
//	  //calculates the sum of prime number
//	  if(counter ==0 && num!=1)
//	  {
//		  
//		  sum= sum + num;
//	  }
//  }
//  
//  System.out.println("the sum of prime number: " + sum);
		
		//WAP to sum values of an array.
  
  int arr[]= {1,2,3,4,5,6};
   int sum = 0;
   
   for (int i : arr)
	   sum +=i;
   System.out.println("the sum is " + sum);
		
		//WAP to calculate the average value of array elements
		
//		double[]arr=  {18,25,64,87,73};
//		double length = arr.length;
//		double sum=0;
//		for(int i1=0; i1<length; i1++){
//		sum= sum + arr[i1];
//		}
//		System.out.println(sum);
//		double average = sum / length;
//		System.out.println("average value of the array element is : " + average);
//		
			
		
		
		//WAP to find the index of an array element
		
	int[] arr = {15,35,50,2,90};
		int element= 50;
		int index= -1;
		
		int i=0;
		while(i<arr.length) {
			if(arr[i] == element) {
				index=i;
				break;
			}
			i++;
		}
   System.out.println("index of " + element+ " is :" +index);
		
//   to find the maximum and minimum value of an array
		int a[]= {8,55,61,98,10,100,25};
		Arrays.sort(a);
		
		System.out.println("min " + a[0]+"\nmax " + a[6]);
		
		
		//WAP to Compare Two String.
		String a = "dipam";
        String b = "dipam";

        if(a.equals(b)){
            System.out.println("Both strings are equal.");
        } else {
            System.out.println("Both strings are not equal.");
        }
//		WAP to concatenate a given string to the end of another string
		
//		String d = "avenger end game + ";
//		String t = "proof that tony stark has heart";
//		System.out.println(d+t);
		
		// WAP to demonstrate try catch block
		try {
			int num = sc.nextInt();
			int num1 = sc.nextInt();
			int m = (num*num1);
			
			System.out.println(m);
			
		} catch (InputMismatchException e) {
			System.out.println("value should be numeric value");
		}
	
//		to demonstrate multiple catch blocks
		
//		try {
//			System.out.println("enter num = ");
//			int num = sc.nextInt();
//			System.out.println("enter num1 = ");
//			int num1 = sc.nextInt();
//			int d = (num/num1);
//			System.out.println(d);
//			
//		} catch (ArithmeticException e) {
//			System.out.println("denominator cannot be zero");
//		}
//		catch (InputMismatchException e) {
//			System.out.println("denominator should be numeric value");
//		}
//		catch (Exception e) {
//			System.out.println("error");
//		}
		
		// WAP to demonstrate multiple catch blocks
		
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
		
//		WAP to create one thread by implementing Runnable interface in Class
		
//		WAP to iterate through all elements in an array list
		
	List<Integer> name = Arrays.asList(1,2,4,6,8,3,2);
		for (int i=0; i<name.size();i++) {
			System.out.println(name.get(i) + "  ");
		}
		
		
//		WAP to update specific array element by given element
		
//		ArrayList<String> names = new ArrayList<String>();
//		names.add("Samsung");
//		names.add("Oneplus");
//		names.add("Oppo");
//		
//		names.set(1, "Apple");
//		
//		for(String name: names) {
//			System.out.println(name);
//		}
		
		
		//WAP to remove the third element from a array list
		
//		ArrayList<String> names = new ArrayList<String>();
	//  names.add("Samsung");
//		names.add("oneplus");
//		names.add("vivo");
//		names.add("oppo");
//		names.add("Apple");
//		
//		
//		names.remove("oppo");
//		
//		System.out.println(names);
		
		//WAP to Copy one array into another
//		
//		int[] a = {5,8,9,2,1};
//		int[] b = new int[a.length];
//		b=a;
//		b[0]++;
//		
//		System.out.println("Array of a[] ");
//		for(int i=0;i<a.length;i++) 
//			System.out.println(a[i] + " ");
//	    System.out.println("Array of b[] ");
//	    for(int i1=0;i1<b.length;i1++) 
//	    	System.out.println(b[i1] + " ");
	    
		//WAP to reverse an array of integer values
//		int [] arr =new int[] {4,5,7,6,8};
//		System.out.println("real array");
//		int i;
//		for (i=0; i<arr.length;i++){
//		System.out.print(arr[i]+ " ");
//		}
//		System.out.println();
//		System.out.println("reverse array");
//		for (i=arr.length-1;i>=0;i--) {
//			System.out.print(arr[i]+ " ");
//		}
		
		//WAP to find the second largest element in an array
//		int [] array= {12,88,96,41,74,32};
//		int size =array.length;
//		Arrays.sort(array);
//		System.out.println("sort Array:" +Arrays.toString(array));
//		int dp = array[size-2];
//		System.out.println("2nd largest element : "+dp);
		
//		//W.A.J.P. Create an abstract class 'Parent' with a method 'message'. It has two subclasses each having a method with the same name
//		'message' that prints "This is first subclass" and "This is second subclass" respectively.
//		Call the methods 'message' by creating an object for each subclass.

		
		
//		W.A.J.P. which will ask the user to enter his/her marks (out of 100). Define a method that will display grades according to the marks entered as below:
//			Marks Grade
//			91-100 AA
//			81-90 AB
//			71-80 BB
//			61-70 BC
//			51-60 CD
//			41-50 DD
//			<=40 Fail
		
//		System.out.println("enter marks : ");
//		int marks = sc.nextInt();
//		if(marks <= 40) {
//			System.out.println("fail");
//		}else if (marks>=41 && marks <=50) {
//			System.out.println("DD");
//		}else if (marks>=51 && marks <=60) {
//			System.out.println("CD");
//		}else if (marks>=61 && marks <=70) {
//		System.out.println("BC");
//		}else if (marks>=71 && marks <=80) {
//			System.out.println("BB");
//		}else if (marks>=81 && marks <=90) {
//			System.out.println("AB");
//		}else if (marks>=91 && marks <=100) {
//			System.out.println("AA");
//		}else {
//			System.out.println("invalid input");
//		}
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	  
	  



