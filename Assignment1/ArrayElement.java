package Assignment1;

// WAP to calculate the average value of array elements

public class ArrayElement {
	public static void main(String[] args) {
		double[]arr=  {18,25,64,87,73};
		double length = arr.length;
		double sum=0;
		for(int i1=0; i1<length; i1++){
		sum= sum + arr[i1];
		}
		System.out.println(sum);
		double average = sum / length;
		System.out.println("average value of the array element is : " + average);
		
	}

}
