package Assignment1;

import java.util.ArrayList;

// WAP to iterate through all elements in an array list

import java.util.Arrays;
import java.util.List;

public class MultipleArrayQue {
	public static void main(String[] args) {
		List<Integer> name = Arrays.asList(1,2,4,6,8,3,2);
		for (int i=0; i<name.size();i++) {
			System.out.println(name.get(i) + "  ");
		}
		
		// WAP to update specific array element by given element
		
		ArrayList<String> names = new ArrayList<String>();
		names.add("Samsung");
		names.add("Oneplus");
		names.add("Oppo");
		
		names.set(1, "Apple");
		
		for(String name: names) {
			System.out.println(name);
		}
		
		
		// WAP to remove the third element from a array list
		
		ArrayList<String> names = new ArrayList<String>();
		  names.add("Samsung");
			names.add("oneplus");
			names.add("vivo");
			names.add("oppo");
			names.add("Apple");
			
			
			names.remove("oppo");
			
			System.out.println(names);
			
			// WAP to Copy one array into another
			int[] a = {5,8,9,2,1};
			int[] b = new int[a.length];
			b=a;
			b[0]++;
			
			System.out.println("Array of a[] ");
			for(int i=0;i<a.length;i++) 
				System.out.println(a[i] + " ");
		    System.out.println("Array of b[] ");
		    for(int i1=0;i1<b.length;i1++) 
		    	System.out.println(b[i1] + " ");
		    
		    // WAP to reverse an array of integer values
		    int [] arr =new int[] {4,5,7,6,8};
			System.out.println("real array");
			int i;
			for (i=0; i<arr.length;i++){
			System.out.print(arr[i]+ " ");
			}
			System.out.println();
			System.out.println("reverse array");
			for (i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+ " ");
			}
		
			
			// WAP to find the second largest element in an array
			int [] array= {12,88,96,41,74,32};
			int size =array.length;
			Arrays.sort(array);
			System.out.println("sort Array:" +Arrays.toString(array));
			int dp = array[size-2];
			System.out.println("2nd largest element : "+dp);
			
			
	}

}
