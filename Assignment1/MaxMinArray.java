package Assignment1;

import java.util.Arrays;

// WAP to find the maximum and minimum value of an array

public class MaxMinArray {
	public static void main(String[] args) {
		int a[]= {8,55,61,98,10,100,25};
		Arrays.sort(a);
		
		System.out.println("min " + a[0]+"\nmax " + a[6]);
	}

}
