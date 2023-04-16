package operations;

import java.util.Arrays;


public class Copyoperations {

	public static void main(String[] args) { 
		int arr[]= {10,20,30,40,50};
		//using Arrays.copyof();
		int brr[]=Arrays.copyOf(arr, arr.length);
	 System.out.println(Arrays.toString(brr));
	 
	int brr1[]=new int[arr.length];
	for (int i=0;i<arr.length;i++) {
		brr1[i]=arr[i];
	}
	for (int i=0;i<arr.length;i++) {
		System.out.print(brr1[i]+" ");
	}
	}

}
