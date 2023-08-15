package Assignment1;

// WAP to find the index of an array element

public class IndexArray {
	public static void main(String[] args) {
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
	}

}
