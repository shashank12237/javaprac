package operations;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Maximum {

	static int maxi=0;
	
	public static int largest(int arr[]) {
		maxi=arr[0];
		for(int i =0;i<arr.length;i++) {
			if(arr[i]>maxi)
			{
				maxi=arr[i];
			}
		}
		return maxi;
		
	}
	// REVRESE
	public static void reverse(int arr[]) {
		int y=arr.length;
		int x=y;
		 int b[]=new int[x];
		for(int i=0;i<y;i++) {
//			b[x-1]=arr[i];
//			x=x-1;
			b[i]=arr[y-1-i];
			
		}
		System.out.println("The reverse order is ");
		for(int k=0;k<y;k++) {
			System.out.print(b[k]+" ");
		}
		System.out.println();
}
		// REVERSE USING COLLEXCTIONS
	public static void reverse_collection(Integer arr[]) {
		Collections.reverse(Arrays.asList(arr));
		System.out.println(" reverse using collections");
		System.out.println(Arrays.toString(arr));
		//System.out.println(Arrays.asList(arr));
		/*
		 * Can't use cz gives error
		 * 
		 * Collections.swap(Arrays.asList(arr), 0, 3);
		   System.out.println(Arrays.toString(arr));
		 */
		
	}
	
	}

